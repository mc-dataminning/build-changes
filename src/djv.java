import java.util.List;
import java.util.function.Predicate;

public interface djv<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(tu var1);

   void b(tu var1);

   int a();

   int b();

   djv<T> c();

   public interface a {
      <A> djv<A> create(int var1, ih<A> var2, djw<A> var3, List<A> var4);
   }
}
