import java.util.List;

public class ckp extends ckw {
   public static final float b = btv.D.l() / btv.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public ckp(btv<? extends ckp> $$0, deg $$1) {
      super($$0, $$1);
      this.fW();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bvq.a q() {
      return ckw.gp().a(bvr.v, 0.3F).a(bvr.c, 8.0).a(bvr.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awd w() {
      return this.bl() ? awe.hP : awe.hQ;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.bl() ? awe.hV : awe.hW;
   }

   @Override
   protected awd n_() {
      return this.bl() ? awe.hS : awe.hT;
   }

   @Override
   protected awd y() {
      return awe.hU;
   }

   @Override
   protected void ad() {
      super.ad();
      if ((this.ag + this.ap()) % 1200 == 0) {
         bsv $$0 = new bsv(bsx.d, 6000, 2);
         List<ari> $$1 = bsw.a((arh)this.dS(), this, this.dq(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adg(adg.l, this.ba() ? 0.0F : 1.0F)));
      }

      if (!this.gd()) {
         this.a(this.ds(), 16);
      }
   }
}
