import com.mojang.serialization.MapCodec;

public abstract class djf extends dkm {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fcs h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fcs b = fcp.a(
      fcp.b(), fcp.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fcc.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends djf> a();

   public djf(dxu.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dxv $$0) {
      return 0.0;
   }

   protected boolean a(dxv $$0, jh $$1, bvk $$2) {
      return $$2.dD() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   public abstract boolean d(dxv var1);

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      jh $$4 = dqg.a((dhi)$$1, $$2);
      if ($$4 != null) {
         etw $$5 = dqg.a($$1, $$4);
         if ($$5 != ety.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(etw $$0) {
      return false;
   }

   protected void a(dxv $$0, dhi $$1, jh $$2, etw $$3) {
   }
}
