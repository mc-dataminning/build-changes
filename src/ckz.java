public class ckz extends clj {
   public ckz(btv<? extends ckz> $$0, deg $$1) {
      super($$0, $$1);
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.v, 0.2F);
   }

   public static boolean b(btv<ckz> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.am() != brm.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bvr.a).a((double)($$0 * 3));
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
   protected void gl() {
      this.e *= 0.9F;
   }

   @Override
   public void v() {
      eys $$0 = this.dv();
      float $$1 = (float)this.gq() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axj<eqo> $$0) {
      if ($$0 == awz.b) {
         eys $$1 = this.dv();
         this.n($$1.d, (double)(0.22F + (float)this.gq() * 0.05F), $$1.f);
         this.as = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gm() {
      return this.df();
   }

   @Override
   protected float gn() {
      return super.gn() + 2.0F;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.gr() ? awe.ou : awe.ot;
   }

   @Override
   protected awd n_() {
      return this.gr() ? awe.oi : awe.os;
   }

   @Override
   protected awd go() {
      return this.gr() ? awe.ox : awe.ow;
   }

   @Override
   protected awd gp() {
      return awe.ov;
   }
}
