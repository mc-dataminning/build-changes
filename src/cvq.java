public class cvq extends cuv {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final btw r;

   public cvq(int $$0, crb $$1) {
      this($$0, $$1, new buk(9));
   }

   public cvq(int $$0, crb $$1, btw $$2) {
      super(cwe.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.h);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(btw $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new cws($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(crc $$0) {
      return this.r.a($$0);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return czd.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
