import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czk extends cyu {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float o = 5.0F;
   public static final float b = 3.5F;
   private static final float p = 0.7F;

   public czk(cyu.a $$0) {
      super($$0);
   }

   public static dbp a() {
      return dbp.a().a(byi.c, new byg(h, 5.0, byg.a.a), bwo.b).a(byi.e, new byg(i, -3.4F, byg.a.a), bwo.b).a();
   }

   public static dcb b() {
      return new dcb(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(cyy $$0, bxc $$1, bxc $$2) {
      if (b($$2)) {
         arq $$3 = (arq)$$2.dV();
         $$2.i($$2.dy().a(ja.a.b, 0.01F));
         if ($$2 instanceof arr $$4) {
            $$4.cl = this.a($$4);
            $$4.w(true);
            $$4.f.b(new aff($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof arr $$5) {
               $$5.b(true);
            }

            awm $$6 = $$2.Z > 5.0 ? awn.oZ : awn.oY;
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$6, $$2.dm(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), awn.oX, $$2.dm(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private fei a(arr $$0) {
      return $$0.gM() && $$0.cl != null && $$0.cl.e <= $$0.dt().e ? $$0.cl : $$0.dt();
   }

   @Override
   public void b(cyy $$0, bxc $$1, bxc $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bwd $$0, float $$1, bus $$2) {
      if ($$2.c() instanceof bxc $$3) {
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

            return $$3.dV() instanceof arq $$11 ? (float)($$8 + (double)dfn.b($$11, $$3.dZ(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(div $$0, bwd $$1, bwd $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bxc.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fei $$3 = $$2x.dt().d($$2.dt());
         double $$4 = a($$1, $$2x, $$3);
         fei $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arr $$6) {
               $$6.f.b(new aff($$6));
            }
         }
      });
   }

   private static Predicate<bxc> a(bwd $$0, bwd $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.U_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bxy $$6 && $$1 instanceof bxc $$7 && $$6.q() && $$6.j($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cms $$9 && $$9.t()) {
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

   private static double a(bwd $$0, bxc $$1, fei $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0 ? 2 : 1) * (1.0 - $$1.h(byi.p));
   }

   public static boolean b(bxc $$0) {
      return $$0.Z > 1.5 && !$$0.fI();
   }

   @Nullable
   @Override
   public bus a(bxc $$0) {
      return b($$0) ? $$0.dW().f($$0) : super.a($$0);
   }
}
