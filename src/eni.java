import java.util.function.Function;

public class eni<T> implements emz<T> {
   private final Function<hx, eng<T>> a;

   public eni(Function<hx, eng<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(end<T> $$0) {
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
