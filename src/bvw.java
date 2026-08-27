public class bvw extends bvu {
   private boolean p;

   public bvw(bmm $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected efh a(int $$0) {
      this.p = this.a.ai() == bly.w;
      this.o = new efi(this.p);
      return new efh(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
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
