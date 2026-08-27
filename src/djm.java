import java.util.List;
import java.util.function.Predicate;

public class djm<T> implements djv<T> {
   private final ih<T> a;

   public djm(ih<T> $$0) {
      this.a = $$0;
   }

   public static <A> djv<A> a(int $$0, ih<A> $$1, djw<A> $$2, List<A> $$3) {
      return new djm<>($$1);
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
         throw new dju($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(tu $$0) {
   }

   @Override
   public void b(tu $$0) {
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
   public djv<T> c() {
      return this;
   }
}
