import java.util.List;

public class cit extends cja {
   public static final float b = bsc.D.l() / bsc.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cit(bsc<? extends cit> $$0, daz $$1) {
      super($$0, $$1);
      this.fT();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static btx.a s() {
      return cja.gp().a(bty.r, 0.3F).a(bty.c, 8.0).a(bty.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avh v() {
      return this.bh() ? avi.hO : avi.hP;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.bh() ? avi.hU : avi.hV;
   }

   @Override
   protected avh o_() {
      return this.bh() ? avi.hR : avi.hS;
   }

   @Override
   protected avh y() {
      return avi.hT;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ai + this.al()) % 1200 == 0) {
         bre $$0 = new bre(brg.d, 6000, 2);
         List<aqo> $$1 = brf.a((aqn)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new acx(acx.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dp(), 16);
      }
   }
}
