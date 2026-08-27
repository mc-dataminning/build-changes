public class cij extends cgr {
   private static final int k = 27;
   private final biu l;

   public cij(int $$0, cdy $$1) {
      this($$0, $$1, new bjj(27));
   }

   public cij(int $$0, cdy $$1, biu $$2) {
      super(chy.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cik($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cim($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cim($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return this.l.a($$0);
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return clo.b;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
