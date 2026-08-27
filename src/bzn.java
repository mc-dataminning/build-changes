public class bzn extends bzx {
   public bzn(bja<? extends bzn> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.m, 0.2F);
   }

   public static boolean b(bja<bzn> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.ai() != bhb.a;
   }

   @Override
   public boolean a(cqe $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bks.a).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected it t() {
      return iv.C;
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
   protected void ga() {
      this.d *= 0.9F;
   }

   @Override
   protected void fa() {
      ehh $$0 = this.do();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eY() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(aqk<eaf> $$0) {
      if ($$0 == aqa.b) {
         ehh $$1 = this.do();
         this.o($$1.c, (double)(0.22F + (float)this.gf() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gb() {
      return this.cX();
   }

   @Override
   protected float gc() {
      return super.gc() + 2.0F;
   }

   @Override
   protected apf d(bhu $$0) {
      return this.gg() ? apg.mO : apg.mN;
   }

   @Override
   protected apf l_() {
      return this.gg() ? apg.mF : apg.mM;
   }

   @Override
   protected apf gd() {
      return this.gg() ? apg.mR : apg.mQ;
   }

   @Override
   protected apf ge() {
      return apg.mP;
   }
}
