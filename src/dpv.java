import com.mojang.serialization.MapCodec;

public class dpv extends dij {
   public static final MapCodec<dpv> a = b(dpv::new);
   protected static final fal b = dij.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return fai.b();
   }

   @Override
   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.b();
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dip.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.b && $$6.a(dil.G)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return 0.2F;
   }
}
