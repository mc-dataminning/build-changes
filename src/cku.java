import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cku {
   private static final float a = 0.3F;

   public static esh a(bqa $$0, Predicate<bqa> $$1) {
      esj $$2 = $$0.dp();
      czg $$3 = $$0.dM();
      esj $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cyp.a.a);
   }

   public static esh a(bqa $$0, Predicate<bqa> $$1, cyp.a $$2) {
      esj $$3 = $$0.dp();
      czg $$4 = $$0.dM();
      esj $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static esh a(bqa $$0, Predicate<bqa> $$1, double $$2) {
      esj $$3 = $$0.f(0.0F).a($$2);
      czg $$4 = $$0.dM();
      esj $$5 = $$0.bu();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cyp.a.a);
   }

   private static esh a(esj $$0, bqa $$1, Predicate<bqa> $$2, esj $$3, czg $$4, float $$5, cyp.a $$6) {
      esj $$7 = $$0.e($$3);
      esh $$8 = $$4.a(new cyp($$0, $$7, $$6, cyp.b.a, $$1));
      if ($$8.c() != esh.a.a) {
         $$7 = $$8.e();
      }

      esh $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static esg a(bqa $$0, esj $$1, esj $$2, ese $$3, Predicate<bqa> $$4, double $$5) {
      czg $$6 = $$0.dM();
      double $$7 = $$5;
      bqa $$8 = null;
      esj $$9 = null;

      for (bqa $$10 : $$6.a($$0, $$3, $$4)) {
         ese $$11 = $$10.cH().g((double)$$10.bH());
         Optional<esj> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            esj $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cW() == $$0.cW()) {
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

      return $$8 == null ? null : new esg($$8, $$9);
   }

   @Nullable
   public static esg a(czg $$0, bqa $$1, esj $$2, esj $$3, ese $$4, Predicate<bqa> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static esg a(czg $$0, bqa $$1, esj $$2, esj $$3, ese $$4, Predicate<bqa> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bqa $$8 = null;

      for (bqa $$9 : $$0.a($$1, $$4, $$5)) {
         ese $$10 = $$9.cH().g((double)$$6);
         Optional<esj> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new esg($$8);
   }

   public static void a(bqa $$0, float $$1) {
      esj $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(axm.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(axm.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dE() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dE() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dC() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dC() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(axm.i($$1, $$0.O, $$0.dE()));
         $$0.r(axm.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static boe a(bqt $$0, crn $$1) {
      return $$0.eU().a($$1) ? boe.a : boe.b;
   }

   public static ckg a(bqt $$0, crs $$1, float $$2) {
      cpl $$3 = (cpl)($$1.f() instanceof cpl ? $$1.f() : crv.ou);
      ckg $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
