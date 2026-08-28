import java.util.List;
import java.util.function.Predicate;

public interface dxv<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(wf var1);

   void b(wf var1);

   int a();

   int b();

   dxv<T> a(dxw<T> var1);

   public interface a {
      <A> dxv<A> create(int var1, jv<A> var2, dxw<A> var3, List<A> var4);
   }
}
