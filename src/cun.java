public class cun extends cst {
   private static final int m = 27;
   private final bst n;

   public cun(int $$0, cpn $$1) {
      this($$0, $$1, new bth(27));
   }

   public cun(int $$0, cpn $$1, bst $$2) {
      super(cuc.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cuo($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpo $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
