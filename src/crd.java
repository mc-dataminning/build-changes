import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class crd {
   private static final float a = 0.3F;

   public static fcs a(bvs $$0, Predicate<bvs> $$1) {
      fcu $$2 = $$0.dy();
      dhp $$3 = $$0.dV();
      fcu $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgy.a.a);
   }

   public static fcs a(bvs $$0, Predicate<bvs> $$1, dgy.a $$2) {
      fcu $$3 = $$0.dy();
      dhp $$4 = $$0.dV();
      fcu $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fcs a(bvs $$0, Predicate<bvs> $$1, double $$2) {
      fcu $$3 = $$0.h(0.0F).c($$2);
      dhp $$4 = $$0.dV();
      fcu $$5 = $$0.bE();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgy.a.a);
   }

   private static fcs a(fcu $$0, bvs $$1, Predicate<bvs> $$2, fcu $$3, dhp $$4, float $$5, dgy.a $$6) {
      fcu $$7 = $$0.e($$3);
      fcs $$8 = $$4.b(new dgy($$0, $$7, $$6, dgy.b.a, $$1));
      if ($$8.d() != fcs.a.a) {
         $$7 = $$8.g();
      }

      fcs $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fcr a(bvs $$0, fcu $$1, fcu $$2, fcp $$3, Predicate<bvs> $$4, double $$5) {
      dhp $$6 = $$0.dV();
      double $$7 = $$5;
      bvs $$8 = null;
      fcu $$9 = null;

      for (bvs $$10 : $$6.a($$0, $$3, $$4)) {
         fcp $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fcu> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fcu $$13 = $$12.get();
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

      return $$8 == null ? null : new fcr($$8, $$9);
   }

   @Nullable
   public static fcr a(dhp $$0, bvs $$1, fcu $$2, fcu $$3, fcp $$4, Predicate<bvs> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fcr a(dhp $$0, bvs $$1, fcu $$2, fcu $$3, fcp $$4, Predicate<bvs> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fcu> $$8 = Optional.empty();
      bvs $$9 = null;

      for (bvs $$10 : $$0.a($$1, $$4, $$5)) {
         fcp $$11 = $$10.cR().g((double)$$6);
         Optional<fcu> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fcr($$9, $$8.get());
   }

   public static void a(bvs $$0, float $$1) {
      fcu $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azk.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azk.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.x(azk.h($$1, $$0.O, $$0.dN()));
         $$0.w(azk.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static btp a(bwr $$0, cxu $$1) {
      return $$0.fa().a($$1) ? btp.a : btp.b;
   }

   public static cqp a(bwr $$0, cxy $$1, float $$2, @Nullable cxy $$3) {
      cwa $$4 = (cwa)($$1.h() instanceof cwa ? $$1.h() : cyc.pf);
      cqp $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
