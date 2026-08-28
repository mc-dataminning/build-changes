import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cro {
   private static final float a = 0.3F;

   public static fdu a(bwa $$0, Predicate<bwa> $$1) {
      fdw $$2 = $$0.dy();
      dip $$3 = $$0.dV();
      fdw $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dhy.a.a);
   }

   public static fdu a(bwa $$0, Predicate<bwa> $$1, dhy.a $$2) {
      fdw $$3 = $$0.dy();
      dip $$4 = $$0.dV();
      fdw $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fdu a(bwa $$0, Predicate<bwa> $$1, double $$2) {
      fdw $$3 = $$0.h(0.0F).c($$2);
      dip $$4 = $$0.dV();
      fdw $$5 = $$0.bE();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dhy.a.a);
   }

   private static fdu a(fdw $$0, bwa $$1, Predicate<bwa> $$2, fdw $$3, dip $$4, float $$5, dhy.a $$6) {
      fdw $$7 = $$0.e($$3);
      fdu $$8 = $$4.b(new dhy($$0, $$7, $$6, dhy.b.a, $$1));
      if ($$8.d() != fdu.a.a) {
         $$7 = $$8.g();
      }

      fdu $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fdt a(bwa $$0, fdw $$1, fdw $$2, fdr $$3, Predicate<bwa> $$4, double $$5) {
      dip $$6 = $$0.dV();
      double $$7 = $$5;
      bwa $$8 = null;
      fdw $$9 = null;

      for (bwa $$10 : $$6.a($$0, $$3, $$4)) {
         fdr $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fdw> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fdw $$13 = $$12.get();
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

      return $$8 == null ? null : new fdt($$8, $$9);
   }

   @Nullable
   public static fdt a(dip $$0, bwa $$1, fdw $$2, fdw $$3, fdr $$4, Predicate<bwa> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fdt a(dip $$0, bwa $$1, fdw $$2, fdw $$3, fdr $$4, Predicate<bwa> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fdw> $$8 = Optional.empty();
      bwa $$9 = null;

      for (bwa $$10 : $$0.a($$1, $$4, $$5)) {
         fdr $$11 = $$10.cR().g((double)$$6);
         Optional<fdw> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fdt($$9, $$8.get());
   }

   public static void a(bwa $$0, float $$1) {
      fdw $$2 = $$0.dy();
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

   public static btx a(bwz $$0, cyo $$1) {
      return $$0.fa().a($$1) ? btx.a : btx.b;
   }

   public static cqz a(bwz $$0, cys $$1, float $$2, @Nullable cys $$3) {
      cww $$4 = (cww)($$1.h() instanceof cww ? $$1.h() : cyw.pf);
      cqz $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
