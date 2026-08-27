import java.util.function.Function;

public class eiz<T> implements eiq<T> {
   private final Function<gw, eix<T>> a;

   public eiz(Function<gw, eix<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eiu<T> $$0) {
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
