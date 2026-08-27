public class bvr extends bvu {
   public bvr(bmm $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected efh a(int $$0) {
      this.o = new eez(false);
      this.o.a(true);
      return new efh(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected els b() {
      return new els(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(els $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(els $$0, els $$1) {
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
