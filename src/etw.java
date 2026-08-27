import java.util.function.Function;

public class etw<T> implements etn<T> {
   private final Function<ib, etu<T>> a;

   public etw(Function<ib, etu<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(etr<T> $$0) {
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
