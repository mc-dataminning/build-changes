import java.util.List;
import java.util.function.Predicate;

public class ecl<T> implements ecu<T> {
   private final jj<T> a;

   public ecl(jj<T> $$0) {
      this.a = $$0;
   }

   public static <A> ecu<A> a(int $$0, jj<A> $$1, ecv<A> $$2, List<A> $$3) {
      return new ecl<>($$1);
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
         throw new ect($$0);
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
   public ecu<T> a(ecv<T> $$0) {
      return this;
   }
}
