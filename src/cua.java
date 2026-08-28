public class cua extends cuy {
   private final cpw a;
   private int b;

   public cua(cpw $$0, btb $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cxo $$0) {
      return false;
   }

   @Override
   public cxo a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cpw $$0, cxo $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cxo $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxo $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof asi $$1 && this.c instanceof duk $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
