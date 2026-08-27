public class coo extends cos {
   private final cnm a;
   private final cka b;
   private int c;

   public coo(cka $$0, cnm $$1, bny $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(crs $$0) {
      return false;
   }

   @Override
   public crs a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(crs $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(crs $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dM(), this.b, this.c);
      }

      if (this.d instanceof col $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cka $$0, crs $$1) {
      this.b_($$1);
      iw<crs> $$2 = $$0.dM().r().c(cvx.a, this.a, $$0.dM());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         crs $$4 = this.a.a($$3);
         crs $$5 = $$2.get($$3);
         if (!$$4.d()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.d()) {
            if ($$4.d()) {
               this.a.a($$3, $$5);
            } else if (crs.c($$4, $$5)) {
               $$5.f($$4.G());
               this.a.a($$3, $$5);
            } else if (!this.b.fZ().e($$5)) {
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
