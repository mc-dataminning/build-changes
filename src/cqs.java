import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cqs {
   private static final float a = 0.3F;

   public static fbw a(bvk $$0, Predicate<bvk> $$1) {
      fby $$2 = $$0.dz();
      dhi $$3 = $$0.dW();
      fby $$4 = $$0.du();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgq.a.a);
   }

   public static fbw a(bvk $$0, Predicate<bvk> $$1, dgq.a $$2) {
      fby $$3 = $$0.dz();
      dhi $$4 = $$0.dW();
      fby $$5 = $$0.du();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fbw a(bvk $$0, Predicate<bvk> $$1, double $$2) {
      fby $$3 = $$0.g(0.0F).c($$2);
      dhi $$4 = $$0.dW();
      fby $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgq.a.a);
   }

   private static fbw a(fby $$0, bvk $$1, Predicate<bvk> $$2, fby $$3, dhi $$4, float $$5, dgq.a $$6) {
      fby $$7 = $$0.e($$3);
      fbw $$8 = $$4.b(new dgq($$0, $$7, $$6, dgq.b.a, $$1));
      if ($$8.d() != fbw.a.a) {
         $$7 = $$8.g();
      }

      fbw $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fbv a(bvk $$0, fby $$1, fby $$2, fbt $$3, Predicate<bvk> $$4, double $$5) {
      dhi $$6 = $$0.dW();
      double $$7 = $$5;
      bvk $$8 = null;
      fby $$9 = null;

      for (bvk $$10 : $$6.a($$0, $$3, $$4)) {
         fbt $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fby> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fby $$13 = $$12.get();
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

      return $$8 == null ? null : new fbv($$8, $$9);
   }

   @Nullable
   public static fbv a(dhi $$0, bvk $$1, fby $$2, fby $$3, fbt $$4, Predicate<bvk> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fbv a(dhi $$0, bvk $$1, fby $$2, fby $$3, fbt $$4, Predicate<bvk> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fby> $$8 = Optional.empty();
      bvk $$9 = null;

      for (bvk $$10 : $$0.a($$1, $$4, $$5)) {
         fbt $$11 = $$10.cR().g((double)$$6);
         Optional<fby> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fbv($$9, $$8.get());
   }

   public static void a(bvk $$0, float $$1) {
      fby $$2 = $$0.dz();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(bae.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(bae.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dO() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dO() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dM() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dM() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.w(bae.h($$1, $$0.O, $$0.dO()));
         $$0.v(bae.h($$1, $$0.N, $$0.dM()));
      }
   }

   public static bti a(bwg $$0, cxl $$1) {
      return $$0.eZ().a($$1) ? bti.a : bti.b;
   }

   public static cqe a(bwg $$0, cxp $$1, float $$2, @Nullable cxp $$3) {
      cvq $$4 = (cvq)($$1.h() instanceof cvq ? $$1.h() : cxt.oS);
      cqe $$5 = $$4.a($$0.dW(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
