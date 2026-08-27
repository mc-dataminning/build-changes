public class cnt extends cos {
   private final cka a;
   private int b;

   public cnt(cka $$0, bny $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(crs $$0) {
      return false;
   }

   @Override
   public crs a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   public void a(cka $$0, crs $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(crs $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(crs $$0) {
      $$0.a(this.a.dM(), this.a, this.b);
      if (this.a instanceof apv $$1 && this.d instanceof dmc $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
