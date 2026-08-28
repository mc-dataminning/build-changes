import java.util.List;
import java.util.function.Predicate;

public class ebs<T> implements ecb<T> {
   private final jj<T> a;

   public ebs(jj<T> $$0) {
      this.a = $$0;
   }

   public static <A> ecb<A> a(int $$0, jj<A> $$1, ecc<A> $$2, List<A> $$3) {
      return new ebs<>($$1);
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
         throw new eca($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vs $$0) {
   }

   @Override
   public void b(vs $$0) {
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
   public ecb<T> a(ecc<T> $$0) {
      return this;
   }
}
