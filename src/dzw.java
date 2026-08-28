import java.util.List;
import java.util.function.Predicate;

public class dzw<T> implements eaf<T> {
   private final jv<T> a;

   public dzw(jv<T> $$0) {
      this.a = $$0;
   }

   public static <A> eaf<A> a(int $$0, jv<A> $$1, eag<A> $$2, List<A> $$3) {
      return new dzw<>($$1);
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
         throw new eae($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ws $$0) {
   }

   @Override
   public void b(ws $$0) {
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
   public eaf<T> a(eag<T> $$0) {
      return this;
   }
}
