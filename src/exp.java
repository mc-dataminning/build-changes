import java.util.function.Function;

public class exp<T> implements exg<T> {
   private final Function<iz, exn<T>> a;

   public exp(Function<iz, exn<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exk<T> $$0) {
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
