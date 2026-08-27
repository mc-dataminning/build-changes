import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cgb {
   private static final float a = 0.3F;

   public static elr a(blv $$0, Predicate<blv> $$1) {
      elt $$2 = $$0.dp();
      ctp $$3 = $$0.dM();
      elt $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, csy.a.a);
   }

   public static elr a(blv $$0, Predicate<blv> $$1, csy.a $$2) {
      elt $$3 = $$0.dp();
      ctp $$4 = $$0.dM();
      elt $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static elr a(blv $$0, Predicate<blv> $$1, double $$2) {
      elt $$3 = $$0.f(0.0F).a($$2);
      ctp $$4 = $$0.dM();
      elt $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, csy.a.a);
   }

   private static elr a(elt $$0, blv $$1, Predicate<blv> $$2, elt $$3, ctp $$4, float $$5, csy.a $$6) {
      elt $$7 = $$0.e($$3);
      elr $$8 = $$4.a(new csy($$0, $$7, $$6, csy.b.a, $$1));
      if ($$8.c() != elr.a.a) {
         $$7 = $$8.e();
      }

      elr $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static elq a(blv $$0, elt $$1, elt $$2, elo $$3, Predicate<blv> $$4, double $$5) {
      ctp $$6 = $$0.dM();
      double $$7 = $$5;
      blv $$8 = null;
      elt $$9 = null;

      for (blv $$10 : $$6.a($$0, $$3, $$4)) {
         elo $$11 = $$10.cH().g((double)$$10.bE());
         Optional<elt> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            elt $$13 = $$12.get();
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

      return $$8 == null ? null : new elq($$8, $$9);
   }

   @Nullable
   public static elq a(ctp $$0, blv $$1, elt $$2, elt $$3, elo $$4, Predicate<blv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static elq a(ctp $$0, blv $$1, elt $$2, elt $$3, elo $$4, Predicate<blv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      blv $$8 = null;

      for (blv $$9 : $$0.a($$1, $$4, $$5)) {
         elo $$10 = $$9.cH().g((double)$$6);
         Optional<elt> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new elq($$8);
   }

   public static void a(blv $$0, float $$1) {
      elt $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(auo.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(auo.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(auo.i($$1, $$0.O, $$0.dE()));
         $$0.r(auo.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bka a(bml $$0, cmt $$1) {
      return $$0.eT().a($$1) ? bka.a : bka.b;
   }

   public static cfo a(bml $$0, cmy $$1, float $$2) {
      ckm $$3 = (ckm)($$1.d() instanceof ckm ? $$1.d() : cnb.os);
      cfo $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cnb.vj) && $$4 instanceof cfq) {
         ((cfq)$$4).a($$1);
      }

      return $$4;
   }
}
