import java.util.function.Function;

public class fhn<T> implements fhe<T> {
   private final Function<iv, fhl<T>> a;

   public fhn(Function<iv, fhl<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fhi<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iv $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
