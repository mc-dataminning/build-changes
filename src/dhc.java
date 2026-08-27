import java.util.List;
import java.util.function.Predicate;

public class dhc<T> implements dhl<T> {
   private final hk<T> a;

   public dhc(hk<T> $$0) {
      this.a = $$0;
   }

   public static <A> dhl<A> a(int $$0, hk<A> $$1, dhm<A> $$2, List<A> $$3) {
      return new dhc<>($$1);
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
         throw new dhk($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(sh $$0) {
   }

   @Override
   public void b(sh $$0) {
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
   public dhl<T> c() {
      return this;
   }
}
