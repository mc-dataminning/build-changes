public class caz extends cbj {
   public caz(bkm<? extends caz> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static bmd.a s() {
      return cba.gk().a(bme.m, 0.2F);
   }

   public static boolean b(bkm<caz> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.ai() != bin.a;
   }

   @Override
   public boolean a(crv $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bme.a).a((double)($$0 * 3));
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
      eji $$0 = this.do();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eY() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(arr<ecf> $$0) {
      if ($$0 == arh.b) {
         eji $$1 = this.do();
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
   protected aqm d(bjg $$0) {
      return this.gg() ? aqn.mS : aqn.mR;
   }

   @Override
   protected aqm m_() {
      return this.gg() ? aqn.mJ : aqn.mQ;
   }

   @Override
   protected aqm gd() {
      return this.gg() ? aqn.mV : aqn.mU;
   }

   @Override
   protected aqm ge() {
      return aqn.mT;
   }
}
