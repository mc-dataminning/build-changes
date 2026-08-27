import java.util.List;
import java.util.function.Predicate;

public class dle<T> implements dln<T> {
   private final im<T> a;

   public dle(im<T> $$0) {
      this.a = $$0;
   }

   public static <A> dln<A> a(int $$0, im<A> $$1, dlo<A> $$2, List<A> $$3) {
      return new dle<>($$1);
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
         throw new dlm($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ug $$0) {
   }

   @Override
   public void b(ug $$0) {
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
   public dln<T> c() {
      return this;
   }
}
