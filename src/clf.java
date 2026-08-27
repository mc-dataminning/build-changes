import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class clf {
   private static final float a = 0.3F;

   public static etd a(bql $$0, Predicate<bql> $$1) {
      etf $$2 = $$0.dq();
      czu $$3 = $$0.dN();
      etf $$4 = $$0.dl();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, czd.a.a);
   }

   public static etd a(bql $$0, Predicate<bql> $$1, czd.a $$2) {
      etf $$3 = $$0.dq();
      czu $$4 = $$0.dN();
      etf $$5 = $$0.dl();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static etd a(bql $$0, Predicate<bql> $$1, double $$2) {
      etf $$3 = $$0.f(0.0F).a($$2);
      czu $$4 = $$0.dN();
      etf $$5 = $$0.bv();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, czd.a.a);
   }

   private static etd a(etf $$0, bql $$1, Predicate<bql> $$2, etf $$3, czu $$4, float $$5, czd.a $$6) {
      etf $$7 = $$0.e($$3);
      etd $$8 = $$4.a(new czd($$0, $$7, $$6, czd.b.a, $$1));
      if ($$8.c() != etd.a.a) {
         $$7 = $$8.e();
      }

      etd $$9 = a($$4, $$1, $$0, $$7, $$1.cI().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static etc a(bql $$0, etf $$1, etf $$2, eta $$3, Predicate<bql> $$4, double $$5) {
      czu $$6 = $$0.dN();
      double $$7 = $$5;
      bql $$8 = null;
      etf $$9 = null;

      for (bql $$10 : $$6.a($$0, $$3, $$4)) {
         eta $$11 = $$10.cI().g((double)$$10.bI());
         Optional<etf> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            etf $$13 = $$12.get();
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

      return $$8 == null ? null : new etc($$8, $$9);
   }

   @Nullable
   public static etc a(czu $$0, bql $$1, etf $$2, etf $$3, eta $$4, Predicate<bql> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static etc a(czu $$0, bql $$1, etf $$2, etf $$3, eta $$4, Predicate<bql> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bql $$8 = null;

      for (bql $$9 : $$0.a($$1, $$4, $$5)) {
         eta $$10 = $$9.cI().g((double)$$6);
         Optional<etf> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new etc($$8);
   }

   public static void a(bql $$0, float $$1) {
      etf $$2 = $$0.dq();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(axw.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(axw.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(axw.i($$1, $$0.P, $$0.dF()));
         $$0.r(axw.i($$1, $$0.O, $$0.dD()));
      }
   }

   public static bop a(bre $$0, cry $$1) {
      return $$0.eV().a($$1) ? bop.a : bop.b;
   }

   public static ckr a(bre $$0, csd $$1, float $$2) {
      cpw $$3 = (cpw)($$1.f() instanceof cpw ? $$1.f() : csg.ov);
      ckr $$4 = $$3.a($$0.dN(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
