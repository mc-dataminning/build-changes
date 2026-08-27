public class cnv extends cmw {
   public static final int k = 5;
   private final bny l;

   public cnv(int $$0, cjz $$1) {
      this($$0, $$1, new boo(5));
   }

   public cnv(int $$0, cjz $$1, bny $$2) {
      super(cod.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cos($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cos($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cos($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(cka $$0) {
      return this.l.a($$0);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return crs.i;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
