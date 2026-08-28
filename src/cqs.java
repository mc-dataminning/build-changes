public class cqs extends crq {
   private final cmy a;
   private int b;

   public cqs(cmy $$0, bqo $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuq $$0) {
      return false;
   }

   @Override
   public cuq a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmy $$0, cuq $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cuq $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuq $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof arg $$1 && this.c instanceof dow $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
