import java.util.function.Function;

public class fcy<T> implements fcp<T> {
   private final Function<ji, fcw<T>> a;

   public fcy(Function<ji, fcw<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fct<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ji $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
