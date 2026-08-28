public class csi extends ctg {
   private final coh a;
   private int b;

   public csi(coh $$0, brr $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cvx $$0) {
      return false;
   }

   @Override
   public cvx a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(coh $$0, cvx $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cvx $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvx $$0) {
      $$0.a(this.a.dX(), this.a, this.b);
      if (this.a instanceof arn $$1 && this.c instanceof dru $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
