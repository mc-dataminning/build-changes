import java.util.function.Function;

public class epv<T> implements epm<T> {
   private final Function<hz, ept<T>> a;

   public epv(Function<hz, ept<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(epq<T> $$0) {
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
