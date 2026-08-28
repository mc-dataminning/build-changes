import java.util.function.Function;

public class fer<T> implements fei<T> {
   private final Function<jj, fep<T>> a;

   public fer(Function<jj, fep<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jj $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fem<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(jj $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
