public class ctm extends cwd implements css, ctl {
   private static final float f = 0.11F;

   public ctm(dfd.d $$0) {
      super($$0, hc.a, r_, false, 0.1);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(arx $$0) {
      return 1;
   }

   @Override
   protected boolean g(dfe $$0) {
      return $$0.i();
   }

   @Override
   protected csq a() {
      return csr.rv;
   }

   @Override
   protected dfe a(dfe $$0, dfe $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dfe a(dfe $$0, arx $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(cjd.vw);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      return ctl.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
