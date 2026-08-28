public class ccy extends ccw {
   private boolean p;

   public ccy(btm $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected eog a(int $$0) {
      this.p = this.a.ak() == bsv.y;
      this.o = new eok(this.p);
      return new eog(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evm b() {
      return new evm(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evm $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evm $$0, evm $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iz $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
