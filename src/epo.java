import java.util.function.Function;

public class epo<T> implements epf<T> {
   private final Function<hz, epm<T>> a;

   public epo(Function<hz, epm<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(epj<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(hz $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
