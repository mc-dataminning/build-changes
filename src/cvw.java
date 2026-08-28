import java.util.List;
import java.util.function.Predicate;

public class cvw extends cvg {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cvw(cvg.a $$0) {
      super($$0);
   }

   public static cyg h() {
      return cyg.a().a(bvm.c, new bvk(f, 5.0, bvk.a.a), bts.b).a(bvm.e, new bvk(g, -3.4F, bvk.a.a), bts.b).a();
   }

   public static cyq k() {
      return new cyq(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dua $$0, dds $$1, je $$2, cnp $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cvl $$0, buf $$1, buf $$2) {
      if (a($$2)) {
         arg $$3 = (arg)$$2.dS();
         $$2.h($$2.dv().a(jj.a.b, 0.01F));
         if ($$2 instanceof arh $$4) {
            $$4.cu = this.a($$4);
            $$4.w(true);
            $$4.c.b(new afh($$4));
         }

         if ($$1.aH()) {
            if ($$2 instanceof arh $$5) {
               $$5.b(true);
            }

            awc $$6 = $$2.aa > 5.0F ? awd.or : awd.oq;
            $$3.a(null, $$2.dx(), $$2.dz(), $$2.dD(), $$6, $$2.di(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dx(), $$2.dz(), $$2.dD(), awd.op, $$2.di(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private eye a(arh $$0) {
      return $$0.gE() && $$0.cu != null && $$0.cu.e <= $$0.dq().e ? $$0.cu : $$0.dq();
   }

   @Override
   public void b(cvl $$0, buf $$1, buf $$2) {
      $$0.a(1, $$2, btr.a);
      if (a($$2)) {
         $$2.n();
      }
   }

   @Override
   public float a(btj $$0, float $$1, bsb $$2) {
      if ($$2.c() instanceof buf $$3) {
         if (!a($$3)) {
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

            return $$3.dS() instanceof arg $$11 ? $$8 + day.b($$11, $$3.dW(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dds $$0, btj $$1, btj $$2) {
      $$0.c(2013, $$2.aP(), 750);
      $$0.a(buf.class, $$2.cO().g(3.5), a($$1, $$2)).forEach($$2x -> {
         eye $$3 = $$2x.dq().d($$2.dq());
         double $$4 = a($$1, $$2x, $$3);
         eye $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arh $$6) {
               $$6.c.b(new afh($$6));
            }
         }
      });
   }

   private static Predicate<buf> a(btj $$0, btj $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.P_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bvb $$6 && $$6.q() && $$0.cD().equals($$6.Z_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cjo $$8 && $$8.A()) {
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

   private static double a(btj $$0, buf $$1, eye $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.aa > 5.0F ? 2 : 1) * (1.0 - $$1.h(bvm.p));
   }

   public static boolean a(buf $$0) {
      return $$0.aa > 1.5F && !$$0.fE();
   }
}
