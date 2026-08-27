import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cjo {
   private static final float a = 0.3F;

   public static epr a(box $$0, Predicate<box> $$1) {
      ept $$2 = $$0.dp();
      cxb $$3 = $$0.dM();
      ept $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cwk.a.a);
   }

   public static epr a(box $$0, Predicate<box> $$1, cwk.a $$2) {
      ept $$3 = $$0.dp();
      cxb $$4 = $$0.dM();
      ept $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static epr a(box $$0, Predicate<box> $$1, double $$2) {
      ept $$3 = $$0.f(0.0F).a($$2);
      cxb $$4 = $$0.dM();
      ept $$5 = $$0.bu();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cwk.a.a);
   }

   private static epr a(ept $$0, box $$1, Predicate<box> $$2, ept $$3, cxb $$4, float $$5, cwk.a $$6) {
      ept $$7 = $$0.e($$3);
      epr $$8 = $$4.a(new cwk($$0, $$7, $$6, cwk.b.a, $$1));
      if ($$8.c() != epr.a.a) {
         $$7 = $$8.e();
      }

      epr $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static epq a(box $$0, ept $$1, ept $$2, epo $$3, Predicate<box> $$4, double $$5) {
      cxb $$6 = $$0.dM();
      double $$7 = $$5;
      box $$8 = null;
      ept $$9 = null;

      for (box $$10 : $$6.a($$0, $$3, $$4)) {
         epo $$11 = $$10.cH().g((double)$$10.bH());
         Optional<ept> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ept $$13 = $$12.get();
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

      return $$8 == null ? null : new epq($$8, $$9);
   }

   @Nullable
   public static epq a(cxb $$0, box $$1, ept $$2, ept $$3, epo $$4, Predicate<box> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static epq a(cxb $$0, box $$1, ept $$2, ept $$3, epo $$4, Predicate<box> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      box $$8 = null;

      for (box $$9 : $$0.a($$1, $$4, $$5)) {
         epo $$10 = $$9.cH().g((double)$$6);
         Optional<ept> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new epq($$8);
   }

   public static void a(box $$0, float $$1) {
      ept $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aww.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aww.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(aww.i($$1, $$0.O, $$0.dE()));
         $$0.r(aww.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bnc a(bpp $$0, cqh $$1) {
      return $$0.eU().a($$1) ? bnc.a : bnc.b;
   }

   public static cja a(bpp $$0, cqm $$1, float $$2) {
      coc $$3 = (coc)($$1.d() instanceof coc ? $$1.d() : cqp.ou);
      cja $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cqp.vo) && $$4 instanceof cjc) {
         ((cjc)$$4).a($$1);
      }

      return $$4;
   }
}
