import java.util.List;
import java.util.function.Predicate;

public class djr<T> implements dka<T> {
   private final il<T> a;

   public djr(il<T> $$0) {
      this.a = $$0;
   }

   public static <A> dka<A> a(int $$0, il<A> $$1, dkb<A> $$2, List<A> $$3) {
      return new djr<>($$1);
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
         throw new djz($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ty $$0) {
   }

   @Override
   public void b(ty $$0) {
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
   public dka<T> c() {
      return this;
   }
}
