import java.util.function.Function;

public class exm<T> implements exd<T> {
   private final Function<iz, exk<T>> a;

   public exm(Function<iz, exk<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exh<T> $$0) {
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
