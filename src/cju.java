import java.util.List;

public class cju extends ckb {
   public static final float b = btc.D.l() / btc.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cju(btc<? extends cju> $$0, dca $$1) {
      super($$0, $$1);
      this.fU();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buy.a s() {
      return ckb.gq().a(buz.r, 0.3F).a(buz.c, 8.0).a(buz.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avz v() {
      return this.bh() ? awa.hO : awa.hP;
   }

   @Override
   protected avz d(brp $$0) {
      return this.bh() ? awa.hU : awa.hV;
   }

   @Override
   protected avz o_() {
      return this.bh() ? awa.hR : awa.hS;
   }

   @Override
   protected avz y() {
      return awa.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.al()) % 1200 == 0) {
         bse $$0 = new bse(bsg.d, 6000, 2);
         List<arg> $$1 = bsf.a((arf)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adp(adp.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dp(), 16);
      }
   }
}
