public class cih extends cjf {
   private final cer a;
   private int b;

   public cih(cer $$0, bje $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cmh $$0) {
      return false;
   }

   @Override
   public cmh a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cer $$0, cmh $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cmh $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmh $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof amq $$1 && this.d instanceof dfs $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
