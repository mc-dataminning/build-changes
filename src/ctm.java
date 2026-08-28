public class ctm extends crs {
   private static final int m = 27;
   private final bsa n;

   public ctm(int $$0, coq $$1) {
      this($$0, $$1, new bso(27));
   }

   public ctm(int $$0, coq $$1, bsa $$2) {
      super(ctb.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new ctn($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cor $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
