public class cts extends cuq {
   private final cpo a;
   private int b;

   public cts(cpo $$0, bst $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cxg $$0) {
      return false;
   }

   @Override
   public cxg a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cpo $$0, cxg $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cxg $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxg $$0) {
      $$0.a(this.a.dW(), this.a, this.b);
      if (this.a instanceof ary $$1 && this.c instanceof due $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
