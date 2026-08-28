import java.util.List;
import java.util.function.Predicate;

public class dvd<T> implements dvm<T> {
   private final jr<T> a;

   public dvd(jr<T> $$0) {
      this.a = $$0;
   }

   public static <A> dvm<A> a(int $$0, jr<A> $$1, dvn<A> $$2, List<A> $$3) {
      return new dvd<>($$1);
   }

   @Override
   public int a(T $$0) {
      int $$1 = this.a.a($$0);
      return $$1 == -1 ? 0 : $$1;
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      return true;
   }

   @Override
   public T a(int $$0) {
      T $$1 = this.a.a($$0);
      if ($$1 == null) {
         throw new dvl($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vv $$0) {
   }

   @Override
   public void b(vv $$0) {
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return this.a.c();
   }

   @Override
   public dvm<T> c() {
      return this;
   }
}
