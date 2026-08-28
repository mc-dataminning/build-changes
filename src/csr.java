public class csr extends ctp {
   private final cor a;
   private int b;

   public csr(cor $$0, bsa $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwf $$0) {
      return false;
   }

   @Override
   public cwf a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cor $$0, cwf $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cwf $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwf $$0) {
      $$0.a(this.a.dY(), this.a, this.b);
      if (this.a instanceof arr $$1 && this.c instanceof dsf $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
