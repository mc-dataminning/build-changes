import java.util.List;
import java.util.function.Predicate;

public interface dtp<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(vx var1);

   void b(vx var1);

   int a();

   int b();

   dtp<T> c();

   public interface a {
      <A> dtp<A> create(int var1, jc<A> var2, dtq<A> var3, List<A> var4);
   }
}
