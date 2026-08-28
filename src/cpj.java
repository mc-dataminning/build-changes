public class cpj extends cpt {
   public cpj(bxn<? extends cpj> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.v, 0.2F);
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
   protected lx p() {
      return lz.F;
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   protected int u() {
      return super.u() * 4;
   }

   @Override
   protected void gq() {
      this.d *= 0.9F;
   }

   @Override
   public void r() {
      fgc $$0 = this.dy();
      float $$1 = (float)this.gv() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(ayc<exz> $$0) {
      if ($$0 == axs.b) {
         fgc $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gv() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gr() {
      return this.dj();
   }

   @Override
   protected float gs() {
      return super.gs() + 2.0F;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.gw() ? awy.pf : awy.pe;
   }

   @Override
   protected awx j_() {
      return this.gw() ? awy.oT : awy.pd;
   }

   @Override
   protected awx gt() {
      return this.gw() ? awy.pi : awy.ph;
   }

   @Override
   protected awx gu() {
      return awy.pg;
   }
}
