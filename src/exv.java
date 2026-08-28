import java.util.function.Function;

public class exv<T> implements exm<T> {
   private final Function<ja, ext<T>> a;

   public exv(Function<ja, ext<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exq<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ja $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
