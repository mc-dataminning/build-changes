public class cku extends cle {
   public cku(btq<? extends cku> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.v, 0.2F);
   }

   public static boolean b(btq<cku> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.am() != brh.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bvm.a).a((double)($$0 * 3));
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected ll t() {
      return ln.F;
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
      eye $$0 = this.dv();
      float $$1 = (float)this.gp() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axi<eqa> $$0) {
      if ($$0 == awy.b) {
         eye $$1 = this.dv();
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
   protected awc d(bsb $$0) {
      return this.gq() ? awd.ou : awd.ot;
   }

   @Override
   protected awc n_() {
      return this.gq() ? awd.oi : awd.os;
   }

   @Override
   protected awc gn() {
      return this.gq() ? awd.ox : awd.ow;
   }

   @Override
   protected awc go() {
      return awd.ov;
   }
}
