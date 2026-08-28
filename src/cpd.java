import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpd {
   private static final float a = 0.3F;

   public static ezf a(btz $$0, Predicate<btz> $$1) {
      ezh $$2 = $$0.dA();
      dev $$3 = $$0.dX();
      ezh $$4 = $$0.dv();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, ded.a.a);
   }

   public static ezf a(btz $$0, Predicate<btz> $$1, ded.a $$2) {
      ezh $$3 = $$0.dA();
      dev $$4 = $$0.dX();
      ezh $$5 = $$0.dv();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ezf a(btz $$0, Predicate<btz> $$1, double $$2) {
      ezh $$3 = $$0.g(0.0F).c($$2);
      dev $$4 = $$0.dX();
      ezh $$5 = $$0.bG();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, ded.a.a);
   }

   private static ezf a(ezh $$0, btz $$1, Predicate<btz> $$2, ezh $$3, dev $$4, float $$5, ded.a $$6) {
      ezh $$7 = $$0.e($$3);
      ezf $$8 = $$4.b(new ded($$0, $$7, $$6, ded.b.a, $$1));
      if ($$8.d() != ezf.a.a) {
         $$7 = $$8.g();
      }

      ezf $$9 = a($$4, $$1, $$0, $$7, $$1.cS().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eze a(btz $$0, ezh $$1, ezh $$2, ezc $$3, Predicate<btz> $$4, double $$5) {
      dev $$6 = $$0.dX();
      double $$7 = $$5;
      btz $$8 = null;
      ezh $$9 = null;

      for (btz $$10 : $$6.a($$0, $$3, $$4)) {
         ezc $$11 = $$10.cS().g((double)$$10.bT());
         Optional<ezh> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ezh $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dh() == $$0.dh()) {
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

      return $$8 == null ? null : new eze($$8, $$9);
   }

   @Nullable
   public static eze a(dev $$0, btz $$1, ezh $$2, ezh $$3, ezc $$4, Predicate<btz> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eze a(dev $$0, btz $$1, ezh $$2, ezh $$3, ezc $$4, Predicate<btz> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      btz $$8 = null;

      for (btz $$9 : $$0.a($$1, $$4, $$5)) {
         ezc $$10 = $$9.cS().g((double)$$6);
         Optional<ezh> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eze($$8);
   }

   public static void a(btz $$0, float $$1) {
      ezh $$2 = $$0.dA();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azj.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azj.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dP() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dP() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dN() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dN() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.w(azj.h($$1, $$0.P, $$0.dP()));
         $$0.v(azj.h($$1, $$0.O, $$0.dN()));
      }
   }

   public static brx a(buv $$0, cvt $$1) {
      return $$0.fb().a($$1) ? brx.a : brx.b;
   }

   public static cop a(buv $$0, cvx $$1, float $$2, @Nullable cvx $$3) {
      ctx $$4 = (ctx)($$1.h() instanceof ctx ? $$1.h() : cwb.ox);
      cop $$5 = $$4.a($$0.dX(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
