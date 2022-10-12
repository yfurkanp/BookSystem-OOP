package PracticeDay13_javaProjects.bookSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookStore {
	
	static List<Book> bookList	= new ArrayList<>();
	static Scanner scan=new Scanner(System.in);
	static int kitapNo=1000;
	/*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir

 */
	
  public static void main(String[] args) {
	  	
	  
	  
	  
	  
	  
	  menu();
		
		
		

	}
	
  public static void menu() {
	  System.out.println("======== Book System =========");
	  System.out.println(" 1.Add Book \n 2.Delete book with number \n 3.List all books \n 4.Finish");
	  select();
  }
  
  public static void select() {
	  System.out.println("Pls enter a choose : ");
	  int choose=scan.nextInt();
	  
	  switch (choose) {
	  case 1: {
		System.out.println("***Add book***");
		addBook(bookList);
		break;
		
	  }
	  case 2: {
			System.out.println("***Delete book***");
			deleteBook(bookList);
			break;
			
		  }
	  case 3: {
			System.out.println("***List book***");
			listBook(bookList);
			break;
			
		  }
	  case 4: {
			System.out.println("***Finish***");
			finish();	
			break;
			
		  }
	  default:
		System.out.println("You select wrong number pls try aagin");
		select();
	  }
}

  private static void listBook(List<Book> bookList2) {
	
	  System.out.println("Your Books****");
	  
	  for(int i=0;i<bookList2.size();i++) {
		  System.out.println(bookList2.get(i).toString());
	  }
	  
	  menu();
	
}

private static void deleteBook(List<Book> bookList2) {
	
	  System.out.println("PLs enter delete id : ");
	  int deleteNo=scan.nextInt();
	  
	  for(Book k:bookList2) {
		  if (k.getNo()==deleteNo) {
			bookList2.remove(k);
			menu();
		}
	  }
	  
	  System.out.println("I do not find this number's book ");
	  menu();
	  
	
}

private static void addBook(List<Book> bookList2) {
	
	
	System.out.println("Enter a book name : ");
	String bookName=scan.next();
	
	System.out.println("Enter a author name : ");
	String authorName=scan.next();
	
	System.out.println("Enter a year : ");
	int year=scan.nextInt();
	
	System.out.println("Enter a book's price : ");
	double price=scan.nextDouble();
	
	
	Book book=new Book(++kitapNo,bookName,authorName,year,price); // we create a book object
	bookList.add(book);
	
	System.out.println(" Book added "+book.toString());
	
	menu();
	
	
	
}

	private static void finish() {
		System.out.println("Bye Byeee");
	
	}

}
