public class ctv extends cut {
   private final cpr a;
   private int b;

   public ctv(cpr $$0, bsr $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cxh $$0) {
      return false;
   }

   @Override
   public cxh a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cpr $$0, cxh $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cxh $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxh $$0) {
      $$0.a(this.a.dU(), this.a, this.b);
      if (this.a instanceof are $$1 && this.c instanceof dug $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
