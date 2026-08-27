import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cif {
   private static final float a = 0.3F;

   public static enx a(bnq $$0, Predicate<bnq> $$1) {
      enz $$2 = $$0.dp();
      cvr $$3 = $$0.dM();
      enz $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cva.a.a);
   }

   public static enx a(bnq $$0, Predicate<bnq> $$1, cva.a $$2) {
      enz $$3 = $$0.dp();
      cvr $$4 = $$0.dM();
      enz $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static enx a(bnq $$0, Predicate<bnq> $$1, double $$2) {
      enz $$3 = $$0.f(0.0F).a($$2);
      cvr $$4 = $$0.dM();
      enz $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cva.a.a);
   }

   private static enx a(enz $$0, bnq $$1, Predicate<bnq> $$2, enz $$3, cvr $$4, float $$5, cva.a $$6) {
      enz $$7 = $$0.e($$3);
      enx $$8 = $$4.a(new cva($$0, $$7, $$6, cva.b.a, $$1));
      if ($$8.c() != enx.a.a) {
         $$7 = $$8.e();
      }

      enx $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static enw a(bnq $$0, enz $$1, enz $$2, enu $$3, Predicate<bnq> $$4, double $$5) {
      cvr $$6 = $$0.dM();
      double $$7 = $$5;
      bnq $$8 = null;
      enz $$9 = null;

      for (bnq $$10 : $$6.a($$0, $$3, $$4)) {
         enu $$11 = $$10.cH().g((double)$$10.bE());
         Optional<enz> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            enz $$13 = $$12.get();
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

      return $$8 == null ? null : new enw($$8, $$9);
   }

   @Nullable
   public static enw a(cvr $$0, bnq $$1, enz $$2, enz $$3, enu $$4, Predicate<bnq> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static enw a(cvr $$0, bnq $$1, enz $$2, enz $$3, enu $$4, Predicate<bnq> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bnq $$8 = null;

      for (bnq $$9 : $$0.a($$1, $$4, $$5)) {
         enu $$10 = $$9.cH().g((double)$$6);
         Optional<enz> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new enw($$8);
   }

   public static void a(bnq $$0, float $$1) {
      enz $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(awi.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(awi.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dE() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dE() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         while ($$0.dC() - $$0.M < -180.0F) {
            $$0.M -= 360.0F;
         }

         while ($$0.dC() - $$0.M >= 180.0F) {
            $$0.M += 360.0F;
         }

         $$0.s(awi.i($$1, $$0.N, $$0.dE()));
         $$0.r(awi.i($$1, $$0.M, $$0.dC()));
      }
   }

   public static blv a(boi $$0, coy $$1) {
      return $$0.eT().a($$1) ? blv.a : blv.b;
   }

   public static chr a(boi $$0, cpd $$1, float $$2) {
      cmr $$3 = (cmr)($$1.d() instanceof cmr ? $$1.d() : cpg.ou);
      chr $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cpg.vm) && $$4 instanceof cht) {
         ((cht)$$4).a($$1);
      }

      return $$4;
   }
}
