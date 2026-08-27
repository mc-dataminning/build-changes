public class bsf extends bsi {
   public bsf(bja $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected eau a(int $$0) {
      this.o = new eam(false);
      this.o.a(true);
      return new eau(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bb() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(gu $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
