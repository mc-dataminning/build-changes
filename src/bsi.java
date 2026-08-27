public class bsi extends bsg {
   private boolean p;

   public bsi(biy $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected eas a(int $$0) {
      this.p = this.a.ag() == bik.v;
      this.o = new eat(this.p);
      return new eas(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehf b() {
      return new ehf(this.a.dp(), this.a.e(0.5), this.a.dv());
   }

   @Override
   protected double a(ehf $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehf $$0, ehf $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(gv $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
