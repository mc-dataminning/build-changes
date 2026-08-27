import java.util.function.Function;

public class eyq<T> implements eyh<T> {
   private final Function<ir, eyo<T>> a;

   public eyq(Function<ir, eyo<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ir $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eyl<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ir $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
