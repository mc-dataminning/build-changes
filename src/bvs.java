public class bvs extends bvv {
   public bvs(bmn $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected efi a(int $$0) {
      this.o = new efa(false);
      this.o.a(true);
      return new efi(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected elt b() {
      return new elt(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(elt $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(elt $$0, elt $$1) {
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
