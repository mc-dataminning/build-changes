public class cun extends cuy {
   private final cul a;
   private final cpw b;
   private int g;
   private final dgd h;

   public cun(cpw $$0, dgd $$1, cul $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxo $$0) {
      return false;
   }

   @Override
   public cxo a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxo $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxo $$0) {
      $$0.a(this.b.dW(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cpw $$0, cxo $$1) {
      this.b_($$1);
      dge $$2 = this.a.g();
      if ($$2 != null) {
         cxo $$3 = this.a.a(0);
         cxo $$4 = this.a.a(1);
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
