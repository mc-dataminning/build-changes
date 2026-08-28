public class clq extends cma {
   public clq(bul<? extends clq> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.v, 0.2F);
   }

   public static boolean b(bul<clq> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.ak() != bsa.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwi.a).a((double)($$0 * 3));
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   protected lp t() {
      return lr.F;
   }

   @Override
   public boolean bZ() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gq() {
      this.e *= 0.9F;
   }

   @Override
   public void v() {
      ezn $$0 = this.dA();
      float $$1 = (float)this.gv() * 0.1F;
      this.n($$0.d, (double)(this.fl() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axq<erj> $$0) {
      if ($$0 == axg.b) {
         ezn $$1 = this.dA();
         this.n($$1.d, (double)(0.22F + (float)this.gv() * 0.05F), $$1.f);
         this.as = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gr() {
      return this.dk();
   }

   @Override
   protected float gs() {
      return super.gs() + 2.0F;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.gw() ? awl.os : awl.or;
   }

   @Override
   protected awk o_() {
      return this.gw() ? awl.og : awl.oq;
   }

   @Override
   protected awk gt() {
      return this.gw() ? awl.ov : awl.ou;
   }

   @Override
   protected awk gu() {
      return awl.ot;
   }
}
