import java.util.List;
import java.util.function.Predicate;

public class dzq<T> implements dzz<T> {
   private final jv<T> a;

   public dzq(jv<T> $$0) {
      this.a = $$0;
   }

   public static <A> dzz<A> a(int $$0, jv<A> $$1, eaa<A> $$2, List<A> $$3) {
      return new dzq<>($$1);
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
         throw new dzy($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wh $$0) {
   }

   @Override
   public void b(wh $$0) {
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
   public dzz<T> a(eaa<T> $$0) {
      return this;
   }
}
