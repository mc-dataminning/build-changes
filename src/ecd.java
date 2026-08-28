import java.util.List;
import java.util.function.Predicate;

public class ecd<T> implements ecm<T> {
   private final jj<T> a;

   public ecd(jj<T> $$0) {
      this.a = $$0;
   }

   public static <A> ecm<A> a(int $$0, jj<A> $$1, ecn<A> $$2, List<A> $$3) {
      return new ecd<>($$1);
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
         throw new ecl($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public void b(vu $$0) {
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return this.a.d();
   }

   @Override
   public ecm<T> a(ecn<T> $$0) {
      return this;
   }
}
