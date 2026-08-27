public class bwa extends bvy {
   private boolean p;

   public bwa(bmq $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected efq a(int $$0) {
      this.p = this.a.ai() == bmc.x;
      this.o = new efr(this.p);
      return new efq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected emc b() {
      return new emc(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(emc $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(emc $$0, emc $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hx $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
