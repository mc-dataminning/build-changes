public class cky extends clw {
   private final chh a;
   private int b;

   public cky(chh $$0, bln $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(coz $$0) {
      return false;
   }

   @Override
   public coz a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(chh $$0, coz $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(coz $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(coz $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof aow $$1 && this.d instanceof dii $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
