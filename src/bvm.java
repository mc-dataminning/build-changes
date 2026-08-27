public class bvm extends bvp {
   public bvm(bmh $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected efb a(int $$0) {
      this.o = new eet(false);
      this.o.a(true);
      return new efb(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected elm b() {
      return new elm(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(elm $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(elm $$0, elm $$1) {
      return this.a.bd() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(hx $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
