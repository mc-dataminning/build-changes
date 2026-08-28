import java.util.List;
import java.util.function.Predicate;

public class eaq<T> implements eaz<T> {
   private final jx<T> a;

   public eaq(jx<T> $$0) {
      this.a = $$0;
   }

   public static <A> eaz<A> a(int $$0, jx<A> $$1, eba<A> $$2, List<A> $$3) {
      return new eaq<>($$1);
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
         throw new eay($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vr $$0) {
   }

   @Override
   public void b(vr $$0) {
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
   public eaz<T> a(eba<T> $$0) {
      return this;
   }
}
