public class ctu extends csa {
   private static final int m = 27;
   private final bsb n;

   public ctu(int $$0, cou $$1) {
      this($$0, $$1, new bsp(27));
   }

   public ctu(int $$0, cou $$1, bsb $$2) {
      super(ctj.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new ctv($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cov $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
