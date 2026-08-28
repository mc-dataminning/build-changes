import java.util.List;
import java.util.function.Predicate;

public interface dxa<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(wa var1);

   void b(wa var1);

   int a();

   int b();

   dxa<T> a(dxb<T> var1);

   public interface a {
      <A> dxa<A> create(int var1, js<A> var2, dxb<A> var3, List<A> var4);
   }
}
