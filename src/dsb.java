import java.util.List;
import java.util.function.Predicate;

public class dsb<T> implements dsk<T> {
   private final ja<T> a;

   public dsb(ja<T> $$0) {
      this.a = $$0;
   }

   public static <A> dsk<A> a(int $$0, ja<A> $$1, dsl<A> $$2, List<A> $$3) {
      return new dsb<>($$1);
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
         throw new dsj($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vs $$0) {
   }

   @Override
   public void b(vs $$0) {
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
   public dsk<T> c() {
      return this;
   }
}
