import com.mojang.serialization.MapCodec;

public class dsb extends dkm {
   public static final MapCodec<dsb> a = b(dsb::new);
   protected static final fcs b = dkm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return fcp.b();
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.b();
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dkt.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.b && $$6.a(dko.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 0.2F;
   }
}
