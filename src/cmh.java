import java.util.List;

public class cmh extends cmo {
   public static final float a = bvm.N.l() / bvm.aj.l();
   private static final int d = 1200;
   private static final int bZ = 50;
   private static final int ca = 6000;
   private static final int cb = 2;
   private static final int cc = 1200;

   public cmh(bvm<? extends cmh> $$0, dha $$1) {
      super($$0, $$1);
      this.ai();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxi.a m() {
      return cmo.x().a(bxj.v, 0.3F).a(bxj.c, 8.0).a(bxj.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected axe u() {
      return this.bm() ? axf.ih : axf.ii;
   }

   @Override
   protected axe e(btv $$0) {
      return this.bm() ? axf.in : axf.io;
   }

   @Override
   protected axe o_() {
      return this.bm() ? axf.ik : axf.il;
   }

   @Override
   protected axe t() {
      return axf.im;
   }

   @Override
   protected void a(ash $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         buk $$1 = new buk(bum.d, 6000, 2);
         List<asi> $$2 = bul.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adz(adz.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.fY()) {
         this.a(this.dv(), 16);
      }
   }
}
