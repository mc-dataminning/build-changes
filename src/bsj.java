public class bsj extends bsh {
   private boolean p;

   public bsj(bja $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected eat a(int $$0) {
      this.p = this.a.ag() == bim.v;
      this.o = new eau(this.p);
      return new eat(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehd b() {
      return new ehd(this.a.dp(), this.a.e(0.5), this.a.dv());
   }

   @Override
   protected double a(ehd $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehd $$0, ehd $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(gu $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
