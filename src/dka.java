import java.util.List;
import java.util.function.Predicate;

public interface dka<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(ty var1);

   void b(ty var1);

   int a();

   int b();

   dka<T> c();

   public interface a {
      <A> dka<A> create(int var1, il<A> var2, dkb<A> var3, List<A> var4);
   }
}
