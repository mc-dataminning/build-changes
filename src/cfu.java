import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cfu {
   private static final float a = 0.3F;

   public static elk a(blp $$0, Predicate<blp> $$1) {
      elm $$2 = $$0.dp();
      cti $$3 = $$0.dM();
      elm $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, csr.a.a);
   }

   public static elk a(blp $$0, Predicate<blp> $$1, csr.a $$2) {
      elm $$3 = $$0.dp();
      cti $$4 = $$0.dM();
      elm $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static elk a(blp $$0, Predicate<blp> $$1, double $$2) {
      elm $$3 = $$0.f(0.0F).a($$2);
      cti $$4 = $$0.dM();
      elm $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, csr.a.a);
   }

   private static elk a(elm $$0, blp $$1, Predicate<blp> $$2, elm $$3, cti $$4, float $$5, csr.a $$6) {
      elm $$7 = $$0.e($$3);
      elk $$8 = $$4.a(new csr($$0, $$7, $$6, csr.b.a, $$1));
      if ($$8.c() != elk.a.a) {
         $$7 = $$8.e();
      }

      elk $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static elj a(blp $$0, elm $$1, elm $$2, elh $$3, Predicate<blp> $$4, double $$5) {
      cti $$6 = $$0.dM();
      double $$7 = $$5;
      blp $$8 = null;
      elm $$9 = null;

      for (blp $$10 : $$6.a($$0, $$3, $$4)) {
         elh $$11 = $$10.cH().g((double)$$10.bE());
         Optional<elm> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            elm $$13 = $$12.get();
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

      return $$8 == null ? null : new elj($$8, $$9);
   }

   @Nullable
   public static elj a(cti $$0, blp $$1, elm $$2, elm $$3, elh $$4, Predicate<blp> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static elj a(cti $$0, blp $$1, elm $$2, elm $$3, elh $$4, Predicate<blp> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      blp $$8 = null;

      for (blp $$9 : $$0.a($$1, $$4, $$5)) {
         elh $$10 = $$9.cH().g((double)$$6);
         Optional<elm> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new elj($$8);
   }

   public static void a(blp $$0, float $$1) {
      elm $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aui.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aui.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(aui.i($$1, $$0.O, $$0.dE()));
         $$0.r(aui.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bju a(bmf $$0, cmm $$1) {
      return $$0.eT().a($$1) ? bju.a : bju.b;
   }

   public static cfh a(bmf $$0, cmr $$1, float $$2) {
      ckf $$3 = (ckf)($$1.d() instanceof ckf ? $$1.d() : cmu.os);
      cfh $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cmu.vj) && $$4 instanceof cfj) {
         ((cfj)$$4).a($$1);
      }

      return $$4;
   }
}
