import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cjm {
   private static final float a = 0.3F;

   public static epp a(bow $$0, Predicate<bow> $$1) {
      epr $$2 = $$0.dp();
      cwz $$3 = $$0.dM();
      epr $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cwi.a.a);
   }

   public static epp a(bow $$0, Predicate<bow> $$1, cwi.a $$2) {
      epr $$3 = $$0.dp();
      cwz $$4 = $$0.dM();
      epr $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static epp a(bow $$0, Predicate<bow> $$1, double $$2) {
      epr $$3 = $$0.f(0.0F).a($$2);
      cwz $$4 = $$0.dM();
      epr $$5 = $$0.bu();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cwi.a.a);
   }

   private static epp a(epr $$0, bow $$1, Predicate<bow> $$2, epr $$3, cwz $$4, float $$5, cwi.a $$6) {
      epr $$7 = $$0.e($$3);
      epp $$8 = $$4.a(new cwi($$0, $$7, $$6, cwi.b.a, $$1));
      if ($$8.c() != epp.a.a) {
         $$7 = $$8.e();
      }

      epp $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static epo a(bow $$0, epr $$1, epr $$2, epm $$3, Predicate<bow> $$4, double $$5) {
      cwz $$6 = $$0.dM();
      double $$7 = $$5;
      bow $$8 = null;
      epr $$9 = null;

      for (bow $$10 : $$6.a($$0, $$3, $$4)) {
         epm $$11 = $$10.cH().g((double)$$10.bH());
         Optional<epr> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            epr $$13 = $$12.get();
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

      return $$8 == null ? null : new epo($$8, $$9);
   }

   @Nullable
   public static epo a(cwz $$0, bow $$1, epr $$2, epr $$3, epm $$4, Predicate<bow> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static epo a(cwz $$0, bow $$1, epr $$2, epr $$3, epm $$4, Predicate<bow> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bow $$8 = null;

      for (bow $$9 : $$0.a($$1, $$4, $$5)) {
         epm $$10 = $$9.cH().g((double)$$6);
         Optional<epr> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new epo($$8);
   }

   public static void a(bow $$0, float $$1) {
      epr $$2 = $$0.dp();
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

   public static bnb a(bpo $$0, cqf $$1) {
      return $$0.eU().a($$1) ? bnb.a : bnb.b;
   }

   public static ciy a(bpo $$0, cqk $$1, float $$2) {
      coa $$3 = (coa)($$1.d() instanceof coa ? $$1.d() : cqn.ou);
      ciy $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cqn.vn) && $$4 instanceof cja) {
         ((cja)$$4).a($$1);
      }

      return $$4;
   }
}
