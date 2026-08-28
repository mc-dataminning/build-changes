public class cxm extends cvs {
   private static final int m = 27;
   private final bum n;

   public cxm(int $$0, cry $$1) {
      this($$0, $$1, new bva(27));
   }

   public cxm(int $$0, cry $$1, bum $$2) {
      super(cxb.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.h);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cxn($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crz $$0) {
      return this.n.a($$0);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return daa.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
