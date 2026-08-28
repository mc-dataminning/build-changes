import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cqm {
   private static final float a = 0.3F;

   public static fbv a(bva $$0, Predicate<bva> $$1) {
      fbx $$2 = $$0.dx();
      dgz $$3 = $$0.dU();
      fbx $$4 = $$0.ds();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dgi.a.a);
   }

   public static fbv a(bva $$0, Predicate<bva> $$1, dgi.a $$2) {
      fbx $$3 = $$0.dx();
      dgz $$4 = $$0.dU();
      fbx $$5 = $$0.ds();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fbv a(bva $$0, Predicate<bva> $$1, double $$2) {
      fbx $$3 = $$0.h(0.0F).c($$2);
      dgz $$4 = $$0.dU();
      fbx $$5 = $$0.bD();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dgi.a.a);
   }

   private static fbv a(fbx $$0, bva $$1, Predicate<bva> $$2, fbx $$3, dgz $$4, float $$5, dgi.a $$6) {
      fbx $$7 = $$0.e($$3);
      fbv $$8 = $$4.b(new dgi($$0, $$7, $$6, dgi.b.a, $$1));
      if ($$8.d() != fbv.a.a) {
         $$7 = $$8.g();
      }

      fbv $$9 = a($$4, $$1, $$0, $$7, $$1.cQ().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fbu a(bva $$0, fbx $$1, fbx $$2, fbs $$3, Predicate<bva> $$4, double $$5) {
      dgz $$6 = $$0.dU();
      double $$7 = $$5;
      bva $$8 = null;
      fbx $$9 = null;

      for (bva $$10 : $$6.a($$0, $$3, $$4)) {
         fbs $$11 = $$10.cQ().g((double)$$10.bR());
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
               if ($$10.de() == $$0.de()) {
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
   public static fbu a(dgz $$0, bva $$1, fbx $$2, fbx $$3, fbs $$4, Predicate<bva> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fbu a(dgz $$0, bva $$1, fbx $$2, fbx $$3, fbs $$4, Predicate<bva> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fbx> $$8 = Optional.empty();
      bva $$9 = null;

      for (bva $$10 : $$0.a($$1, $$4, $$5)) {
         fbs $$11 = $$10.cQ().g((double)$$6);
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

   public static void a(bva $$0, float $$1) {
      fbx $$2 = $$0.dx();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(ayz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(ayz.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dM() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dM() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dK() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dK() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.x(ayz.h($$1, $$0.O, $$0.dM()));
         $$0.w(ayz.h($$1, $$0.N, $$0.dK()));
      }
   }

   public static bsx a(bvy $$0, cxd $$1) {
      return $$0.eZ().a($$1) ? bsx.a : bsx.b;
   }

   public static cpy a(bvy $$0, cxh $$1, float $$2, @Nullable cxh $$3) {
      cvj $$4 = (cvj)($$1.h() instanceof cvj ? $$1.h() : cxl.pd);
      cpy $$5 = $$4.a($$0.dU(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
