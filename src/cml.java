import java.util.List;

public class cml extends cms {
   public static final float a = bvq.N.l() / bvq.aj.l();
   private static final int d = 1200;
   private static final int bZ = 50;
   private static final int ca = 6000;
   private static final int cb = 2;
   private static final int cc = 1200;

   public cml(bvq<? extends cml> $$0, dhh $$1) {
      super($$0, $$1);
      this.ai();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxm.a m() {
      return cms.x().a(bxn.v, 0.3F).a(bxn.c, 8.0).a(bxn.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected axe u() {
      return this.bm() ? axf.ii : axf.ij;
   }

   @Override
   protected axe e(btz $$0) {
      return this.bm() ? axf.io : axf.ip;
   }

   @Override
   protected axe o_() {
      return this.bm() ? axf.il : axf.im;
   }

   @Override
   protected axe t() {
      return axf.in;
   }

   @Override
   protected void a(ash $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         buo $$1 = new buo(buq.d, 6000, 2);
         List<asi> $$2 = bup.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adz(adz.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.fY()) {
         this.a(this.dv(), 16);
      }
   }
}
