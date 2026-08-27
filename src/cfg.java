public class cfg extends cgd {
   private final cbu a;
   private int b;

   public cfg(cbu $$0, bgr $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cjf $$0) {
      return false;
   }

   @Override
   public cjf a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cbu $$0, cjf $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cjf $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cjf $$0) {
      $$0.a(this.a.dL(), this.a, this.b);
      if (this.a instanceof aks $$1 && this.d instanceof dck $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
