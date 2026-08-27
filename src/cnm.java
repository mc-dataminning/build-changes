public class cnm extends cok {
   private final cjt a;
   private int b;

   public cnm(cjt $$0, bnt $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(crj $$0) {
      return false;
   }

   @Override
   public crj a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   public void a(cjt $$0, crj $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(crj $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(crj $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof apt $$1 && this.d instanceof dlt $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
