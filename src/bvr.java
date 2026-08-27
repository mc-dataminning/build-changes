import java.util.List;

public class bvr extends bvy {
   public static final float b = bfn.A.k() / bfn.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public bvr(bfn<? extends bvr> $$0, cmm $$1) {
      super($$0, $$1);
      this.fF();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bhf.a q() {
      return bvy.fY().a(bhg.d, 0.3F).a(bhg.f, 8.0).a(bhg.a, 80.0);
   }

   @Override
   public int r() {
      return 60;
   }

   @Override
   protected amg s() {
      return this.aY() ? amh.gH : amh.gI;
   }

   @Override
   protected amg d(ben $$0) {
      return this.aY() ? amh.gN : amh.gO;
   }

   @Override
   protected amg g_() {
      return this.aY() ? amh.gK : amh.gL;
   }

   @Override
   protected amg w() {
      return amh.gM;
   }

   @Override
   protected void W() {
      super.W();
      if ((this.ag + this.af()) % 1200 == 0) {
         bfa $$0 = new bfa(bfc.d, 6000, 2);
         List<aig> $$1 = bfb.a((aif)this.dI(), this, this.dg(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.a(new vx(vx.k, this.aQ() ? 0.0F : 1.0F)));
      }

      if (!this.fM()) {
         this.a(this.di(), 16);
      }
   }
}
