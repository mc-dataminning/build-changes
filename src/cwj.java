import java.util.List;
import java.util.function.Predicate;

public class cwj extends cvt {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float l = 5.0F;
   public static final float b = 3.5F;
   private static final float m = 0.7F;

   public cwj(cvt.a $$0) {
      super($$0);
   }

   public static cym c() {
      return cym.a().a(bwd.c, new bwb(f, 5.0, bwb.a.a), bui.b).a(bwd.e, new bwb(g, -3.4F, bwb.a.a), bui.b).a();
   }

   public static cyx d() {
      return new cyx(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvd $$0, dev $$1, jg $$2, coh $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cvx $$0, buv $$1, buv $$2) {
      if (a($$2)) {
         arm $$3 = (arm)$$2.dX();
         $$2.h($$2.dA().a(jl.a.b, 0.01F));
         if ($$2 instanceof arn $$4) {
            $$4.cu = this.a($$4);
            $$4.w(true);
            $$4.d.b(new afl($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof arn $$5) {
               $$5.b(true);
            }

            awj $$6 = $$2.aa > 5.0F ? awk.op : awk.oo;
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), awk.on, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private ezh a(arn $$0) {
      return $$0.gM() && $$0.cu != null && $$0.cu.e <= $$0.dv().e ? $$0.cu : $$0.dv();
   }

   @Override
   public void b(cvx $$0, buv $$1, buv $$2) {
      $$0.a(1, $$2, buh.a);
      if (a($$2)) {
         $$2.n();
      }
   }

   @Override
   public float a(btz $$0, float $$1, bsp $$2) {
      if ($$2.c() instanceof buv $$3) {
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

            return $$3.dX() instanceof arm $$11 ? $$8 + dbo.b($$11, $$3.eb(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dev $$0, btz $$1, btz $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(buv.class, $$2.cS().g(3.5), a($$1, $$2)).forEach($$2x -> {
         ezh $$3 = $$2x.dv().d($$2.dv());
         double $$4 = a($$1, $$2x, $$3);
         ezh $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arn $$6) {
               $$6.d.b(new afl($$6));
            }
         }
      });
   }

   private static Predicate<buv> a(btz $$0, btz $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.R_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bvs $$6 && $$6.q() && $$0.cH().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ckf $$8 && $$8.A()) {
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

   private static double a(btz $$0, buv $$1, ezh $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.aa > 5.0F ? 2 : 1) * (1.0 - $$1.h(bwd.p));
   }

   public static boolean a(buv $$0) {
      return $$0.aa > 1.5F && !$$0.fL();
   }
}
