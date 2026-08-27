public class cak extends cau {
   public cak(bjx<? extends cak> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static blo.a s() {
      return cal.gk().a(blp.m, 0.2F);
   }

   public static boolean b(bjx<cak> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.ai() != bhy.a;
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(blp.a).a((double)($$0 * 3));
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected jq t() {
      return js.C;
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
      eif $$0 = this.do();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eY() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(arh<ebd> $$0) {
      if ($$0 == aqx.b) {
         eif $$1 = this.do();
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
   protected aqc d(bir $$0) {
      return this.gg() ? aqd.mQ : aqd.mP;
   }

   @Override
   protected aqc m_() {
      return this.gg() ? aqd.mH : aqd.mO;
   }

   @Override
   protected aqc gd() {
      return this.gg() ? aqd.mT : aqd.mS;
   }

   @Override
   protected aqc ge() {
      return aqd.mR;
   }
}
