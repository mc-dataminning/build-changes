public class ctx extends csd {
   private static final int m = 27;
   private final bse n;

   public ctx(int $$0, cox $$1) {
      this($$0, $$1, new bss(27));
   }

   public ctx(int $$0, cox $$1, bse $$2) {
      super(ctm.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cty($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coy $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
