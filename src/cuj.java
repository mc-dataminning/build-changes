public class cuj extends cuu {
   private final cuh a;
   private final cps b;
   private int g;
   private final dfw h;

   public cuj(cps $$0, dfw $$1, cuh $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxk $$0) {
      return false;
   }

   @Override
   public cxk a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxk $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxk $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cps $$0, cxk $$1) {
      this.b_($$1);
      dfx $$2 = this.a.g();
      if ($$2 != null) {
         cxk $$3 = this.a.a(0);
         cxk $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(axp.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}
