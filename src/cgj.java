import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cgj {
   private static final float a = 0.3F;

   public static ema a(blw $$0, Predicate<blw> $$1) {
      emc $$2 = $$0.do();
      ctx $$3 = $$0.dL();
      emc $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, ctg.a.a);
   }

   public static ema a(blw $$0, Predicate<blw> $$1, ctg.a $$2) {
      emc $$3 = $$0.do();
      ctx $$4 = $$0.dL();
      emc $$5 = $$0.dj();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ema a(blw $$0, Predicate<blw> $$1, double $$2) {
      emc $$3 = $$0.f(0.0F).a($$2);
      ctx $$4 = $$0.dL();
      emc $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, ctg.a.a);
   }

   private static ema a(emc $$0, blw $$1, Predicate<blw> $$2, emc $$3, ctx $$4, float $$5, ctg.a $$6) {
      emc $$7 = $$0.e($$3);
      ema $$8 = $$4.a(new ctg($$0, $$7, $$6, ctg.b.a, $$1));
      if ($$8.c() != ema.a.a) {
         $$7 = $$8.e();
      }

      ema $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static elz a(blw $$0, emc $$1, emc $$2, elx $$3, Predicate<blw> $$4, double $$5) {
      ctx $$6 = $$0.dL();
      double $$7 = $$5;
      blw $$8 = null;
      emc $$9 = null;

      for (blw $$10 : $$6.a($$0, $$3, $$4)) {
         elx $$11 = $$10.cH().g((double)$$10.bE());
         Optional<emc> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            emc $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cW() == $$0.cW()) {
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

      return $$8 == null ? null : new elz($$8, $$9);
   }

   @Nullable
   public static elz a(ctx $$0, blw $$1, emc $$2, emc $$3, elx $$4, Predicate<blw> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static elz a(ctx $$0, blw $$1, emc $$2, emc $$3, elx $$4, Predicate<blw> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      blw $$8 = null;

      for (blw $$9 : $$0.a($$1, $$4, $$5)) {
         elx $$10 = $$9.cH().g((double)$$6);
         Optional<emc> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new elz($$8);
   }

   public static void a(blw $$0, float $$1) {
      emc $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aup.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aup.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dD() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dD() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dB() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dB() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(aup.i($$1, $$0.O, $$0.dD()));
         $$0.r(aup.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bkb a(bmo $$0, cnb $$1) {
      return $$0.eT().a($$1) ? bkb.a : bkb.b;
   }

   public static cfw a(bmo $$0, cng $$1, float $$2) {
      ckv $$3 = (ckv)($$1.d() instanceof ckv ? $$1.d() : cnj.ou);
      cfw $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cnj.vm) && $$4 instanceof cfy) {
         ((cfy)$$4).a($$1);
      }

      return $$4;
   }
}
