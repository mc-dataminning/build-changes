import com.mojang.serialization.MapCodec;

public class dqv extends dly {
   public static final MapCodec<dqv> b = b(dqv::new);

   protected dqv(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dqv> a() {
      return b;
   }

   @Override
   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.a();
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dvo $$0) {
      return true;
   }
}
