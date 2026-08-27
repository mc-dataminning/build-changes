import java.util.List;
import java.util.function.Predicate;

public interface dmc<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(uj var1);

   void b(uj var1);

   int a();

   int b();

   dmc<T> c();

   public interface a {
      <A> dmc<A> create(int var1, im<A> var2, dmd<A> var3, List<A> var4);
   }
}
