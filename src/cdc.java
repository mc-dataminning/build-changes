public class cdc extends cda {
   private boolean p;

   public cdc(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.p = this.a.am() == bsx.y;
      this.o = new epy(this.p);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bj();
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
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jd $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
