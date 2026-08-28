import java.util.List;

public class cjt extends cka {
   public static final float b = btb.D.l() / btb.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cjt(btb<? extends cjt> $$0, dbz $$1) {
      super($$0, $$1);
      this.fU();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bux.a s() {
      return cka.gq().a(buy.r, 0.3F).a(buy.c, 8.0).a(buy.q, 80.0);
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
   protected avz d(bro $$0) {
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
         bsd $$0 = new bsd(bsf.d, 6000, 2);
         List<arg> $$1 = bse.a((arf)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adp(adp.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dp(), 16);
      }
   }
}
