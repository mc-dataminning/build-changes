public class cnh extends cnl {
   private final cmg a;
   private final ciu b;
   private int c;

   public cnh(ciu $$0, cmg $$1, bmw $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cqm $$0) {
      return false;
   }

   @Override
   public cqm a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cqm $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cqm $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dM(), this.b, this.c);
      }

      if (this.d instanceof cnf $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(ciu $$0, cqm $$1) {
      this.b_($$1);
      iu<cqm> $$2 = $$0.dM().r().c(ctu.a, this.a, $$0.dM());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cqm $$4 = this.a.a($$3);
         cqm $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cqm.c($$4, $$5)) {
               $$5.g($$4.M());
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
