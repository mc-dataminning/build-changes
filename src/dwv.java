import java.util.List;
import java.util.function.Predicate;

public class dwv<T> implements dxe<T> {
   private final jt<T> a;

   public dwv(jt<T> $$0) {
      this.a = $$0;
   }

   public static <A> dxe<A> a(int $$0, jt<A> $$1, dxf<A> $$2, List<A> $$3) {
      return new dwv<>($$1);
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
         throw new dxd($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wb $$0) {
   }

   @Override
   public void b(wb $$0) {
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
   public dxe<T> a(dxf<T> $$0) {
      return this;
   }
}
