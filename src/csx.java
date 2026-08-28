public class csx extends csc {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final bsc r;

   public csx(int $$0, cow $$1) {
      this($$0, $$1, new bsq(9));
   }

   public csx(int $$0, cow $$1, bsc $$2) {
      super(ctl.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(bsc $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new ctz($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cox $$0) {
      return this.r.a($$0);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
