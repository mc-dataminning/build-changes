public class cco extends ccy {
   public cco(blz<? extends cco> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.m, 0.2F);
   }

   public static boolean b(blz<cco> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.ak() != bjy.a;
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bnr.a).a((double)($$0 * 3));
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
   protected void ga() {
      this.d *= 0.9F;
   }

   @Override
   protected void fb() {
      elt $$0 = this.dp();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(asw<eeq> $$0) {
      if ($$0 == asm.b) {
         elt $$1 = this.dp();
         this.o($$1.c, (double)(0.22F + (float)this.gf() * 0.05F), $$1.e);
         this.au = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gb() {
      return this.cY();
   }

   @Override
   protected float gc() {
      return super.gc() + 2.0F;
   }

   @Override
   protected arr d(bkt $$0) {
      return this.gg() ? ars.nC : ars.nB;
   }

   @Override
   protected arr n_() {
      return this.gg() ? ars.nt : ars.nA;
   }

   @Override
   protected arr gd() {
      return this.gg() ? ars.nF : ars.nE;
   }

   @Override
   protected arr ge() {
      return ars.nD;
   }
}
