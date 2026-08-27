public class bso extends bsr {
   public bso(bjk $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebf a(int $$0) {
      this.o = new eax(false);
      this.o.a(true);
      return new ebf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected ehp b() {
      return new ehp(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(ehp $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehp $$0, ehp $$1) {
      return this.a.bb() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(gw $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
