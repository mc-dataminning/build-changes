public class bzc extends bza {
   private boolean p;

   public bzc(bpr $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected ejf a(int $$0) {
      this.p = this.a.ai() == bpd.z;
      this.o = new ejh(this.p);
      return new ejf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
   }

   @Override
   protected ept b() {
      return new ept(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(ept $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ept $$0, ept $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ib $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
