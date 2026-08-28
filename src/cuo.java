public class cuo extends cuz {
   private final cum a;
   private final cpx b;
   private int g;
   private final dge h;

   public cuo(cpx $$0, dge $$1, cum $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxp $$0) {
      return false;
   }

   @Override
   public cxp a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxp $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxp $$0) {
      $$0.a(this.b.dW(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cpx $$0, cxp $$1) {
      this.b_($$1);
      dgf $$2 = this.a.g();
      if ($$2 != null) {
         cxp $$3 = this.a.a(0);
         cxp $$4 = this.a.a(1);
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
