import java.util.List;
import java.util.function.Predicate;

public class edu<T> implements eed<T> {
   private final jl<T> a;

   public edu(jl<T> $$0) {
      this.a = $$0;
   }

   public static <A> eed<A> a(int $$0, jl<A> $$1, eee<A> $$2, List<A> $$3) {
      return new edu<>($$1);
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
         throw new eec($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vy $$0) {
   }

   @Override
   public void b(vy $$0) {
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
   public eed<T> a(eee<T> $$0) {
      return this;
   }
}
