import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ctf {
   private static final float a = 0.3F;

   public static fga a(bxe $$0, Predicate<bxe> $$1) {
      fgc $$2 = $$0.dy();
      dkj $$3 = $$0.dV();
      fgc $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, djq.a.a);
   }

   public static fga a(bxe $$0, Predicate<bxe> $$1, djq.a $$2) {
      fgc $$3 = $$0.dy();
      dkj $$4 = $$0.dV();
      fgc $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fga a(bxe $$0, Predicate<bxe> $$1, double $$2) {
      fgc $$3 = $$0.h(0.0F).c($$2);
      dkj $$4 = $$0.dV();
      fgc $$5 = $$0.bD();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, djq.a.a);
   }

   private static fga a(fgc $$0, bxe $$1, Predicate<bxe> $$2, fgc $$3, dkj $$4, float $$5, djq.a $$6) {
      fgc $$7 = $$0.e($$3);
      fga $$8 = $$4.b(new djq($$0, $$7, $$6, djq.b.a, $$1));
      if ($$8.d() != fga.a.a) {
         $$7 = $$8.g();
      }

      fga $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ffz a(bxe $$0, fgc $$1, fgc $$2, ffx $$3, Predicate<bxe> $$4, double $$5) {
      dkj $$6 = $$0.dV();
      double $$7 = $$5;
      bxe $$8 = null;
      fgc $$9 = null;

      for (bxe $$10 : $$6.a($$0, $$3, $$4)) {
         ffx $$11 = $$10.cR().g((double)$$10.bR());
         Optional<fgc> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fgc $$13 = $$12.get();
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

      return $$8 == null ? null : new ffz($$8, $$9);
   }

   @Nullable
   public static ffz a(dkj $$0, bxe $$1, fgc $$2, fgc $$3, ffx $$4, Predicate<bxe> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ffz a(dkj $$0, bxe $$1, fgc $$2, fgc $$3, ffx $$4, Predicate<bxe> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fgc> $$8 = Optional.empty();
      bxe $$9 = null;

      for (bxe $$10 : $$0.a($$1, $$4, $$5)) {
         ffx $$11 = $$10.cR().g((double)$$6);
         Optional<fgc> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ffz($$9, $$8.get());
   }

   public static void a(bxe $$0, float $$1) {
      fgc $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azz.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.x(azz.h($$1, $$0.O, $$0.dN()));
         $$0.w(azz.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static bvb a(byf $$0, dag $$1) {
      return $$0.fb().a($$1) ? bvb.a : bvb.b;
   }

   public static csq a(byf $$0, dak $$1, float $$2, @Nullable dak $$3) {
      cyo $$4 = (cyo)($$1.h() instanceof cyo ? $$1.h() : dao.pk);
      csq $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
