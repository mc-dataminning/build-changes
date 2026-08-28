import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cru {
   private static final float a = 0.3F;

   public static feg a(bwd $$0, Predicate<bwd> $$1) {
      fei $$2 = $$0.dy();
      div $$3 = $$0.dV();
      fei $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, die.a.a);
   }

   public static feg a(bwd $$0, Predicate<bwd> $$1, die.a $$2) {
      fei $$3 = $$0.dy();
      div $$4 = $$0.dV();
      fei $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static feg a(bwd $$0, Predicate<bwd> $$1, double $$2) {
      fei $$3 = $$0.h(0.0F).c($$2);
      div $$4 = $$0.dV();
      fei $$5 = $$0.bE();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, die.a.a);
   }

   private static feg a(fei $$0, bwd $$1, Predicate<bwd> $$2, fei $$3, div $$4, float $$5, die.a $$6) {
      fei $$7 = $$0.e($$3);
      feg $$8 = $$4.b(new die($$0, $$7, $$6, die.b.a, $$1));
      if ($$8.d() != feg.a.a) {
         $$7 = $$8.g();
      }

      feg $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fef a(bwd $$0, fei $$1, fei $$2, fed $$3, Predicate<bwd> $$4, double $$5) {
      div $$6 = $$0.dV();
      double $$7 = $$5;
      bwd $$8 = null;
      fei $$9 = null;

      for (bwd $$10 : $$6.a($$0, $$3, $$4)) {
         fed $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fei> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fei $$13 = $$12.get();
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

      return $$8 == null ? null : new fef($$8, $$9);
   }

   @Nullable
   public static fef a(div $$0, bwd $$1, fei $$2, fei $$3, fed $$4, Predicate<bwd> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fef a(div $$0, bwd $$1, fei $$2, fei $$3, fed $$4, Predicate<bwd> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fei> $$8 = Optional.empty();
      bwd $$9 = null;

      for (bwd $$10 : $$0.a($$1, $$4, $$5)) {
         fed $$11 = $$10.cR().g((double)$$6);
         Optional<fei> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fef($$9, $$8.get());
   }

   public static void a(bwd $$0, float $$1) {
      fei $$2 = $$0.dy();
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

   public static bua a(bxc $$0, cyu $$1) {
      return $$0.fa().a($$1) ? bua.a : bua.b;
   }

   public static crf a(bxc $$0, cyy $$1, float $$2, @Nullable cyy $$3) {
      cxc $$4 = (cxc)($$1.h() instanceof cxc ? $$1.h() : czc.ph);
      crf $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
