public class bzh extends bzr {
   public bzh(biu<? extends bzh> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.d, 0.2F);
   }

   public static boolean b(biu<bzh> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.ai() != bgv.a;
   }

   @Override
   public boolean a(cpy $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bkm.i).a((double)($$0 * 3));
   }

   @Override
   public float bn() {
      return 1.0F;
   }

   @Override
   protected iv t() {
      return ix.C;
   }

   @Override
   public boolean bN() {
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
      ehn $$0 = this.do();
      float $$1 = (float)this.ge() * 0.1F;
      this.o($$0.c, (double)(this.eY() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(aqi<eal> $$0) {
      if ($$0 == apy.b) {
         ehn $$1 = this.do();
         this.o($$1.c, (double)(0.22F + (float)this.ge() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean ga() {
      return this.cY();
   }

   @Override
   protected float gb() {
      return super.gb() + 2.0F;
   }

   @Override
   protected apd d(bho $$0) {
      return this.gf() ? ape.mO : ape.mN;
   }

   @Override
   protected apd l_() {
      return this.gf() ? ape.mF : ape.mM;
   }

   @Override
   protected apd gc() {
      return this.gf() ? ape.mR : ape.mQ;
   }

   @Override
   protected apd gd() {
      return ape.mP;
   }
}
