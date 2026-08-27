import java.util.List;
import java.util.function.Predicate;

public class dpf<T> implements dpo<T> {
   private final iq<T> a;

   public dpf(iq<T> $$0) {
      this.a = $$0;
   }

   public static <A> dpo<A> a(int $$0, iq<A> $$1, dpp<A> $$2, List<A> $$3) {
      return new dpf<>($$1);
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
         throw new dpn($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(uu $$0) {
   }

   @Override
   public void b(uu $$0) {
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
   public dpo<T> c() {
      return this;
   }
}
