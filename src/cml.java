public class cml extends cmp {
   private final clk a;
   private final cia b;
   private int c;

   public cml(cia $$0, clk $$1, bme $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cpq $$0) {
      return false;
   }

   @Override
   public cpq a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cpq $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cpq $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dJ(), this.b, this.c);
      }

      if (this.d instanceof cmj $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cia $$0, cpq $$1) {
      this.b_($$1);
      iu<cpq> $$2 = $$0.dJ().r().c(csx.a, this.a, $$0.dJ());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cpq $$4 = this.a.a($$3);
         cpq $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cpq.c($$4, $$5)) {
               $$5.g($$4.M());
               this.a.a($$3, $$5);
            } else if (!this.b.fV().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}
