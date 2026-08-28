public class csv extends ctg {
   private final cst a;
   private final coh b;
   private int g;
   private final ddr h;

   public csv(coh $$0, ddr $$1, cst $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cvx $$0) {
      return false;
   }

   @Override
   public cvx a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvx $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvx $$0) {
      $$0.a(this.b.dX(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(coh $$0, cvx $$1) {
      this.b_($$1);
      dds $$2 = this.a.g();
      if ($$2 != null) {
         cvx $$3 = this.a.a(0);
         cvx $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awu.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
