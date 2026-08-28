import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cqj {
   private static final float a = 0.3F;

   public static fbp a(bvb $$0, Predicate<bvb> $$1) {
      fbr $$2 = $$0.dz();
      dgz $$3 = $$0.dW();
      fbr $$4 = $$0.du();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgh.a.a);
   }

   public static fbp a(bvb $$0, Predicate<bvb> $$1, dgh.a $$2) {
      fbr $$3 = $$0.dz();
      dgz $$4 = $$0.dW();
      fbr $$5 = $$0.du();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fbp a(bvb $$0, Predicate<bvb> $$1, double $$2) {
      fbr $$3 = $$0.g(0.0F).c($$2);
      dgz $$4 = $$0.dW();
      fbr $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgh.a.a);
   }

   private static fbp a(fbr $$0, bvb $$1, Predicate<bvb> $$2, fbr $$3, dgz $$4, float $$5, dgh.a $$6) {
      fbr $$7 = $$0.e($$3);
      fbp $$8 = $$4.b(new dgh($$0, $$7, $$6, dgh.b.a, $$1));
      if ($$8.d() != fbp.a.a) {
         $$7 = $$8.g();
      }

      fbp $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fbo a(bvb $$0, fbr $$1, fbr $$2, fbm $$3, Predicate<bvb> $$4, double $$5) {
      dgz $$6 = $$0.dW();
      double $$7 = $$5;
      bvb $$8 = null;
      fbr $$9 = null;

      for (bvb $$10 : $$6.a($$0, $$3, $$4)) {
         fbm $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fbr> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fbr $$13 = $$12.get();
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

      return $$8 == null ? null : new fbo($$8, $$9);
   }

   @Nullable
   public static fbo a(dgz $$0, bvb $$1, fbr $$2, fbr $$3, fbm $$4, Predicate<bvb> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fbo a(dgz $$0, bvb $$1, fbr $$2, fbr $$3, fbm $$4, Predicate<bvb> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fbr> $$8 = Optional.empty();
      bvb $$9 = null;

      for (bvb $$10 : $$0.a($$1, $$4, $$5)) {
         fbm $$11 = $$10.cR().g((double)$$6);
         Optional<fbr> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fbo($$9, $$8.get());
   }

   public static void a(bvb $$0, float $$1) {
      fbr $$2 = $$0.dz();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azu.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azu.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(azu.h($$1, $$0.O, $$0.dO()));
         $$0.v(azu.h($$1, $$0.N, $$0.dM()));
      }
   }

   public static bsz a(bvx $$0, cxc $$1) {
      return $$0.eZ().a($$1) ? bsz.a : bsz.b;
   }

   public static cpv a(bvx $$0, cxg $$1, float $$2, @Nullable cxg $$3) {
      cvh $$4 = (cvh)($$1.h() instanceof cvh ? $$1.h() : cxk.pb);
      cpv $$5 = $$4.a($$0.dW(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
