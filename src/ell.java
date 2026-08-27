import java.util.function.Function;

public class ell<T> implements elc<T> {
   private final Function<ht, elj<T>> a;

   public ell(Function<ht, elj<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(elg<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ht $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
