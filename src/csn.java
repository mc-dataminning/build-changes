public class csn extends ctl {
   private final com a;
   private int b;

   public csn(com $$0, brw $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwb $$0) {
      return false;
   }

   @Override
   public cwb a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(com $$0, cwb $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cwb $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwb $$0) {
      $$0.a(this.a.dX(), this.a, this.b);
      if (this.a instanceof aro $$1 && this.c instanceof dsa $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
