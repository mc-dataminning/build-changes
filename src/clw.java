public class clw extends cmg {
   public clw(bur<? extends clw> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.v, 0.2F);
   }

   public static boolean b(bur<clw> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwo.a).a((double)($$0 * 3));
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
      fba $$0 = this.dz();
      float $$1 = (float)this.gp() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axf<esy> $$0) {
      if ($$0 == awv.b) {
         fba $$1 = this.dz();
         this.n($$1.d, (double)(0.22F + (float)this.gp() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gl() {
      return this.dk();
   }

   @Override
   protected float gm() {
      return super.gm() + 2.0F;
   }

   @Override
   protected avz e(bta $$0) {
      return this.gq() ? awa.oR : awa.oQ;
   }

   @Override
   protected avz o_() {
      return this.gq() ? awa.oF : awa.oP;
   }

   @Override
   protected avz gn() {
      return this.gq() ? awa.oU : awa.oT;
   }

   @Override
   protected avz go() {
      return awa.oS;
   }
}
