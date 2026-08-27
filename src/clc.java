public class clc extends cma {
   private final chl a;
   private int b;

   public clc(chl $$0, blp $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cpd $$0) {
      return false;
   }

   @Override
   public cpd a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(chl $$0, cpd $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cpd $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cpd $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof aox $$1 && this.d instanceof dim $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
