public class clc extends clm {
   public clc(bty<? extends clc> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.v, 0.2F);
   }

   public static boolean b(bty<clc> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.am() != brp.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bvu.a).a((double)($$0 * 3));
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected lm t() {
      return lo.F;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gk() {
      this.e *= 0.9F;
   }

   @Override
   public void v() {
      eyw $$0 = this.dv();
      float $$1 = (float)this.gp() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axl<eqs> $$0) {
      if ($$0 == axb.b) {
         eyw $$1 = this.dv();
         this.n($$1.d, (double)(0.22F + (float)this.gp() * 0.05F), $$1.f);
         this.as = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gl() {
      return this.df();
   }

   @Override
   protected float gm() {
      return super.gm() + 2.0F;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.gq() ? awg.ou : awg.ot;
   }

   @Override
   protected awf o_() {
      return this.gq() ? awg.oi : awg.os;
   }

   @Override
   protected awf gn() {
      return this.gq() ? awg.ox : awg.ow;
   }

   @Override
   protected awf go() {
      return awg.ov;
   }
}
