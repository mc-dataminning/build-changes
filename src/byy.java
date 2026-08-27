public class byy extends bzi {
   public byy(bik<? extends byy> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.d, 0.2F);
   }

   public static boolean b(bik<byy> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.ai() != bgl.a;
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bkd.i).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected iu q() {
      return iw.C;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected int t() {
      return super.t() * 4;
   }

   @Override
   protected void fV() {
      this.d *= 0.9F;
   }

   @Override
   protected void eZ() {
      ehf $$0 = this.dn();
      float $$1 = (float)this.ga() * 0.1F;
      this.o($$0.c, (double)(this.eX() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(apy<eaa> $$0) {
      if ($$0 == apo.b) {
         ehf $$1 = this.dn();
         this.o($$1.c, (double)(0.22F + (float)this.ga() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean fW() {
      return this.cX();
   }

   @Override
   protected float fX() {
      return super.fX() + 2.0F;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.gb() ? aou.mO : aou.mN;
   }

   @Override
   protected aot h_() {
      return this.gb() ? aou.mF : aou.mM;
   }

   @Override
   protected aot fY() {
      return this.gb() ? aou.mR : aou.mQ;
   }

   @Override
   protected aot fZ() {
      return aou.mP;
   }
}
