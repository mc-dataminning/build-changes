import java.util.function.Function;

public class fbe<T> implements fav<T> {
   private final Function<jg, fbc<T>> a;

   public fbe(Function<jg, fbc<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jg $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(faz<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(jg $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
