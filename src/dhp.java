import java.util.List;
import java.util.function.Predicate;

public class dhp<T> implements dhy<T> {
   private final hl<T> a;

   public dhp(hl<T> $$0) {
      this.a = $$0;
   }

   public static <A> dhy<A> a(int $$0, hl<A> $$1, dhz<A> $$2, List<A> $$3) {
      return new dhp<>($$1);
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
         throw new dhx($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(sq $$0) {
   }

   @Override
   public void b(sq $$0) {
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
   public dhy<T> c() {
      return this;
   }
}
