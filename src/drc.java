import java.util.List;
import java.util.function.Predicate;

public class drc<T> implements drl<T> {
   private final iq<T> a;

   public drc(iq<T> $$0) {
      this.a = $$0;
   }

   public static <A> drl<A> a(int $$0, iq<A> $$1, drm<A> $$2, List<A> $$3) {
      return new drc<>($$1);
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
         throw new drk($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vg $$0) {
   }

   @Override
   public void b(vg $$0) {
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
   public drl<T> c() {
      return this;
   }
}
