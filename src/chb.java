public class chb extends chz {
   private final cdm a;
   private int b;

   public chb(cdm $$0, bij $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(clb $$0) {
      return false;
   }

   @Override
   public clb a(int $$0) {
      if (this.g()) {
         this.b = this.b + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cdm $$0, clb $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(clb $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clb $$0) {
      $$0.a(this.a.dL(), this.a, this.b);
      if (this.a instanceof amb $$1 && this.d instanceof deg $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
