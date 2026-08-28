public class crp extends csn {
   private final cnp a;
   private int b;

   public crp(cnp $$0, brd $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cvl $$0) {
      return false;
   }

   @Override
   public cvl a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().J());
      }

      return super.a($$0);
   }

   @Override
   public void a(cnp $$0, cvl $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cvl $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvl $$0) {
      $$0.a(this.a.dS(), this.a, this.b);
      if (this.a instanceof arh $$1 && this.c instanceof dqs $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
