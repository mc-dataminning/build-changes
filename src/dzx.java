import java.util.List;
import java.util.function.Predicate;

public class dzx<T> implements eag<T> {
   private final jv<T> a;

   public dzx(jv<T> $$0) {
      this.a = $$0;
   }

   public static <A> eag<A> a(int $$0, jv<A> $$1, eah<A> $$2, List<A> $$3) {
      return new dzx<>($$1);
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
         throw new eaf($$0);
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
   public eag<T> a(eah<T> $$0) {
      return this;
   }
}
