import java.util.List;

public class cir extends ciy {
   public static final float b = bsb.F.k() / bsb.aa.k();
   private static final int e = 1200;
   private static final int ch = 50;
   private static final int ci = 6000;
   private static final int cj = 2;
   private static final int ck = 1200;

   public cir(bsb<? extends cir> $$0, dca $$1, boolean $$2) {
      super($$0, $$1, $$2);
      this.gc();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static cir a(bsb<? extends cir> $$0, dca $$1) {
      return new cir($$0, $$1, true);
   }

   public static cir b(bsb<? extends cir> $$0, dca $$1) {
      return new cir($$0, $$1, false);
   }

   public static btu.a r() {
      return ciy.gA().a(btv.r, 0.3F).a(btv.c, 8.0).a(btv.q, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected avn u() {
      if (this.gz()) {
         return this.bl() ? avo.hP : avo.hR;
      } else {
         return this.bl() ? avo.hO : avo.hQ;
      }
   }

   @Override
   protected avn d(bqt $$0) {
      if (this.gz()) {
         return this.bl() ? avo.ia : avo.ic;
      } else {
         return this.bl() ? avo.hZ : avo.ib;
      }
   }

   @Override
   protected avn n_() {
      if (this.gz()) {
         return this.bl() ? avo.hU : avo.hW;
      } else {
         return this.bl() ? avo.hT : avo.hV;
      }
   }

   @Override
   protected avn x() {
      return this.gz() ? avo.hY : avo.hX;
   }

   @Override
   protected void Y() {
      super.Y();
      if (!this.gz()) {
         if ((this.am + this.al()) % 1200 == 0) {
            brh $$0 = new brh(brj.d, 6000, 2);
            List<aqu> $$1 = bri.a((aqt)this.dU(), this, this.ds(), 50.0, $$0, 1200);
            $$1.forEach($$0x -> $$0x.d.b(new ade(ade.l, this.ba() ? 0.0F : 1.0F)));
         }

         if (!this.gj()) {
            this.a(this.du(), 16);
         }
      }
   }

   @Override
   protected double gy() {
      return -0.294;
   }
}
