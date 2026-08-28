import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cps {
   private static final float a = 0.3F;

   public static fay a(bul $$0, Predicate<bul> $$1) {
      fba $$2 = $$0.dy();
      dgi $$3 = $$0.dV();
      fba $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dfq.a.a);
   }

   public static fay a(bul $$0, Predicate<bul> $$1, dfq.a $$2) {
      fba $$3 = $$0.dy();
      dgi $$4 = $$0.dV();
      fba $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fay a(bul $$0, Predicate<bul> $$1, double $$2) {
      fba $$3 = $$0.g(0.0F).c($$2);
      dgi $$4 = $$0.dV();
      fba $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dfq.a.a);
   }

   private static fay a(fba $$0, bul $$1, Predicate<bul> $$2, fba $$3, dgi $$4, float $$5, dfq.a $$6) {
      fba $$7 = $$0.e($$3);
      fay $$8 = $$4.b(new dfq($$0, $$7, $$6, dfq.b.a, $$1));
      if ($$8.d() != fay.a.a) {
         $$7 = $$8.g();
      }

      fay $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fax a(bul $$0, fba $$1, fba $$2, fav $$3, Predicate<bul> $$4, double $$5) {
      dgi $$6 = $$0.dV();
      double $$7 = $$5;
      bul $$8 = null;
      fba $$9 = null;

      for (bul $$10 : $$6.a($$0, $$3, $$4)) {
         fav $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fba> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fba $$13 = $$12.get();
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

      return $$8 == null ? null : new fax($$8, $$9);
   }

   @Nullable
   public static fax a(dgi $$0, bul $$1, fba $$2, fba $$3, fav $$4, Predicate<bul> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fax a(dgi $$0, bul $$1, fba $$2, fba $$3, fav $$4, Predicate<bul> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fba> $$8 = Optional.empty();
      bul $$9 = null;

      for (bul $$10 : $$0.a($$1, $$4, $$5)) {
         fav $$11 = $$10.cR().g((double)$$6);
         Optional<fba> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fax($$9, $$8.get());
   }

   public static void a(bul $$0, float $$1) {
      fba $$2 = $$0.dy();
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

   public static bsj a(bvh $$0, cwl $$1) {
      return $$0.eZ().a($$1) ? bsj.a : bsj.b;
   }

   public static cpe a(bvh $$0, cwp $$1, float $$2, @Nullable cwp $$3) {
      cuq $$4 = (cuq)($$1.h() instanceof cuq ? $$1.h() : cwt.pb);
      cpe $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
