public class bsk extends bsi {
   private boolean p;

   public bsk(bja $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected eau a(int $$0) {
      this.p = this.a.ag() == bim.v;
      this.o = new eav(this.p);
      return new eau(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehe b() {
      return new ehe(this.a.dp(), this.a.e(0.5), this.a.dv());
   }

   @Override
   protected double a(ehe $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehe $$0, ehe $$1) {
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
