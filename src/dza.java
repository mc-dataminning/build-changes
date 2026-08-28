import java.util.List;
import java.util.function.Predicate;

public class dza<T> implements dzj<T> {
   private final jw<T> a;

   public dza(jw<T> $$0) {
      this.a = $$0;
   }

   public static <A> dzj<A> a(int $$0, jw<A> $$1, dzk<A> $$2, List<A> $$3) {
      return new dza<>($$1);
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
         throw new dzi($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vl $$0) {
   }

   @Override
   public void b(vl $$0) {
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
   public dzj<T> a(dzk<T> $$0) {
      return this;
   }
}
