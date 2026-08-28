public class ctm extends ctx {
   private final ctk a;
   private final cov b;
   private int g;
   private final dfc h;

   public ctm(cov $$0, dfc $$1, ctk $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwn $$0) {
      return false;
   }

   @Override
   public cwn a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwn $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwn $$0) {
      $$0.a(this.b.dW(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cov $$0, cwn $$1) {
      this.b_($$1);
      dfd $$2 = this.a.g();
      if ($$2 != null) {
         cwn $$3 = this.a.a(0);
         cwn $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awj.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}
