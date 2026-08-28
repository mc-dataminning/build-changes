public class cny extends coi {
   public cny(bwm<? extends cny> $$0, div $$1) {
      super($$0, $$1);
   }

   public static byh.a j() {
      return cnz.gt().a(byi.v, 0.2F);
   }

   public static boolean b(bwm<cny> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.an() != bty.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(byi.a).a((double)($$0 * 3));
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
      fei $$0 = this.dy();
      float $$1 = (float)this.go() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axr<ewf> $$0) {
      if ($$0 == axh.b) {
         fei $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.go() * 0.05F), $$1.f);
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
   protected awm e(bus $$0) {
      return this.gp() ? awn.pc : awn.pb;
   }

   @Override
   protected awm l_() {
      return this.gp() ? awn.oQ : awn.pa;
   }

   @Override
   protected awm gm() {
      return this.gp() ? awn.pf : awn.pe;
   }

   @Override
   protected awm gn() {
      return awn.pd;
   }
}
