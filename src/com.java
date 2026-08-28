public class com extends cox {
   public com(bwr<? extends com> $$0, djm $$1) {
      super($$0, $$1);
   }

   public static byo.a j() {
      return coo.gw().a(byp.v, 0.2F);
   }

   public static boolean b(bwr<com> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.an() != bud.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(byp.a).a((double)($$0 * 3));
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   protected lw m() {
      return ly.F;
   }

   @Override
   public boolean bW() {
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
      ffc $$0 = this.dx();
      float $$1 = (float)this.gr() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axr<ewz> $$0) {
      if ($$0 == axh.b) {
         ffc $$1 = this.dx();
         this.n($$1.d, (double)(0.22F + (float)this.gr() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean t() {
      return this.di();
   }

   @Override
   protected float x() {
      return super.x() + 2.0F;
   }

   @Override
   protected awm e(bux $$0) {
      return this.gs() ? awn.pf : awn.pe;
   }

   @Override
   protected awm l_() {
      return this.gs() ? awn.oT : awn.pd;
   }

   @Override
   protected awm gp() {
      return this.gs() ? awn.pi : awn.ph;
   }

   @Override
   protected awm gq() {
      return awn.pg;
   }
}
