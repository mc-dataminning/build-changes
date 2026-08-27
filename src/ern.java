import java.util.function.Function;

public class ern<T> implements ere<T> {
   private final Function<ib, erl<T>> a;

   public ern(Function<ib, erl<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eri<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ib $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
