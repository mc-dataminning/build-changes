import java.util.function.Function;

public class eiv<T> implements eim<T> {
   private final Function<gu, eit<T>> a;

   public eiv(Function<gu, eit<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eiq<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(gu $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
