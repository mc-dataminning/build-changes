import java.util.function.Function;

public class fcx<T> implements fco<T> {
   private final Function<ji, fcv<T>> a;

   public fcx(Function<ji, fcv<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fcs<T> $$0) {
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
