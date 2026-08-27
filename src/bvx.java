public class bvx extends bvv {
   private boolean p;

   public bvx(bmn $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected efi a(int $$0) {
      this.p = this.a.ai() == blz.w;
      this.o = new efj(this.p);
      return new efi(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
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
