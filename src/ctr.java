public class ctr extends csw {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final bsr r;

   public ctr(int $$0, cpq $$1) {
      this($$0, $$1, new btf(9));
   }

   public ctr(int $$0, cpq $$1, bsr $$2) {
      super(cuf.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(bsr $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new cut($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cpr $$0) {
      return this.r.a($$0);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
