import java.util.Optional;

public final class bvl {
   public static Optional<euk> a(bsq $$0, euk $$1, float $$2, int $$3, boolean $$4) {
      euk $$5 = $$0.dn();
      euk $$6 = new euk($$1.c - $$5.c, 0.0, $$1.e - $$5.e).d().a(0.5);
      euk $$7 = $$1.d($$6);
      euk $$8 = $$7.d($$5);
      float $$9 = (float)$$3 * (float) Math.PI / 180.0F;
      double $$10 = Math.atan2($$8.e, $$8.c);
      double $$11 = $$8.a(0.0, $$8.d, 0.0).g();
      double $$12 = Math.sqrt($$11);
      double $$13 = $$8.d;
      double $$14 = $$0.aZ();
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
               int $$25 = ayd.c($$12 / $$23) * 2;
               double $$26 = 0.0;
               euk $$27 = null;
               brx $$28 = $$0.a(bta.g);

               for (int $$29 = 0; $$29 < $$25 - 1; $$29++) {
                  $$26 += $$12 / (double)$$25;
                  double $$30 = $$17 / $$18 * $$26 - Math.pow($$26, 2.0) * $$14 / (2.0 * $$21 * Math.pow($$18, 2.0));
                  double $$31 = $$26 * $$20;
                  double $$32 = $$26 * $$19;
                  euk $$33 = new euk($$5.c + $$31, $$5.d + $$30, $$5.e + $$32);
                  if ($$27 != null && !a($$0, $$28, $$27, $$33)) {
                     return Optional.empty();
                  }

                  $$27 = $$33;
               }
            }

            return Optional.of(new euk($$23 * $$20, $$24, $$23 * $$19).a(0.95F));
         }
      }
   }

   private static boolean a(bsq $$0, brx $$1, euk $$2, euk $$3) {
      euk $$4 = $$3.d($$2);
      double $$5 = (double)Math.min($$1.a(), $$1.b());
      int $$6 = ayd.c($$4.f() / $$5);
      euk $$7 = $$4.d();
      euk $$8 = $$2;

      for (int $$9 = 0; $$9 < $$6; $$9++) {
         $$8 = $$9 == $$6 - 1 ? $$3 : $$8.e($$7.a($$5 * 0.9F));
         if (!$$0.dP().a($$0, $$1.a($$8))) {
            return false;
         }
      }

      return true;
   }
}
