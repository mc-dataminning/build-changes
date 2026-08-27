public class bzj extends bzt {
   public bzj(biw<? extends bzj> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.d, 0.2F);
   }

   public static boolean b(biw<bzj> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.ai() != bgx.a;
   }

   @Override
   public boolean a(cqa $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bko.i).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected iv t() {
      return ix.C;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void fZ() {
      this.d *= 0.9F;
   }

   @Override
   protected void fa() {
      ehp $$0 = this.do();
      float $$1 = (float)this.ge() * 0.1F;
      this.o($$0.c, (double)(this.eY() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(aqj<ean> $$0) {
      if ($$0 == apz.b) {
         ehp $$1 = this.do();
         this.o($$1.c, (double)(0.22F + (float)this.ge() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean ga() {
      return this.cX();
   }

   @Override
   protected float gb() {
      return super.gb() + 2.0F;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.gf() ? apf.mO : apf.mN;
   }

   @Override
   protected ape l_() {
      return this.gf() ? apf.mF : apf.mM;
   }

   @Override
   protected ape gc() {
      return this.gf() ? apf.mR : apf.mQ;
   }

   @Override
   protected ape gd() {
      return apf.mP;
   }
}
