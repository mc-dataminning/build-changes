import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cqr {
   private static final float a = 0.3F;

   public static fbv a(bvj $$0, Predicate<bvj> $$1) {
      fbx $$2 = $$0.dz();
      dhh $$3 = $$0.dW();
      fbx $$4 = $$0.du();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgp.a.a);
   }

   public static fbv a(bvj $$0, Predicate<bvj> $$1, dgp.a $$2) {
      fbx $$3 = $$0.dz();
      dhh $$4 = $$0.dW();
      fbx $$5 = $$0.du();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fbv a(bvj $$0, Predicate<bvj> $$1, double $$2) {
      fbx $$3 = $$0.g(0.0F).c($$2);
      dhh $$4 = $$0.dW();
      fbx $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgp.a.a);
   }

   private static fbv a(fbx $$0, bvj $$1, Predicate<bvj> $$2, fbx $$3, dhh $$4, float $$5, dgp.a $$6) {
      fbx $$7 = $$0.e($$3);
      fbv $$8 = $$4.b(new dgp($$0, $$7, $$6, dgp.b.a, $$1));
      if ($$8.d() != fbv.a.a) {
         $$7 = $$8.g();
      }

      fbv $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fbu a(bvj $$0, fbx $$1, fbx $$2, fbs $$3, Predicate<bvj> $$4, double $$5) {
      dhh $$6 = $$0.dW();
      double $$7 = $$5;
      bvj $$8 = null;
      fbx $$9 = null;

      for (bvj $$10 : $$6.a($$0, $$3, $$4)) {
         fbs $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fbx> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fbx $$13 = $$12.get();
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

      return $$8 == null ? null : new fbu($$8, $$9);
   }

   @Nullable
   public static fbu a(dhh $$0, bvj $$1, fbx $$2, fbx $$3, fbs $$4, Predicate<bvj> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fbu a(dhh $$0, bvj $$1, fbx $$2, fbx $$3, fbs $$4, Predicate<bvj> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fbx> $$8 = Optional.empty();
      bvj $$9 = null;

      for (bvj $$10 : $$0.a($$1, $$4, $$5)) {
         fbs $$11 = $$10.cR().g((double)$$6);
         Optional<fbx> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fbu($$9, $$8.get());
   }

   public static void a(bvj $$0, float $$1) {
      fbx $$2 = $$0.dz();
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

   public static bth a(bwf $$0, cxk $$1) {
      return $$0.eZ().a($$1) ? bth.a : bth.b;
   }

   public static cqd a(bwf $$0, cxo $$1, float $$2, @Nullable cxo $$3) {
      cvp $$4 = (cvp)($$1.h() instanceof cvp ? $$1.h() : cxs.oS);
      cqd $$5 = $$4.a($$0.dW(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
