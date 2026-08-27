public class cps extends cqq {
   private final cly a;
   private int b;

   public cps(cly $$0, bpp $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ctq $$0) {
      return false;
   }

   @Override
   public ctq a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(cly $$0, ctq $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(ctq $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(ctq $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof aqo $$1 && this.c instanceof dnw $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
