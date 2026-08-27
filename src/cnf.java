public class cnf extends cnj {
   private final cme a;
   private final cis b;
   private int c;

   public cnf(cis $$0, cme $$1, bmv $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cqk $$0) {
      return false;
   }

   @Override
   public cqk a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cqk $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cqk $$0) {
      if (this.c > 0) {
         $$0.a(this.b.dM(), this.b, this.c);
      }

      if (this.d instanceof cnd $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.c = 0;
   }

   @Override
   public void a(cis $$0, cqk $$1) {
      this.b_($$1);
      iu<cqk> $$2 = $$0.dM().r().c(cts.a, this.a, $$0.dM());

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         cqk $$4 = this.a.a($$3);
         cqk $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cqk.c($$4, $$5)) {
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
