import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnp {
   private static final float a = 0.3F;

   public static ewu a(bsq $$0, Predicate<bsq> $$1) {
      eww $$2 = $$0.dt();
      dcu $$3 = $$0.dQ();
      eww $$4 = $$0.do();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dcd.a.a);
   }

   public static ewu a(bsq $$0, Predicate<bsq> $$1, dcd.a $$2) {
      eww $$3 = $$0.dt();
      dcu $$4 = $$0.dQ();
      eww $$5 = $$0.do();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ewu a(bsq $$0, Predicate<bsq> $$1, double $$2) {
      eww $$3 = $$0.g(0.0F).a($$2);
      dcu $$4 = $$0.dQ();
      eww $$5 = $$0.by();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dcd.a.a);
   }

   private static ewu a(eww $$0, bsq $$1, Predicate<bsq> $$2, eww $$3, dcu $$4, float $$5, dcd.a $$6) {
      eww $$7 = $$0.e($$3);
      ewu $$8 = $$4.a(new dcd($$0, $$7, $$6, dcd.b.a, $$1));
      if ($$8.c() != ewu.a.a) {
         $$7 = $$8.e();
      }

      ewu $$9 = a($$4, $$1, $$0, $$7, $$1.cL().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ewt a(bsq $$0, eww $$1, eww $$2, ewr $$3, Predicate<bsq> $$4, double $$5) {
      dcu $$6 = $$0.dQ();
      double $$7 = $$5;
      bsq $$8 = null;
      eww $$9 = null;

      for (bsq $$10 : $$6.a($$0, $$3, $$4)) {
         ewr $$11 = $$10.cL().g((double)$$10.bL());
         Optional<eww> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eww $$13 = $$12.get();
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

      return $$8 == null ? null : new ewt($$8, $$9);
   }

   @Nullable
   public static ewt a(dcu $$0, bsq $$1, eww $$2, eww $$3, ewr $$4, Predicate<bsq> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ewt a(dcu $$0, bsq $$1, eww $$2, eww $$3, ewr $$4, Predicate<bsq> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsq $$8 = null;

      for (bsq $$9 : $$0.a($$1, $$4, $$5)) {
         ewr $$10 = $$9.cL().g((double)$$6);
         Optional<eww> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ewt($$8);
   }

   public static void a(bsq $$0, float $$1) {
      eww $$2 = $$0.dt();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.s((float)(ayn.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.t((float)(ayn.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.t(ayn.i($$1, $$0.P, $$0.dI()));
         $$0.s(ayn.i($$1, $$0.O, $$0.dG()));
      }
   }

   public static bqp a(btl $$0, cuj $$1) {
      return $$0.eU().a($$1) ? bqp.a : bqp.b;
   }

   public static cnb a(btl $$0, cuo $$1, float $$2, @Nullable cuo $$3) {
      csh $$4 = (csh)($$1.g() instanceof csh ? $$1.g() : cur.ow);
      cnb $$5 = $$4.a($$0.dQ(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
