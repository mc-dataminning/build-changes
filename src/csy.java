public class csy extends csd {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final bse r;

   public csy(int $$0, cox $$1) {
      this($$0, $$1, new bss(9));
   }

   public csy(int $$0, cox $$1, bse $$2) {
      super(ctm.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(bse $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new cua($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(coy $$0) {
      return this.r.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
