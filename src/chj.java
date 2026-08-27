public class chj extends cih {
   private final cdu a;
   private int b;

   public chj(cdu $$0, biq $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(clj $$0) {
      return false;
   }

   @Override
   public clj a(int $$0) {
      if (this.g()) {
         this.b = this.b + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cdu $$0, clj $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(clj $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clj $$0) {
      $$0.a(this.a.dN(), this.a, this.b);
      if (this.a instanceof amf $$1 && this.d instanceof des $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
