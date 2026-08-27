import java.util.List;
import java.util.function.Predicate;

public class drl<T> implements dru<T> {
   private final is<T> a;

   public drl(is<T> $$0) {
      this.a = $$0;
   }

   public static <A> dru<A> a(int $$0, is<A> $$1, drv<A> $$2, List<A> $$3) {
      return new drl<>($$1);
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
         throw new drt($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vi $$0) {
   }

   @Override
   public void b(vi $$0) {
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return this.a.b();
   }

   @Override
   public dru<T> c() {
      return this;
   }
}
