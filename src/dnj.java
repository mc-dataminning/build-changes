import java.util.List;
import java.util.function.Predicate;

public class dnj<T> implements dns<T> {
   private final io<T> a;

   public dnj(io<T> $$0) {
      this.a = $$0;
   }

   public static <A> dns<A> a(int $$0, io<A> $$1, dnt<A> $$2, List<A> $$3) {
      return new dnj<>($$1);
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
         throw new dnr($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(uq $$0) {
   }

   @Override
   public void b(uq $$0) {
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
   public dns<T> c() {
      return this;
   }
}
