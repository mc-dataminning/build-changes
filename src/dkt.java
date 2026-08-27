import java.util.List;
import java.util.function.Predicate;

public class dkt<T> implements dlc<T> {
   private final ik<T> a;

   public dkt(ik<T> $$0) {
      this.a = $$0;
   }

   public static <A> dlc<A> a(int $$0, ik<A> $$1, dld<A> $$2, List<A> $$3) {
      return new dkt<>($$1);
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
         throw new dlb($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ue $$0) {
   }

   @Override
   public void b(ue $$0) {
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
   public dlc<T> c() {
      return this;
   }
}
