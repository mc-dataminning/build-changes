import java.util.function.Function;

public class exo<T> implements exf<T> {
   private final Function<iz, exm<T>> a;

   public exo(Function<iz, exm<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exj<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iz $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
