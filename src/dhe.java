import java.util.List;
import java.util.function.Predicate;

public class dhe<T> implements dhn<T> {
   private final hj<T> a;

   public dhe(hj<T> $$0) {
      this.a = $$0;
   }

   public static <A> dhn<A> a(int $$0, hj<A> $$1, dho<A> $$2, List<A> $$3) {
      return new dhe<>($$1);
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
         throw new dhm($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(si $$0) {
   }

   @Override
   public void b(si $$0) {
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
   public dhn<T> c() {
      return this;
   }
}
