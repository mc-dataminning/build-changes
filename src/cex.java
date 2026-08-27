public class cex extends cfu {
   private final cbl a;
   private int b;

   public cex(cbl $$0, bgh $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ciw $$0) {
      return false;
   }

   @Override
   public ciw a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbl $$0, ciw $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(ciw $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(ciw $$0) {
      $$0.a(this.a.dK(), this.a, this.b);
      if (this.a instanceof akj $$1 && this.d instanceof dbz $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
