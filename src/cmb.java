import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cmb {
   private static final float a = 0.3F;

   public static etn a(brh $$0, Predicate<brh> $$1) {
      etp $$2 = $$0.dq();
      dad $$3 = $$0.dN();
      etp $$4 = $$0.dl();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, czm.a.a);
   }

   public static etn a(brh $$0, Predicate<brh> $$1, czm.a $$2) {
      etp $$3 = $$0.dq();
      dad $$4 = $$0.dN();
      etp $$5 = $$0.dl();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static etn a(brh $$0, Predicate<brh> $$1, double $$2) {
      etp $$3 = $$0.f(0.0F).a($$2);
      dad $$4 = $$0.dN();
      etp $$5 = $$0.bv();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, czm.a.a);
   }

   private static etn a(etp $$0, brh $$1, Predicate<brh> $$2, etp $$3, dad $$4, float $$5, czm.a $$6) {
      etp $$7 = $$0.e($$3);
      etn $$8 = $$4.a(new czm($$0, $$7, $$6, czm.b.a, $$1));
      if ($$8.c() != etn.a.a) {
         $$7 = $$8.e();
      }

      etn $$9 = a($$4, $$1, $$0, $$7, $$1.cI().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static etm a(brh $$0, etp $$1, etp $$2, etk $$3, Predicate<brh> $$4, double $$5) {
      dad $$6 = $$0.dN();
      double $$7 = $$5;
      brh $$8 = null;
      etp $$9 = null;

      for (brh $$10 : $$6.a($$0, $$3, $$4)) {
         etk $$11 = $$10.cI().g((double)$$10.bI());
         Optional<etp> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            etp $$13 = $$12.get();
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

      return $$8 == null ? null : new etm($$8, $$9);
   }

   @Nullable
   public static etm a(dad $$0, brh $$1, etp $$2, etp $$3, etk $$4, Predicate<brh> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static etm a(dad $$0, brh $$1, etp $$2, etp $$3, etk $$4, Predicate<brh> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      brh $$8 = null;

      for (brh $$9 : $$0.a($$1, $$4, $$5)) {
         etk $$10 = $$9.cI().g((double)$$6);
         Optional<etp> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new etm($$8);
   }

   public static void a(brh $$0, float $$1) {
      etp $$2 = $$0.dq();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(axz.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(axz.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dF() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dF() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dD() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dD() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.s(axz.i($$1, $$0.P, $$0.dF()));
         $$0.r(axz.i($$1, $$0.O, $$0.dD()));
      }
   }

   public static bpl a(bsa $$0, csu $$1) {
      return $$0.eV().a($$1) ? bpl.a : bpl.b;
   }

   public static cln a(bsa $$0, csz $$1, float $$2) {
      cqs $$3 = (cqs)($$1.f() instanceof cqs ? $$1.f() : ctc.ov);
      cln $$4 = $$3.a($$0.dN(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
