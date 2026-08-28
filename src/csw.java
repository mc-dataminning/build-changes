import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class csw {
   private static final float a = 0.3F;

   public static ffq a(bwv $$0, Predicate<bwv> $$1) {
      ffs $$2 = $$0.dy();
      djz $$3 = $$0.dV();
      ffs $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, djg.a.a);
   }

   public static ffq a(bwv $$0, Predicate<bwv> $$1, djg.a $$2) {
      ffs $$3 = $$0.dy();
      djz $$4 = $$0.dV();
      ffs $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ffq a(bwv $$0, Predicate<bwv> $$1, double $$2) {
      ffs $$3 = $$0.h(0.0F).c($$2);
      djz $$4 = $$0.dV();
      ffs $$5 = $$0.bD();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, djg.a.a);
   }

   private static ffq a(ffs $$0, bwv $$1, Predicate<bwv> $$2, ffs $$3, djz $$4, float $$5, djg.a $$6) {
      ffs $$7 = $$0.e($$3);
      ffq $$8 = $$4.b(new djg($$0, $$7, $$6, djg.b.a, $$1));
      if ($$8.d() != ffq.a.a) {
         $$7 = $$8.g();
      }

      ffq $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ffp a(bwv $$0, ffs $$1, ffs $$2, ffn $$3, Predicate<bwv> $$4, double $$5) {
      djz $$6 = $$0.dV();
      double $$7 = $$5;
      bwv $$8 = null;
      ffs $$9 = null;

      for (bwv $$10 : $$6.a($$0, $$3, $$4)) {
         ffn $$11 = $$10.cR().g((double)$$10.bR());
         Optional<ffs> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ffs $$13 = $$12.get();
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

      return $$8 == null ? null : new ffp($$8, $$9);
   }

   @Nullable
   public static ffp a(djz $$0, bwv $$1, ffs $$2, ffs $$3, ffn $$4, Predicate<bwv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ffp a(djz $$0, bwv $$1, ffs $$2, ffs $$3, ffn $$4, Predicate<bwv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ffs> $$8 = Optional.empty();
      bwv $$9 = null;

      for (bwv $$10 : $$0.a($$1, $$4, $$5)) {
         ffn $$11 = $$10.cR().g((double)$$6);
         Optional<ffs> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ffp($$9, $$8.get());
   }

   public static void a(bwv $$0, float $$1) {
      ffs $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azq.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azq.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.x(azq.h($$1, $$0.O, $$0.dN()));
         $$0.w(azq.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static bus a(bxw $$0, czw $$1) {
      return $$0.fb().a($$1) ? bus.a : bus.b;
   }

   public static csh a(bxw $$0, daa $$1, float $$2, @Nullable daa $$3) {
      cye $$4 = (cye)($$1.h() instanceof cye ? $$1.h() : dae.pk);
      csh $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
