public class cxa extends cxz {
   private final csi a;
   private int b;

   public cxa(csi $$0, buv $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(dak $$0) {
      return false;
   }

   @Override
   public dak a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(csi $$0, dak $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(dak $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(dak $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof asc $$1 && this.c instanceof dyb $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
