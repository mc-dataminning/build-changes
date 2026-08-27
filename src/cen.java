import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cen {
   private static final float a = 0.3F;

   public static ejs a(bkq $$0, Predicate<bkq> $$1) {
      eju $$2 = $$0.dq();
      csa $$3 = $$0.dN();
      eju $$4 = $$0.dl();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F);
   }

   public static ejs a(bkq $$0, Predicate<bkq> $$1, double $$2) {
      eju $$3 = $$0.f(0.0F).a($$2);
      csa $$4 = $$0.dN();
      eju $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F);
   }

   private static ejs a(eju $$0, bkq $$1, Predicate<bkq> $$2, eju $$3, csa $$4, float $$5) {
      eju $$6 = $$0.e($$3);
      ejs $$7 = $$4.a(new crj($$0, $$6, crj.a.a, crj.b.a, $$1));
      if ($$7.c() != ejs.a.a) {
         $$6 = $$7.e();
      }

      ejs $$8 = a($$4, $$1, $$0, $$6, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$8 != null) {
         $$7 = $$8;
      }

      return $$7;
   }

   @Nullable
   public static ejr a(bkq $$0, eju $$1, eju $$2, ejp $$3, Predicate<bkq> $$4, double $$5) {
      csa $$6 = $$0.dN();
      double $$7 = $$5;
      bkq $$8 = null;
      eju $$9 = null;

      for (bkq $$10 : $$6.a($$0, $$3, $$4)) {
         ejp $$11 = $$10.cH().g((double)$$10.bE());
         Optional<eju> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eju $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cX() == $$0.cX()) {
                  if ($$7 == 0.0) {
                     $$8 = $$10;
                     $$9 = $$13;
                  }
               } else {
                  $$8 = $$10;
                  $$9 = $$13;
                  $$7 = $$14;
               }
            }
         }
      }

      return $$8 == null ? null : new ejr($$8, $$9);
   }

   @Nullable
   public static ejr a(csa $$0, bkq $$1, eju $$2, eju $$3, ejp $$4, Predicate<bkq> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ejr a(csa $$0, bkq $$1, eju $$2, eju $$3, ejp $$4, Predicate<bkq> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bkq $$8 = null;

      for (bkq $$9 : $$0.a($$1, $$4, $$5)) {
         ejp $$10 = $$9.cH().g((double)$$6);
         Optional<eju> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ejr($$8);
   }

   public static void a(bkq $$0, float $$1) {
      eju $$2 = $$0.dq();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(atm.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(atm.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dF() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dF() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dD() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dD() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(atm.i($$1, $$0.O, $$0.dF()));
         $$0.r(atm.i($$1, $$0.N, $$0.dD()));
      }
   }

   public static biw a(blg $$0, cle $$1) {
      return $$0.eU().a($$1) ? biw.a : biw.b;
   }

   public static cea a(blg $$0, clj $$1, float $$2) {
      cix $$3 = (cix)($$1.d() instanceof cix ? $$1.d() : clm.os);
      cea $$4 = $$3.a($$0.dN(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(clm.vi) && $$4 instanceof cec) {
         ((cec)$$4).a($$1);
      }

      return $$4;
   }
}
