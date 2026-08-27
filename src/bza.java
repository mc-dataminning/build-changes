public class bza extends bzk {
   public bza(bim<? extends bza> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.d, 0.2F);
   }

   public static boolean b(bim<bza> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.ai() != bgn.a;
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bkf.i).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected it q() {
      return iv.C;
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
      ehe $$0 = this.dn();
      float $$1 = (float)this.ga() * 0.1F;
      this.o($$0.c, (double)(this.eX() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(aqa<eac> $$0) {
      if ($$0 == apq.b) {
         ehe $$1 = this.dn();
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
   protected aov d(bhg $$0) {
      return this.gb() ? aow.mO : aow.mN;
   }

   @Override
   protected aov h_() {
      return this.gb() ? aow.mF : aow.mM;
   }

   @Override
   protected aov fY() {
      return this.gb() ? aow.mR : aow.mQ;
   }

   @Override
   protected aov fZ() {
      return aow.mP;
   }
}
