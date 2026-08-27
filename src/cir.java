public class cir extends cjp {
   private final cfb a;
   private int b;

   public cir(cfb $$0, bjo $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cmr $$0) {
      return false;
   }

   @Override
   public cmr a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cfb $$0, cmr $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cmr $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmr $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof ana $$1 && this.d instanceof dgd $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
