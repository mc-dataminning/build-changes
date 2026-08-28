import java.util.List;
import java.util.function.Predicate;

public class duh<T> implements duq<T> {
   private final jn<T> a;

   public duh(jn<T> $$0) {
      this.a = $$0;
   }

   public static <A> duq<A> a(int $$0, jn<A> $$1, dur<A> $$2, List<A> $$3) {
      return new duh<>($$1);
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
         throw new dup($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wm $$0) {
   }

   @Override
   public void b(wm $$0) {
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
   public duq<T> c() {
      return this;
   }
}
