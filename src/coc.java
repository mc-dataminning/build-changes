public class coc extends com {
   public coc(bwo<? extends coc> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static byj.a j() {
      return cod.gu().a(byk.v, 0.2F);
   }

   public static boolean b(bwo<coc> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.an() != bua.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(byk.a).a((double)($$0 * 3));
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected lv m() {
      return lx.F;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected int n() {
      return super.n() * 4;
   }

   @Override
   protected void q() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      feq $$0 = this.dy();
      float $$1 = (float)this.gp() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axr<ewn> $$0) {
      if ($$0 == axh.b) {
         feq $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gp() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean t() {
      return this.dj();
   }

   @Override
   protected float x() {
      return super.x() + 2.0F;
   }

   @Override
   protected awm e(buu $$0) {
      return this.gq() ? awn.pf : awn.pe;
   }

   @Override
   protected awm l_() {
      return this.gq() ? awn.oT : awn.pd;
   }

   @Override
   protected awm gn() {
      return this.gq() ? awn.pi : awn.ph;
   }

   @Override
   protected awm go() {
      return awn.pg;
   }
}
