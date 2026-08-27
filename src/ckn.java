import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ckn {
   private static final float a = 0.3F;

   public static ery a(bpv $$0, Predicate<bpv> $$1) {
      esa $$2 = $$0.dp();
      cyx $$3 = $$0.dM();
      esa $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cyg.a.a);
   }

   public static ery a(bpv $$0, Predicate<bpv> $$1, cyg.a $$2) {
      esa $$3 = $$0.dp();
      cyx $$4 = $$0.dM();
      esa $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ery a(bpv $$0, Predicate<bpv> $$1, double $$2) {
      esa $$3 = $$0.f(0.0F).a($$2);
      cyx $$4 = $$0.dM();
      esa $$5 = $$0.bu();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cyg.a.a);
   }

   private static ery a(esa $$0, bpv $$1, Predicate<bpv> $$2, esa $$3, cyx $$4, float $$5, cyg.a $$6) {
      esa $$7 = $$0.e($$3);
      ery $$8 = $$4.a(new cyg($$0, $$7, $$6, cyg.b.a, $$1));
      if ($$8.c() != ery.a.a) {
         $$7 = $$8.e();
      }

      ery $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static erx a(bpv $$0, esa $$1, esa $$2, erv $$3, Predicate<bpv> $$4, double $$5) {
      cyx $$6 = $$0.dM();
      double $$7 = $$5;
      bpv $$8 = null;
      esa $$9 = null;

      for (bpv $$10 : $$6.a($$0, $$3, $$4)) {
         erv $$11 = $$10.cH().g((double)$$10.bH());
         Optional<esa> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            esa $$13 = $$12.get();
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

      return $$8 == null ? null : new erx($$8, $$9);
   }

   @Nullable
   public static erx a(cyx $$0, bpv $$1, esa $$2, esa $$3, erv $$4, Predicate<bpv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static erx a(cyx $$0, bpv $$1, esa $$2, esa $$3, erv $$4, Predicate<bpv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bpv $$8 = null;

      for (bpv $$9 : $$0.a($$1, $$4, $$5)) {
         erv $$10 = $$9.cH().g((double)$$6);
         Optional<esa> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new erx($$8);
   }

   public static void a(bpv $$0, float $$1) {
      esa $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(axk.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(axk.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(axk.i($$1, $$0.O, $$0.dE()));
         $$0.r(axk.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bnz a(bqo $$0, cre $$1) {
      return $$0.eU().a($$1) ? bnz.a : bnz.b;
   }

   public static cjz a(bqo $$0, crj $$1, float $$2) {
      cpc $$3 = (cpc)($$1.f() instanceof cpc ? $$1.f() : crm.ou);
      cjz $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
