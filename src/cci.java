public class cci extends ccs {
   public cci(blt<? extends cci> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.m, 0.2F);
   }

   public static boolean b(blt<cci> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.ak() != bjs.a;
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bnl.a).a((double)($$0 * 3));
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
      elm $$0 = this.dp();
      float $$1 = (float)this.gf() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.au = true;
   }

   @Override
   protected void c(asq<eej> $$0) {
      if ($$0 == asg.b) {
         elm $$1 = this.dp();
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
   protected arl d(bkn $$0) {
      return this.gg() ? arm.nC : arm.nB;
   }

   @Override
   protected arl n_() {
      return this.gg() ? arm.nt : arm.nA;
   }

   @Override
   protected arl gd() {
      return this.gg() ? arm.nF : arm.nE;
   }

   @Override
   protected arl ge() {
      return arm.nD;
   }
}
