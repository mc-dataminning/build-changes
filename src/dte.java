import java.util.List;
import java.util.function.Predicate;

public class dte<T> implements dtn<T> {
   private final jc<T> a;

   public dte(jc<T> $$0) {
      this.a = $$0;
   }

   public static <A> dtn<A> a(int $$0, jc<A> $$1, dto<A> $$2, List<A> $$3) {
      return new dte<>($$1);
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
         throw new dtm($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public void b(vx $$0) {
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
   public dtn<T> c() {
      return this;
   }
}
