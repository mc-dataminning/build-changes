public class clv extends cmf {
   public clv(buq<? extends clv> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.v, 0.2F);
   }

   public static boolean b(buq<clv> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.am() != bsf.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwn.a).a((double)($$0 * 3));
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
      fay $$0 = this.dz();
      float $$1 = (float)this.gp() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axe<esw> $$0) {
      if ($$0 == awu.b) {
         fay $$1 = this.dz();
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
   protected avy e(bsz $$0) {
      return this.gq() ? avz.oR : avz.oQ;
   }

   @Override
   protected avy o_() {
      return this.gq() ? avz.oF : avz.oP;
   }

   @Override
   protected avy gn() {
      return this.gq() ? avz.oU : avz.oT;
   }

   @Override
   protected avy go() {
      return avz.oS;
   }
}
