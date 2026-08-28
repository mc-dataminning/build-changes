import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class crz {
   private static final float a = 0.3F;

   public static feo a(bwf $$0, Predicate<bwf> $$1) {
      feq $$2 = $$0.dy();
      dja $$3 = $$0.dV();
      feq $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dij.a.a);
   }

   public static feo a(bwf $$0, Predicate<bwf> $$1, dij.a $$2) {
      feq $$3 = $$0.dy();
      dja $$4 = $$0.dV();
      feq $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static feo a(bwf $$0, Predicate<bwf> $$1, double $$2) {
      feq $$3 = $$0.h(0.0F).c($$2);
      dja $$4 = $$0.dV();
      feq $$5 = $$0.bE();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dij.a.a);
   }

   private static feo a(feq $$0, bwf $$1, Predicate<bwf> $$2, feq $$3, dja $$4, float $$5, dij.a $$6) {
      feq $$7 = $$0.e($$3);
      feo $$8 = $$4.b(new dij($$0, $$7, $$6, dij.b.a, $$1));
      if ($$8.d() != feo.a.a) {
         $$7 = $$8.g();
      }

      feo $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fen a(bwf $$0, feq $$1, feq $$2, fel $$3, Predicate<bwf> $$4, double $$5) {
      dja $$6 = $$0.dV();
      double $$7 = $$5;
      bwf $$8 = null;
      feq $$9 = null;

      for (bwf $$10 : $$6.a($$0, $$3, $$4)) {
         fel $$11 = $$10.cR().g((double)$$10.bS());
         Optional<feq> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            feq $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.df() == $$0.df()) {
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

      return $$8 == null ? null : new fen($$8, $$9);
   }

   @Nullable
   public static fen a(dja $$0, bwf $$1, feq $$2, feq $$3, fel $$4, Predicate<bwf> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fen a(dja $$0, bwf $$1, feq $$2, feq $$3, fel $$4, Predicate<bwf> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<feq> $$8 = Optional.empty();
      bwf $$9 = null;

      for (bwf $$10 : $$0.a($$1, $$4, $$5)) {
         fel $$11 = $$10.cR().g((double)$$6);
         Optional<feq> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fen($$9, $$8.get());
   }

   public static void a(bwf $$0, float $$1) {
      feq $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azm.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dN() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dN() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dL() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dL() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.x(azm.h($$1, $$0.O, $$0.dN()));
         $$0.w(azm.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static buc a(bxe $$0, cyz $$1) {
      return $$0.fb().a($$1) ? buc.a : buc.b;
   }

   public static crk a(bxe $$0, czd $$1, float $$2, @Nullable czd $$3) {
      cxh $$4 = (cxh)($$1.h() instanceof cxh ? $$1.h() : czh.pk);
      crk $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
