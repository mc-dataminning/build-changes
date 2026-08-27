import java.util.List;
import java.util.function.Predicate;

public class doi<T> implements dor<T> {
   private final iq<T> a;

   public doi(iq<T> $$0) {
      this.a = $$0;
   }

   public static <A> dor<A> a(int $$0, iq<A> $$1, dos<A> $$2, List<A> $$3) {
      return new doi<>($$1);
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
         throw new doq($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(us $$0) {
   }

   @Override
   public void b(us $$0) {
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
   public dor<T> c() {
      return this;
   }
}
