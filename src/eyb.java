import java.util.function.Function;

public class eyb<T> implements exs<T> {
   private final Function<ja, exz<T>> a;

   public eyb(Function<ja, exz<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exw<T> $$0) {
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
