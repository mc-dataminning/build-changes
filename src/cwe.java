public class cwe extends crt implements cwd {
   public cwe(dca.d $$0) {
      super($$0, bcz.a(1));
   }

   @Override
   public int a(cwi.a $$0, cmn $$1, gu $$2, apf $$3, cwi $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         gu $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               gu $$10 = $$7.c();
               dcb $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), ami.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(cwi $$0, gu $$1, gu $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = apa.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = apa.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dcb a(cmn $$0, gu $$1, apf $$2, boolean $$3) {
      dcb $$4;
      if ($$2.a(11) == 0) {
         $$4 = cpo.qI.n().a(cwh.c, Boolean.valueOf($$3));
      } else {
         $$4 = cpo.qD.n();
      }

      return $$4.b(dcr.C) && !$$0.b_($$1).c() ? $$4.a(dcr.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cmn $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cpo.G) && $$2.u().b(dxf.c)) {
         int $$3 = 0;

         for (gu $$4 : gu.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dcb $$5 = $$0.a_($$4);
            if ($$5.a(cpo.qD) || $$5.a(cpo.qI)) {
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
