import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpr {
   private static final float a = 0.3F;

   public static fax a(buk $$0, Predicate<buk> $$1) {
      faz $$2 = $$0.dy();
      dgh $$3 = $$0.dV();
      faz $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dfp.a.a);
   }

   public static fax a(buk $$0, Predicate<buk> $$1, dfp.a $$2) {
      faz $$3 = $$0.dy();
      dgh $$4 = $$0.dV();
      faz $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fax a(buk $$0, Predicate<buk> $$1, double $$2) {
      faz $$3 = $$0.g(0.0F).c($$2);
      dgh $$4 = $$0.dV();
      faz $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dfp.a.a);
   }

   private static fax a(faz $$0, buk $$1, Predicate<buk> $$2, faz $$3, dgh $$4, float $$5, dfp.a $$6) {
      faz $$7 = $$0.e($$3);
      fax $$8 = $$4.b(new dfp($$0, $$7, $$6, dfp.b.a, $$1));
      if ($$8.d() != fax.a.a) {
         $$7 = $$8.g();
      }

      fax $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static faw a(buk $$0, faz $$1, faz $$2, fau $$3, Predicate<buk> $$4, double $$5) {
      dgh $$6 = $$0.dV();
      double $$7 = $$5;
      buk $$8 = null;
      faz $$9 = null;

      for (buk $$10 : $$6.a($$0, $$3, $$4)) {
         fau $$11 = $$10.cR().g((double)$$10.bS());
         Optional<faz> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            faz $$13 = $$12.get();
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

      return $$8 == null ? null : new faw($$8, $$9);
   }

   @Nullable
   public static faw a(dgh $$0, buk $$1, faz $$2, faz $$3, fau $$4, Predicate<buk> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static faw a(dgh $$0, buk $$1, faz $$2, faz $$3, fau $$4, Predicate<buk> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<faz> $$8 = Optional.empty();
      buk $$9 = null;

      for (buk $$10 : $$0.a($$1, $$4, $$5)) {
         fau $$11 = $$10.cR().g((double)$$6);
         Optional<faz> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new faw($$9, $$8.get());
   }

   public static void a(buk $$0, float $$1) {
      faz $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(ayz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(ayz.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(ayz.h($$1, $$0.O, $$0.dN()));
         $$0.v(ayz.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static bsi a(bvg $$0, cwk $$1) {
      return $$0.eZ().a($$1) ? bsi.a : bsi.b;
   }

   public static cpd a(bvg $$0, cwo $$1, float $$2, @Nullable cwo $$3) {
      cup $$4 = (cup)($$1.h() instanceof cup ? $$1.h() : cws.pb);
      cpd $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
