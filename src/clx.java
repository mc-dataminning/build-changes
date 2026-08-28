public class clx extends cmh {
   public clx(bus<? extends clx> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.v, 0.2F);
   }

   public static boolean b(bus<clx> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.ak() != bsh.a;
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
   protected lq q() {
      return ls.F;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected int v() {
      return super.v() * 4;
   }

   @Override
   protected void gi() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      ezy $$0 = this.dy();
      float $$1 = (float)this.gn() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axs<eru> $$0) {
      if ($$0 == axi.b) {
         ezy $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gn() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gj() {
      return this.dj();
   }

   @Override
   protected float gk() {
      return super.gk() + 2.0F;
   }

   @Override
   protected awm e(btb $$0) {
      return this.go() ? awn.os : awn.or;
   }

   @Override
   protected awm n_() {
      return this.go() ? awn.og : awn.oq;
   }

   @Override
   protected awm gl() {
      return this.go() ? awn.ov : awn.ou;
   }

   @Override
   protected awm gm() {
      return awn.ot;
   }
}
