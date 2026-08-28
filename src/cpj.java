public class cpj extends cpt {
   public cpj(bxn<? extends cpj> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static bzk.a j() {
      return cpk.gx().a(bzl.v, 0.2F);
   }

   public static boolean b(bxn<cpj> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.an() != buz.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bzl.a).a((double)($$0 * 3));
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   protected lx m() {
      return lz.F;
   }

   @Override
   public boolean bX() {
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
      fgc $$0 = this.dy();
      float $$1 = (float)this.gs() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(ayc<exz> $$0) {
      if ($$0 == axs.b) {
         fgc $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gs() * 0.05F), $$1.f);
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
   protected awx e(bvt $$0) {
      return this.gt() ? awy.pf : awy.pe;
   }

   @Override
   protected awx l_() {
      return this.gt() ? awy.oT : awy.pd;
   }

   @Override
   protected awx gq() {
      return this.gt() ? awy.pi : awy.ph;
   }

   @Override
   protected awx gr() {
      return awy.pg;
   }
}
