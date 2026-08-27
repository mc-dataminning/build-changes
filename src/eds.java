import com.mojang.serialization.Codec;

public class eds extends eca<eer> {
   public eds(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      ayt $$3 = $$0.d();
      if (a($$1, $$2)) {
         $$1.a($$2, b(), 2);
         a($$1, $$2.d(), $$3, 16);
         return true;
      } else {
         return false;
      }
   }

   private static dtc b() {
      return dfe.lr.n().a(dlm.b, Integer.valueOf(3));
   }

   public static void a(dcb $$0, ir $$1, ayt $$2, int $$3) {
      $$0.a($$1, dno.a($$0, $$1, dfe.ls.n()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   public static boolean a(dcb $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.a(dfe.lr)) {
         return false;
      } else {
         return $$2.a(awe.bR) ? false : !$$2.a(dfe.ls);
      }
   }

   private static void a(dcb $$0, ir $$1, ayt $$2, ir $$3, int $$4, int $$5) {
      dfc $$6 = dfe.ls;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         ir $$9 = $$1.c($$8 + 1);
         $$0.a($$9, dno.a($$0, $$9, $$6.n()), 2);
         $$0.a($$9.c(), dno.a($$0, $$9.c(), $$6.n()), 2);
      }

      if ($$5 < 4) {
         int $$10 = $$2.a(4);
         if ($$5 == 0) {
            $$10++;
         }

         for (int $$11 = 0; $$11 < $$10; $$11++) {
            iw $$12 = iw.c.a.a($$2);
            ir $$13 = $$1.c($$7).a($$12);
            if (Math.abs($$13.u() - $$3.u()) < $$4 && Math.abs($$13.w() - $$3.w()) < $$4 && a($$0, $$13) && a($$0, $$13.d())) {
               $$0.a($$13, dno.a($$0, $$13, $$6.n()), 2);
               $$0.a($$13.a($$12.g()), dno.a($$0, $$13.a($$12.g()), $$6.n()), 2);
               a($$0, $$13, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }
   }
}
