import java.util.List;
import java.util.function.Predicate;

public interface dlt<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(ui var1);

   void b(ui var1);

   int a();

   int b();

   dlt<T> c();

   public interface a {
      <A> dlt<A> create(int var1, im<A> var2, dlu<A> var3, List<A> var4);
   }
}
