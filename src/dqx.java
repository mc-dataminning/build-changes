import com.mojang.serialization.MapCodec;

public class dqx extends dlu {
   public static final MapCodec<dqx> a = b(dqx::new);
   private static final feq b = dlu.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return fen.b();
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.b();
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return 0.2F;
   }
}
