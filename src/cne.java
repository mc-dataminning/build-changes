import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cne {
   private static final float a = 0.3F;

   public static ewd a(bsg $$0, Predicate<bsg> $$1) {
      ewf $$2 = $$0.dt();
      dcf $$3 = $$0.dQ();
      ewf $$4 = $$0.do();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbo.a.a);
   }

   public static ewd a(bsg $$0, Predicate<bsg> $$1, dbo.a $$2) {
      ewf $$3 = $$0.dt();
      dcf $$4 = $$0.dQ();
      ewf $$5 = $$0.do();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ewd a(bsg $$0, Predicate<bsg> $$1, double $$2) {
      ewf $$3 = $$0.g(0.0F).a($$2);
      dcf $$4 = $$0.dQ();
      ewf $$5 = $$0.by();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbo.a.a);
   }

   private static ewd a(ewf $$0, bsg $$1, Predicate<bsg> $$2, ewf $$3, dcf $$4, float $$5, dbo.a $$6) {
      ewf $$7 = $$0.e($$3);
      ewd $$8 = $$4.a(new dbo($$0, $$7, $$6, dbo.b.a, $$1));
      if ($$8.c() != ewd.a.a) {
         $$7 = $$8.e();
      }

      ewd $$9 = a($$4, $$1, $$0, $$7, $$1.cL().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ewc a(bsg $$0, ewf $$1, ewf $$2, ewa $$3, Predicate<bsg> $$4, double $$5) {
      dcf $$6 = $$0.dQ();
      double $$7 = $$5;
      bsg $$8 = null;
      ewf $$9 = null;

      for (bsg $$10 : $$6.a($$0, $$3, $$4)) {
         ewa $$11 = $$10.cL().g((double)$$10.bL());
         Optional<ewf> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ewf $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.da() == $$0.da()) {
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

      return $$8 == null ? null : new ewc($$8, $$9);
   }

   @Nullable
   public static ewc a(dcf $$0, bsg $$1, ewf $$2, ewf $$3, ewa $$4, Predicate<bsg> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ewc a(dcf $$0, bsg $$1, ewf $$2, ewf $$3, ewa $$4, Predicate<bsg> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsg $$8 = null;

      for (bsg $$9 : $$0.a($$1, $$4, $$5)) {
         ewa $$10 = $$9.cL().g((double)$$6);
         Optional<ewf> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ewc($$8);
   }

   public static void a(bsg $$0, float $$1) {
      ewf $$2 = $$0.dt();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.s((float)(ayg.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.t((float)(ayg.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dI() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dI() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dG() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dG() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.t(ayg.i($$1, $$0.P, $$0.dI()));
         $$0.s(ayg.i($$1, $$0.O, $$0.dG()));
      }
   }

   public static bqf a(btb $$0, ctx $$1) {
      return $$0.eU().a($$1) ? bqf.a : bqf.b;
   }

   public static cmq a(btb $$0, cuc $$1, float $$2, @Nullable cuc $$3) {
      crw $$4 = (crw)($$1.g() instanceof crw ? $$1.g() : cuf.ow);
      cmq $$5 = $$4.a($$0.dQ(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
