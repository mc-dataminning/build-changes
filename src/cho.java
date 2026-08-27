public class cho extends cim {
   private final cdz a;
   private int b;

   public cho(cdz $$0, biu $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(clo $$0) {
      return false;
   }

   @Override
   public clo a(int $$0) {
      if (this.g()) {
         this.b = this.b + Math.min($$0, this.f().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cdz $$0, clo $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(clo $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(clo $$0) {
      $$0.a(this.a.dN(), this.a, this.b);
      if (this.a instanceof amj $$1 && this.d instanceof dex $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
