import java.util.List;
import java.util.function.Predicate;

public class due<T> implements dun<T> {
   private final jn<T> a;

   public due(jn<T> $$0) {
      this.a = $$0;
   }

   public static <A> dun<A> a(int $$0, jn<A> $$1, duo<A> $$2, List<A> $$3) {
      return new due<>($$1);
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
         throw new dum($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wl $$0) {
   }

   @Override
   public void b(wl $$0) {
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
   public dun<T> c() {
      return this;
   }
}
