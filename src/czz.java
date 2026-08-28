import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czz extends czj {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float o = 5.0F;
   public static final float b = 3.5F;
   private static final float p = 0.7F;

   public czz(czj.a $$0) {
      super($$0);
   }

   public static dce a() {
      return dce.a().a(byp.c, new byn(h, 5.0, byn.a.a), bwt.b).a(byp.e, new byn(i, -3.4F, byn.a.a), bwt.b).a();
   }

   public static dcq b() {
      return new dcq(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(czn $$0, bxj $$1, bxj $$2) {
      if (b($$2)) {
         arq $$3 = (arq)$$2.dU();
         $$2.i($$2.dx().a(jb.a.b, 0.01F));
         if ($$2 instanceof arr $$4) {
            $$4.cm = this.a($$4);
            $$4.w(true);
            $$4.f.b(new aff($$4));
         }

         if ($$1.aH()) {
            if ($$2 instanceof arr $$5) {
               $$5.b(true);
            }

            awm $$6 = $$2.Z > 5.0 ? awn.pc : awn.pb;
            $$3.a(null, $$2.dz(), $$2.dB(), $$2.dF(), $$6, $$2.dl(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dz(), $$2.dB(), $$2.dF(), awn.pa, $$2.dl(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private ffc a(arr $$0) {
      return $$0.gM() && $$0.cm != null && $$0.cm.e <= $$0.ds().e ? $$0.cm : $$0.ds();
   }

   @Override
   public void b(czn $$0, bxj $$1, bxj $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bwi $$0, float $$1, bux $$2) {
      if ($$2.c() instanceof bxj $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            double $$5 = 3.0;
            double $$6 = 8.0;
            double $$7 = $$3.Z;
            double $$8;
            if ($$7 <= 3.0) {
               $$8 = 4.0 * $$7;
            } else if ($$7 <= 8.0) {
               $$8 = 12.0 + 2.0 * ($$7 - 3.0);
            } else {
               $$8 = 22.0 + $$7 - 8.0;
            }

            return $$3.dU() instanceof arq $$11 ? (float)($$8 + (double)dgc.b($$11, $$3.dY(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(djm $$0, bwi $$1, bwi $$2) {
      $$0.c(2013, $$2.aP(), 750);
      $$0.a(bxj.class, $$2.cQ().g(3.5), a($$1, $$2)).forEach($$2x -> {
         ffc $$3 = $$2x.ds().d($$2.ds());
         double $$4 = a($$1, $$2x, $$3);
         ffc $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.i($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arr $$6) {
               $$6.f.b(new aff($$6));
            }
         }
      });
   }

   private static Predicate<bxj> a(bwi $$0, bwi $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.V_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof byf $$6 && $$1 instanceof bxj $$7 && $$6.q() && $$6.j($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cng $$9 && $$9.t()) {
               var10000 = false;
               break label56;
            }

            var10000 = true;
         }

         boolean $$11 = var10000;
         boolean $$12 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$11 && $$12;
      };
   }

   private static double a(bwi $$0, bxj $$1, ffc $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0 ? 2 : 1) * (1.0 - $$1.h(byp.p));
   }

   public static boolean b(bxj $$0) {
      return $$0.Z > 1.5 && !$$0.fI();
   }

   @Nullable
   @Override
   public bux a(bxj $$0) {
      return b($$0) ? $$0.dV().f($$0) : super.a($$0);
   }
}
