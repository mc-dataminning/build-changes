import java.util.function.Function;

public class elq<T> implements elh<T> {
   private final Function<hx, elo<T>> a;

   public elq(Function<hx, elo<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(ell<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(hx $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
