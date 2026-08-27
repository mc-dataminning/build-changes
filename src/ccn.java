public class ccn extends ccx {
   public ccn(bly<? extends ccn> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.m, 0.2F);
   }

   public static boolean b(bly<ccn> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.ak() != bjx.a;
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bnq.a).a((double)($$0 * 3));
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
      els $$0 = this.dp();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(asv<eep> $$0) {
      if ($$0 == asl.b) {
         els $$1 = this.dp();
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
   protected arq d(bks $$0) {
      return this.gg() ? arr.nC : arr.nB;
   }

   @Override
   protected arq n_() {
      return this.gg() ? arr.nt : arr.nA;
   }

   @Override
   protected arq gd() {
      return this.gg() ? arr.nF : arr.nE;
   }

   @Override
   protected arq ge() {
      return arr.nD;
   }
}
