public class cns extends coc {
   public cns(bwj<? extends cns> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static bye.a j() {
      return cnt.gt().a(byf.v, 0.2F);
   }

   public static boolean b(bwj<cns> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.an() != btv.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(byf.a).a((double)($$0 * 3));
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
      fdw $$0 = this.dy();
      float $$1 = (float)this.go() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axp<evu> $$0) {
      if ($$0 == axf.b) {
         fdw $$1 = this.dy();
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
   protected awk e(bup $$0) {
      return this.gp() ? awl.pb : awl.pa;
   }

   @Override
   protected awk l_() {
      return this.gp() ? awl.oP : awl.oZ;
   }

   @Override
   protected awk gm() {
      return this.gp() ? awl.pe : awl.pd;
   }

   @Override
   protected awk gn() {
      return awl.pc;
   }
}
