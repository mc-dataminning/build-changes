import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class csu {
   private static final float a = 0.3F;

   public static ffo a(bwt $$0, Predicate<bwt> $$1) {
      ffq $$2 = $$0.dy();
      djx $$3 = $$0.dV();
      ffq $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dje.a.a);
   }

   public static ffo a(bwt $$0, Predicate<bwt> $$1, dje.a $$2) {
      ffq $$3 = $$0.dy();
      djx $$4 = $$0.dV();
      ffq $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ffo a(bwt $$0, Predicate<bwt> $$1, double $$2) {
      ffq $$3 = $$0.h(0.0F).c($$2);
      djx $$4 = $$0.dV();
      ffq $$5 = $$0.bD();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dje.a.a);
   }

   private static ffo a(ffq $$0, bwt $$1, Predicate<bwt> $$2, ffq $$3, djx $$4, float $$5, dje.a $$6) {
      ffq $$7 = $$0.e($$3);
      ffo $$8 = $$4.b(new dje($$0, $$7, $$6, dje.b.a, $$1));
      if ($$8.d() != ffo.a.a) {
         $$7 = $$8.g();
      }

      ffo $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ffn a(bwt $$0, ffq $$1, ffq $$2, ffl $$3, Predicate<bwt> $$4, double $$5) {
      djx $$6 = $$0.dV();
      double $$7 = $$5;
      bwt $$8 = null;
      ffq $$9 = null;

      for (bwt $$10 : $$6.a($$0, $$3, $$4)) {
         ffl $$11 = $$10.cR().g((double)$$10.bR());
         Optional<ffq> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ffq $$13 = $$12.get();
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

      return $$8 == null ? null : new ffn($$8, $$9);
   }

   @Nullable
   public static ffn a(djx $$0, bwt $$1, ffq $$2, ffq $$3, ffl $$4, Predicate<bwt> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ffn a(djx $$0, bwt $$1, ffq $$2, ffq $$3, ffl $$4, Predicate<bwt> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ffq> $$8 = Optional.empty();
      bwt $$9 = null;

      for (bwt $$10 : $$0.a($$1, $$4, $$5)) {
         ffl $$11 = $$10.cR().g((double)$$6);
         Optional<ffq> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ffn($$9, $$8.get());
   }

   public static void a(bwt $$0, float $$1) {
      ffq $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azo.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azo.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.x(azo.h($$1, $$0.O, $$0.dN()));
         $$0.w(azo.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static buq a(bxu $$0, czu $$1) {
      return $$0.fb().a($$1) ? buq.a : buq.b;
   }

   public static csf a(bxu $$0, czy $$1, float $$2, @Nullable czy $$3) {
      cyc $$4 = (cyc)($$1.h() instanceof cyc ? $$1.h() : dac.pk);
      csf $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
