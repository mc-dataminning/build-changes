public class cfi extends cgf {
   private final cbw a;
   private int b;

   public cfi(cbw $$0, bgt $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cjh $$0) {
      return false;
   }

   @Override
   public cjh a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbw $$0, cjh $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cjh $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cjh $$0) {
      $$0.a(this.a.dL(), this.a, this.b);
      if (this.a instanceof akt $$1 && this.d instanceof dcm $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
