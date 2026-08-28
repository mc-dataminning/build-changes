import java.util.List;

public class cmm extends cmt {
   public static final float a = bvr.N.l() / bvr.aj.l();
   private static final int d = 1200;
   private static final int bZ = 50;
   private static final int ca = 6000;
   private static final int cb = 2;
   private static final int cc = 1200;

   public cmm(bvr<? extends cmm> $$0, dhi $$1) {
      super($$0, $$1);
      this.ai();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxn.a m() {
      return cmt.x().a(bxo.v, 0.3F).a(bxo.c, 8.0).a(bxo.s, 80.0);
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
   protected axe e(bua $$0) {
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
         bup $$1 = new bup(bur.d, 6000, 2);
         List<asi> $$2 = buq.a($$0, this, this.du(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adz(adz.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dw(), 16);
      }
   }
}
