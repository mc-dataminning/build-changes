import java.util.List;
import java.util.function.Predicate;

public interface dut<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(vr var1);

   void b(vr var1);

   int a();

   int b();

   dut<T> c();

   public interface a {
      <A> dut<A> create(int var1, jo<A> var2, duu<A> var3, List<A> var4);
   }
}
