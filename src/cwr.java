import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cwr extends cwb {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float l = 5.0F;
   public static final float b = 3.5F;
   private static final float m = 0.7F;

   public cwr(cwb.a $$0) {
      super($$0);
   }

   public static cyw b() {
      return cyw.a().a(bwm.c, new bwk(f, 5.0, bwk.a.a), bur.b).a(bwm.e, new bwk(g, -3.4F, bwk.a.a), bur.b).a();
   }

   public static czh c() {
      return new czh(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvo $$0, dff $$1, jh $$2, cor $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cwf $$0, bve $$1, bve $$2) {
      if (b($$2)) {
         arq $$3 = (arq)$$2.dY();
         $$2.h($$2.dB().a(jm.a.b, 0.01F));
         if ($$2 instanceof arr $$4) {
            $$4.cx = this.a($$4);
            $$4.w(true);
            $$4.g.b(new afp($$4));
         }

         if ($$1.aL()) {
            if ($$2 instanceof arr $$5) {
               $$5.b(true);
            }

            awn $$6 = $$2.aa > 5.0F ? awo.op : awo.oo;
            $$3.a(null, $$2.dD(), $$2.dF(), $$2.dJ(), $$6, $$2.do(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dD(), $$2.dF(), $$2.dJ(), awo.on, $$2.do(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private ezr a(arr $$0) {
      return $$0.gO() && $$0.cx != null && $$0.cx.e <= $$0.dw().e ? $$0.cx : $$0.dw();
   }

   @Override
   public void b(cwf $$0, bve $$1, bve $$2) {
      $$0.a(1, $$2, buq.a);
      if (b($$2)) {
         $$2.n();
      }
   }

   @Override
   public float a(bui $$0, float $$1, bsy $$2) {
      if ($$2.c() instanceof bve $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            float $$5 = 3.0F;
            float $$6 = 8.0F;
            float $$7 = $$3.aa;
            float $$8;
            if ($$7 <= 3.0F) {
               $$8 = 4.0F * $$7;
            } else if ($$7 <= 8.0F) {
               $$8 = 12.0F + 2.0F * ($$7 - 3.0F);
            } else {
               $$8 = 22.0F + $$7 - 8.0F;
            }

            return $$3.dY() instanceof arq $$11 ? $$8 + dby.b($$11, $$3.ec(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dff $$0, bui $$1, bui $$2) {
      $$0.c(2013, $$2.aT(), 750);
      $$0.a(bve.class, $$2.cT().g(3.5), a($$1, $$2)).forEach($$2x -> {
         ezr $$3 = $$2x.dw().d($$2.dw());
         double $$4 = a($$1, $$2x, $$3);
         ezr $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arr $$6) {
               $$6.g.b(new afp($$6));
            }
         }
      });
   }

   private static Predicate<bve> a(bui $$0, bui $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.R_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwb $$6 && $$6.q() && $$0.cI().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cko $$8 && $$8.A()) {
               var10000 = false;
               break label55;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         boolean $$11 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$7 && $$10 && $$11;
      };
   }

   private static double a(bui $$0, bve $$1, ezr $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.aa > 5.0F ? 2 : 1) * (1.0 - $$1.h(bwm.p));
   }

   public static boolean b(bve $$0) {
      return $$0.aa > 1.5F && !$$0.fM();
   }

   @Nullable
   @Override
   public bsy a(bve $$0) {
      return b($$0) ? $$0.dZ().f($$0) : super.a($$0);
   }
}
