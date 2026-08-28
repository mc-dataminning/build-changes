import com.mojang.serialization.MapCodec;

public class dsj extends dke {
   public static final MapCodec<dsj> a = b(dsj::new);
   private static final fcr b = dke.a(6.0);

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   protected dsj(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return 1.0F;
   }
}
