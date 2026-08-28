public class csu extends crz {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final bsd r;

   public csu(int $$0, cot $$1) {
      this($$0, $$1, new bsr(9));
   }

   public csu(int $$0, cot $$1, bsd $$2) {
      super(cti.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(bsd $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new ctw($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cou $$0) {
      return this.r.a($$0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
