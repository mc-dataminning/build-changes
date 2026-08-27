public class clt extends ckb {
   private static final int k = 27;
   private final bln l;

   public clt(int $$0, chg $$1) {
      this($$0, $$1, new bmd(27));
   }

   public clt(int $$0, chg $$1, bln $$2) {
      super(cli.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new clu($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new clw($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new clw($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(chh $$0) {
      return this.l.a($$0);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return coz.h;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
