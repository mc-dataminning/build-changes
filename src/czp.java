import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czp extends cyz {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float o = 5.0F;
   public static final float b = 3.5F;
   private static final float p = 0.7F;

   public czp(cyz.a $$0) {
      super($$0);
   }

   public static dbu a() {
      return dbu.a().a(byk.c, new byi(h, 5.0, byi.a.a), bwq.b).a(byk.e, new byi(i, -3.4F, byi.a.a), bwq.b).a();
   }

   public static dcg b() {
      return new dcg(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(czd $$0, bxe $$1, bxe $$2) {
      if (b($$2)) {
         arq $$3 = (arq)$$2.dV();
         $$2.i($$2.dy().a(ja.a.b, 0.01F));
         if ($$2 instanceof arr $$4) {
            $$4.cm = this.a($$4);
            $$4.w(true);
            $$4.f.b(new aff($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof arr $$5) {
               $$5.b(true);
            }

            awm $$6 = $$2.Z > 5.0 ? awn.pc : awn.pb;
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$6, $$2.dm(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), awn.pa, $$2.dm(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private feq a(arr $$0) {
      return $$0.gN() && $$0.cm != null && $$0.cm.e <= $$0.dt().e ? $$0.cm : $$0.dt();
   }

   @Override
   public void b(czd $$0, bxe $$1, bxe $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bwf $$0, float $$1, buu $$2) {
      if ($$2.c() instanceof bxe $$3) {
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

            return $$3.dV() instanceof arq $$11 ? (float)($$8 + (double)dfs.b($$11, $$3.dZ(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dja $$0, bwf $$1, bwf $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bxe.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         feq $$3 = $$2x.dt().d($$2.dt());
         double $$4 = a($$1, $$2x, $$3);
         feq $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.i($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arr $$6) {
               $$6.f.b(new aff($$6));
            }
         }
      });
   }

   private static Predicate<bxe> a(bwf $$0, bwf $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.V_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bya $$6 && $$1 instanceof bxe $$7 && $$6.q() && $$6.j($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cmw $$9 && $$9.t()) {
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

   private static double a(bwf $$0, bxe $$1, feq $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0 ? 2 : 1) * (1.0 - $$1.h(byk.p));
   }

   public static boolean b(bxe $$0) {
      return $$0.Z > 1.5 && !$$0.fJ();
   }

   @Nullable
   @Override
   public buu a(bxe $$0) {
      return b($$0) ? $$0.dW().f($$0) : super.a($$0);
   }
}
