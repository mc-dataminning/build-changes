public class coe extends cpd {
   private final ckl a;
   private int b;

   public coe(ckl $$0, boj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(csd $$0) {
      return false;
   }

   @Override
   public csd a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   public void a(ckl $$0, csd $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(csd $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(csd $$0) {
      $$0.a(this.a.dN(), this.a, this.b);
      if (this.a instanceof aqf $$1 && this.d instanceof dmr $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
