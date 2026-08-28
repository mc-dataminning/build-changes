import java.util.Optional;

public final class cba {
   public static Optional<fgc> a(byh $$0, fgc $$1, float $$2, int $$3, boolean $$4) {
      fgc $$5 = $$0.dt();
      fgc $$6 = new fgc($$1.d - $$5.d, 0.0, $$1.f - $$5.f).d().c(0.5);
      fgc $$7 = $$1.d($$6);
      fgc $$8 = $$7.d($$5);
      float $$9 = (float)$$3 * (float) Math.PI / 180.0F;
      double $$10 = Math.atan2($$8.f, $$8.d);
      double $$11 = $$8.a(0.0, $$8.e, 0.0).h();
      double $$12 = Math.sqrt($$11);
      double $$13 = $$8.e;
      double $$14 = $$0.bd();
      double $$15 = Math.sin((double)(2.0F * $$9));
      double $$16 = Math.pow(Math.cos((double)$$9), 2.0);
      double $$17 = Math.sin((double)$$9);
      double $$18 = Math.cos((double)$$9);
      double $$19 = Math.sin($$10);
      double $$20 = Math.cos($$10);
      double $$21 = $$11 * $$14 / ($$12 * $$15 - 2.0 * $$13 * $$16);
      if ($$21 < 0.0) {
         return Optional.empty();
      } else {
         double $$22 = Math.sqrt($$21);
         if ($$22 > (double)$$2) {
            return Optional.empty();
         } else {
            double $$23 = $$22 * $$18;
            double $$24 = $$22 * $$17;
            if ($$4) {
               int $$25 = azz.c($$12 / $$23) * 2;
               double $$26 = 0.0;
               fgc $$27 = null;
               bxh $$28 = $$0.a(byr.g);

               for (int $$29 = 0; $$29 < $$25 - 1; $$29++) {
                  $$26 += $$12 / (double)$$25;
                  double $$30 = $$17 / $$18 * $$26 - Math.pow($$26, 2.0) * $$14 / (2.0 * $$21 * Math.pow($$18, 2.0));
                  double $$31 = $$26 * $$20;
                  double $$32 = $$26 * $$19;
                  fgc $$33 = new fgc($$5.d + $$31, $$5.e + $$30, $$5.f + $$32);
                  if ($$27 != null && !a($$0, $$28, $$27, $$33)) {
                     return Optional.empty();
                  }

                  $$27 = $$33;
               }
            }

            return Optional.of(new fgc($$23 * $$20, $$24, $$23 * $$19).c(0.95F));
         }
      }
   }

   private static boolean a(byh $$0, bxh $$1, fgc $$2, fgc $$3) {
      fgc $$4 = $$3.d($$2);
      double $$5 = (double)Math.min($$1.a(), $$1.b());
      int $$6 = azz.c($$4.g() / $$5);
      fgc $$7 = $$4.d();
      fgc $$8 = $$2;

      for (int $$9 = 0; $$9 < $$6; $$9++) {
         $$8 = $$9 == $$6 - 1 ? $$3 : $$8.e($$7.c($$5 * 0.9F));
         if (!$$0.dV().a($$0, $$1.a($$8))) {
            return false;
         }
      }

      return true;
   }
}
