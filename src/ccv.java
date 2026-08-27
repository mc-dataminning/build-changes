public class ccv extends cdf {
   public ccv(bmc<? extends ccv> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.o, 0.2F);
   }

   public static boolean b(bmc<ccv> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.ak() != bjz.a;
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bnu.a).a((double)($$0 * 3));
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected jv w() {
      return jx.E;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected int A() {
      return super.A() * 4;
   }

   @Override
   protected void gb() {
      this.d *= 0.9F;
   }

   @Override
   protected void fb() {
      emc $$0 = this.do();
      float $$1 = (float)this.gg() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(asx<eey> $$0) {
      if ($$0 == asn.b) {
         emc $$1 = this.do();
         this.o($$1.c, (double)(0.22F + (float)this.gg() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gc() {
      return this.cY();
   }

   @Override
   protected float gd() {
      return super.gd() + 2.0F;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.gh() ? art.nR : art.nQ;
   }

   @Override
   protected ars n_() {
      return this.gh() ? art.nI : art.nP;
   }

   @Override
   protected ars ge() {
      return this.gh() ? art.nU : art.nT;
   }

   @Override
   protected ars gf() {
      return art.nS;
   }
}
