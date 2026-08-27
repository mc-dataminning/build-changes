import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cci {
   public static ehg a(bil $$0, Predicate<bil> $$1) {
      ehi $$2 = $$0.dn();
      cpq $$3 = $$0.dK();
      ehi $$4 = $$0.di();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehg a(bil $$0, Predicate<bil> $$1, double $$2) {
      ehi $$3 = $$0.f(0.0F).a($$2);
      cpq $$4 = $$0.dK();
      ehi $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehg a(ehi $$0, bil $$1, Predicate<bil> $$2, ehi $$3, cpq $$4) {
      ehi $$5 = $$0.e($$3);
      ehg $$6 = $$4.a(new coz($$0, $$5, coz.a.a, coz.b.a, $$1));
      if ($$6.c() != ehg.a.a) {
         $$5 = $$6.e();
      }

      ehg $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static ehf a(bil $$0, ehi $$1, ehi $$2, ehd $$3, Predicate<bil> $$4, double $$5) {
      cpq $$6 = $$0.dK();
      double $$7 = $$5;
      bil $$8 = null;
      ehi $$9 = null;

      for (bil $$10 : $$6.a($$0, $$3, $$4)) {
         ehd $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehi> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehi $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cV() == $$0.cV()) {
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

      return $$8 == null ? null : new ehf($$8, $$9);
   }

   @Nullable
   public static ehf a(cpq $$0, bil $$1, ehi $$2, ehi $$3, ehd $$4, Predicate<bil> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ehf a(cpq $$0, bil $$1, ehi $$2, ehi $$3, ehd $$4, Predicate<bil> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bil $$8 = null;

      for (bil $$9 : $$0.a($$1, $$4, $$5)) {
         ehd $$10 = $$9.cG().g((double)$$6);
         Optional<ehi> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ehf($$8);
   }

   public static void a(bil $$0, float $$1) {
      ehi $$2 = $$0.dn();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ars.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ars.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dC() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dC() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dA() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dA() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(ars.i($$1, $$0.O, $$0.dC()));
         $$0.r(ars.i($$1, $$0.N, $$0.dA()));
      }
   }

   public static bgs a(bjb $$0, civ $$1) {
      return $$0.eR().a($$1) ? bgs.a : bgs.b;
   }

   public static cbv a(bjb $$0, cja $$1, float $$2) {
      cgo $$3 = (cgo)($$1.d() instanceof cgo ? $$1.d() : cjd.nH);
      cbv $$4 = $$3.a($$0.dK(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cjd.uw) && $$4 instanceof cbx) {
         ((cbx)$$4).a($$1);
      }

      return $$4;
   }
}
