import java.util.function.Function;

public class fbv<T> implements fbm<T> {
   private final Function<jh, fbt<T>> a;

   public fbv(Function<jh, fbt<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fbq<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(jh $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
