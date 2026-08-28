public class cwe extends cuk {
   private static final int m = 27;
   private final btr n;

   public cwe(int $$0, cqr $$1) {
      this($$0, $$1, new buf(27));
   }

   public cwe(int $$0, cqr $$1, btr $$2) {
      super(cvt.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cwf($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqs $$0) {
      return this.n.a($$0);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cys.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
