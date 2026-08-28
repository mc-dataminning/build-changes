public class cwp extends cuv {
   private static final int m = 27;
   private final btw n;

   public cwp(int $$0, crb $$1) {
      this($$0, $$1, new buk(27));
   }

   public cwp(int $$0, crb $$1, btw $$2) {
      super(cwe.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.h);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cwq($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crc $$0) {
      return this.n.a($$0);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czd.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
