import java.util.List;
import java.util.function.Predicate;

public class ecx<T> implements edg<T> {
   private final jk<T> a;

   public ecx(jk<T> $$0) {
      this.a = $$0;
   }

   public static <A> edg<A> a(int $$0, jk<A> $$1, edh<A> $$2, List<A> $$3) {
      return new ecx<>($$1);
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
         throw new edf($$0);
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
   public edg<T> a(edh<T> $$0) {
      return this;
   }
}
