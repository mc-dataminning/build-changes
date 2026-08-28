import java.util.List;
import java.util.function.Predicate;

public class dxg<T> implements dxp<T> {
   private final ju<T> a;

   public dxg(ju<T> $$0) {
      this.a = $$0;
   }

   public static <A> dxp<A> a(int $$0, ju<A> $$1, dxq<A> $$2, List<A> $$3) {
      return new dxg<>($$1);
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
         throw new dxo($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(we $$0) {
   }

   @Override
   public void b(we $$0) {
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
   public dxp<T> a(dxq<T> $$0) {
      return this;
   }
}
