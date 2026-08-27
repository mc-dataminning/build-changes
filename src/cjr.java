public class cjr extends cjv {
   private final ciq a;
   private final cfh b;
   private int c;

   public cjr(cfh $$0, ciq $$1, bjt $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cmx $$0) {
      return false;
   }

   @Override
   public cmx a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cmx $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cmx $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dM(), this.b, this.c);
      }

      if (this.d instanceof cjp $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cfh $$0, cmx $$1) {
      this.b_($$1);
      iq<cmx> $$2 = $$0.dM().r().c(cqg.a, this.a, $$0.dM());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cmx $$4 = this.a.a($$3);
         cmx $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cmx.c($$4, $$5)) {
               $$5.g($$4.L());
               this.a.a($$3, $$5);
            } else if (!this.b.fS().e($$5)) {
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
