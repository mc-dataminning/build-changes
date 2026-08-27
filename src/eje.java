import java.util.function.Function;

public class eje<T> implements eiv<T> {
   private final Function<gw, ejc<T>> a;

   public eje(Function<gw, ejc<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eiz<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(gw $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
