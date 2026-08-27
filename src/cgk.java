public class cgk extends chh {
   private final ccx a;
   private int b;

   public cgk(ccx $$0, bhu $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ckj $$0) {
      return false;
   }

   @Override
   public ckj a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(ccx $$0, ckj $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(ckj $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(ckj $$0) {
      $$0.a(this.a.dL(), this.a, this.b);
      if (this.a instanceof alr $$1 && this.d instanceof ddm $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
