public class cvx extends cvc {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final btz r;

   public cvx(int $$0, cri $$1) {
      this($$0, $$1, new bun(9));
   }

   public cvx(int $$0, cri $$1, btz $$2) {
      super(cwl.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.c_($$1.h);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(btz $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new cwz($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(crj $$0) {
      return this.r.a($$0);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return czk.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
