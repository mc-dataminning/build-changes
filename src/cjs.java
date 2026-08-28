import java.util.List;

public class cjs extends cjz {
   public static final float b = bta.D.l() / bta.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cjs(bta<? extends cjs> $$0, dby $$1) {
      super($$0, $$1);
      this.fU();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buw.a s() {
      return cjz.gq().a(bux.r, 0.3F).a(bux.c, 8.0).a(bux.q, 80.0);
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
   protected avz d(brn $$0) {
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
         bsc $$0 = new bsc(bse.d, 6000, 2);
         List<arg> $$1 = bsd.a((arf)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adp(adp.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dp(), 16);
      }
   }
}
