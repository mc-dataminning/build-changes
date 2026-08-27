import java.util.List;
import java.util.function.Predicate;

public interface dtn<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(vx var1);

   void b(vx var1);

   int a();

   int b();

   dtn<T> c();

   public interface a {
      <A> dtn<A> create(int var1, jc<A> var2, dto<A> var3, List<A> var4);
   }
}
