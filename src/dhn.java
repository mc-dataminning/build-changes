import java.util.List;
import java.util.function.Predicate;

public class dhn<T> implements dhw<T> {
   private final hl<T> a;

   public dhn(hl<T> $$0) {
      this.a = $$0;
   }

   public static <A> dhw<A> a(int $$0, hl<A> $$1, dhx<A> $$2, List<A> $$3) {
      return new dhn<>($$1);
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
         throw new dhv($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(so $$0) {
   }

   @Override
   public void b(so $$0) {
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
   public dhw<T> c() {
      return this;
   }
}
