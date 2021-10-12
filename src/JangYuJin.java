//22000630 장유진
import java.util.Scanner ;
public class JangYuJin {
	public static void main(String[] args) {
		String name ;
		String university ;
		int Id ;
		
		Scanner s = new Scanner(System.in) ;
		System.out.print("Name : ") ;
		name = s.next() ;
		System.out.print("University : ");
		s.nextLine() ; //개행문자 제거
		university = s.nextLine() ;
		System.out.print("Student Number ");
		Id = s.nextInt() ;
	}
}
