import java.util.function.Function;

public class fcw<T> implements fcn<T> {
   private final Function<ji, fcu<T>> a;

   public fcw(Function<ji, fcu<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fcr<T> $$0) {
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
