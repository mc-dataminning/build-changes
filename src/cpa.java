public class cpa extends cpk {
   public cpa(bxe<? extends cpa> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.v, 0.2F);
   }

   public static boolean b(bxe<cpa> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.an() != buq.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bzc.a).a((double)($$0 * 3));
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
      ffs $$0 = this.dy();
      float $$1 = (float)this.gs() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axv<exp> $$0) {
      if ($$0 == axl.b) {
         ffs $$1 = this.dy();
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
   protected awq e(bvk $$0) {
      return this.gt() ? awr.pf : awr.pe;
   }

   @Override
   protected awq l_() {
      return this.gt() ? awr.oT : awr.pd;
   }

   @Override
   protected awq gq() {
      return this.gt() ? awr.pi : awr.ph;
   }

   @Override
   protected awq gr() {
      return awr.pg;
   }
}
