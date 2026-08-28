public class clx extends cmh {
   public clx(bus<? extends clx> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static bwo.a m() {
      return cly.gx().a(bwp.v, 0.2F);
   }

   public static boolean b(bus<clx> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.am() != bsh.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwp.a).a((double)($$0 * 3));
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   protected lr p() {
      return lt.F;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected int t() {
      return super.t() * 4;
   }

   @Override
   protected void x() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      fba $$0 = this.dy();
      float $$1 = (float)this.gs() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axf<esy> $$0) {
      if ($$0 == awv.b) {
         fba $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gs() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean go() {
      return this.dj();
   }

   @Override
   protected float gp() {
      return super.gp() + 2.0F;
   }

   @Override
   protected avz e(btb $$0) {
      return this.gt() ? awa.oR : awa.oQ;
   }

   @Override
   protected avz o_() {
      return this.gt() ? awa.oF : awa.oP;
   }

   @Override
   protected avz gq() {
      return this.gt() ? awa.oU : awa.oT;
   }

   @Override
   protected avz gr() {
      return awa.oS;
   }
}
