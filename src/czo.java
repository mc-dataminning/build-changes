public class czo extends cvd implements czn {
   public czo(dfk.d $$0) {
      super($$0, bgc.a(1));
   }

   @Override
   public int a(czs.a $$0, cpy $$1, gw $$2, ase $$3, czs $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         gw $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               gw $$10 = $$7.c();
               dfl $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), apg.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(czs $$0, gw $$1, gw $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ary.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ary.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dfl a(cpy $$0, gw $$1, ase $$2, boolean $$3) {
      dfl $$4;
      if ($$2.a(11) == 0) {
         $$4 = csy.qI.n().a(czr.c, Boolean.valueOf($$3));
      } else {
         $$4 = csy.qD.n();
      }

      return $$4.b(dgb.C) && !$$0.b_($$1).c() ? $$4.a(dgb.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cpy $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(csy.G) && $$2.u().b(eap.c)) {
         int $$3 = 0;

         for (gw $$4 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dfl $$5 = $$0.a_($$4);
            if ($$5.a(csy.qD) || $$5.a(csy.qI)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      return false;
   }
}
