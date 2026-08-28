import java.util.function.Function;

public class fbo<T> implements fbf<T> {
   private final Function<jh, fbm<T>> a;

   public fbo(Function<jh, fbm<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fbj<T> $$0) {
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
