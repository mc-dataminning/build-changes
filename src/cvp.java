public class cvp extends cwn {
   private final cqy a;
   private int b;

   public cvp(cqy $$0, btu $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cyy $$0) {
      return false;
   }

   @Override
   public cyy a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cqy $$0, cyy $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cyy $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(cyy $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof arr $$1 && this.c instanceof dwk $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
