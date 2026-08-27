public class ciy extends cjw {
   private final cfi a;
   private int b;

   public ciy(cfi $$0, bju $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cmy $$0) {
      return false;
   }

   @Override
   public cmy a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cfi $$0, cmy $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cmy $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmy $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof ane $$1 && this.d instanceof dgk $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
