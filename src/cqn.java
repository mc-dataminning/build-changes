import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cqn {
   private static final float a = 0.3F;

   public static fbq a(bvf $$0, Predicate<bvf> $$1) {
      fbs $$2 = $$0.dy();
      dha $$3 = $$0.dV();
      fbs $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgi.a.a);
   }

   public static fbq a(bvf $$0, Predicate<bvf> $$1, dgi.a $$2) {
      fbs $$3 = $$0.dy();
      dha $$4 = $$0.dV();
      fbs $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fbq a(bvf $$0, Predicate<bvf> $$1, double $$2) {
      fbs $$3 = $$0.g(0.0F).c($$2);
      dha $$4 = $$0.dV();
      fbs $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgi.a.a);
   }

   private static fbq a(fbs $$0, bvf $$1, Predicate<bvf> $$2, fbs $$3, dha $$4, float $$5, dgi.a $$6) {
      fbs $$7 = $$0.e($$3);
      fbq $$8 = $$4.b(new dgi($$0, $$7, $$6, dgi.b.a, $$1));
      if ($$8.d() != fbq.a.a) {
         $$7 = $$8.g();
      }

      fbq $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fbp a(bvf $$0, fbs $$1, fbs $$2, fbn $$3, Predicate<bvf> $$4, double $$5) {
      dha $$6 = $$0.dV();
      double $$7 = $$5;
      bvf $$8 = null;
      fbs $$9 = null;

      for (bvf $$10 : $$6.a($$0, $$3, $$4)) {
         fbn $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fbs> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fbs $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dg() == $$0.dg()) {
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

      return $$8 == null ? null : new fbp($$8, $$9);
   }

   @Nullable
   public static fbp a(dha $$0, bvf $$1, fbs $$2, fbs $$3, fbn $$4, Predicate<bvf> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fbp a(dha $$0, bvf $$1, fbs $$2, fbs $$3, fbn $$4, Predicate<bvf> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fbs> $$8 = Optional.empty();
      bvf $$9 = null;

      for (bvf $$10 : $$0.a($$1, $$4, $$5)) {
         fbn $$11 = $$10.cR().g((double)$$6);
         Optional<fbs> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fbp($$9, $$8.get());
   }

   public static void a(bvf $$0, float $$1) {
      fbs $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(bae.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(bae.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(bae.h($$1, $$0.O, $$0.dN()));
         $$0.v(bae.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static btd a(bwb $$0, cxg $$1) {
      return $$0.eX().a($$1) ? btd.a : btd.b;
   }

   public static cpz a(bwb $$0, cxk $$1, float $$2, @Nullable cxk $$3) {
      cvl $$4 = (cvl)($$1.h() instanceof cvl ? $$1.h() : cxo.oS);
      cpz $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
