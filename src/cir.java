import java.util.List;

public class cir extends ciy {
   public static final float b = bsa.D.l() / bsa.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cir(bsa<? extends cir> $$0, dax $$1) {
      super($$0, $$1);
      this.fT();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static btv.a s() {
      return ciy.gp().a(btw.r, 0.3F).a(btw.c, 8.0).a(btw.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avg v() {
      return this.bh() ? avh.hO : avh.hP;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.bh() ? avh.hU : avh.hV;
   }

   @Override
   protected avg o_() {
      return this.bh() ? avh.hR : avh.hS;
   }

   @Override
   protected avg y() {
      return avh.hT;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ai + this.al()) % 1200 == 0) {
         brc $$0 = new brc(bre.d, 6000, 2);
         List<aqn> $$1 = brd.a((aqm)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new acx(acx.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dp(), 16);
      }
   }
}
