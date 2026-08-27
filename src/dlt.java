import java.util.List;
import java.util.function.Predicate;

public class dlt<T> implements dmc<T> {
   private final im<T> a;

   public dlt(im<T> $$0) {
      this.a = $$0;
   }

   public static <A> dmc<A> a(int $$0, im<A> $$1, dmd<A> $$2, List<A> $$3) {
      return new dlt<>($$1);
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
         throw new dmb($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(uj $$0) {
   }

   @Override
   public void b(uj $$0) {
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
   public dmc<T> c() {
      return this;
   }
}
