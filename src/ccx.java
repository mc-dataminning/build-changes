public class ccx extends cda {
   public ccx(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.o = new epn(false);
      this.o.a(true);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected exc b() {
      return new exc(this.a.dt(), this.a.e(0.5), this.a.dz());
   }

   @Override
   protected double a(exc $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(exc $$0, exc $$1) {
      return this.a.bj() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(jd $$0) {
      return !this.b.a_($$0.e()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
