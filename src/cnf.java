import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnf {
   private static final float a = 0.3F;

   public static ewf a(bsh $$0, Predicate<bsh> $$1) {
      ewh $$2 = $$0.du();
      dcg $$3 = $$0.dR();
      ewh $$4 = $$0.dp();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbp.a.a);
   }

   public static ewf a(bsh $$0, Predicate<bsh> $$1, dbp.a $$2) {
      ewh $$3 = $$0.du();
      dcg $$4 = $$0.dR();
      ewh $$5 = $$0.dp();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ewf a(bsh $$0, Predicate<bsh> $$1, double $$2) {
      ewh $$3 = $$0.g(0.0F).a($$2);
      dcg $$4 = $$0.dR();
      ewh $$5 = $$0.bz();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbp.a.a);
   }

   private static ewf a(ewh $$0, bsh $$1, Predicate<bsh> $$2, ewh $$3, dcg $$4, float $$5, dbp.a $$6) {
      ewh $$7 = $$0.e($$3);
      ewf $$8 = $$4.a(new dbp($$0, $$7, $$6, dbp.b.a, $$1));
      if ($$8.c() != ewf.a.a) {
         $$7 = $$8.e();
      }

      ewf $$9 = a($$4, $$1, $$0, $$7, $$1.cM().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ewe a(bsh $$0, ewh $$1, ewh $$2, ewc $$3, Predicate<bsh> $$4, double $$5) {
      dcg $$6 = $$0.dR();
      double $$7 = $$5;
      bsh $$8 = null;
      ewh $$9 = null;

      for (bsh $$10 : $$6.a($$0, $$3, $$4)) {
         ewc $$11 = $$10.cM().g((double)$$10.bM());
         Optional<ewh> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ewh $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.db() == $$0.db()) {
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

      return $$8 == null ? null : new ewe($$8, $$9);
   }

   @Nullable
   public static ewe a(dcg $$0, bsh $$1, ewh $$2, ewh $$3, ewc $$4, Predicate<bsh> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ewe a(dcg $$0, bsh $$1, ewh $$2, ewh $$3, ewc $$4, Predicate<bsh> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsh $$8 = null;

      for (bsh $$9 : $$0.a($$1, $$4, $$5)) {
         ewc $$10 = $$9.cM().g((double)$$6);
         Optional<ewh> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ewe($$8);
   }

   public static void a(bsh $$0, float $$1) {
      ewh $$2 = $$0.du();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.s((float)(ayg.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.t((float)(ayg.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dJ() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dJ() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dH() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dH() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.t(ayg.i($$1, $$0.P, $$0.dJ()));
         $$0.s(ayg.i($$1, $$0.O, $$0.dH()));
      }
   }

   public static bqg a(btc $$0, cty $$1) {
      return $$0.eV().a($$1) ? bqg.a : bqg.b;
   }

   public static cmr a(btc $$0, cud $$1, float $$2, @Nullable cud $$3) {
      crx $$4 = (crx)($$1.g() instanceof crx ? $$1.g() : cug.ow);
      cmr $$5 = $$4.a($$0.dR(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
