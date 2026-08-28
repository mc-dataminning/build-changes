public class cta extends cty {
   private final cow a;
   private int b;

   public cta(cow $$0, bsc $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwo $$0) {
      return false;
   }

   @Override
   public cwo a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cow $$0, cwo $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cwo $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwo $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof are $$1 && this.c instanceof dtm $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
