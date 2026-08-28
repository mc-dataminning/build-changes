import java.util.List;
import java.util.function.Predicate;

public interface dvm<T> {
   int a(T var1);

   boolean a(Predicate<T> var1);

   T a(int var1);

   void a(vv var1);

   void b(vv var1);

   int a();

   int b();

   dvm<T> c();

   public interface a {
      <A> dvm<A> create(int var1, jr<A> var2, dvn<A> var3, List<A> var4);
   }
}
