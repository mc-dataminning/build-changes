import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cwn extends cvx {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float l = 5.0F;
   public static final float b = 3.5F;
   private static final float m = 0.7F;

   public cwn(cvx.a $$0) {
      super($$0);
   }

   public static cys b() {
      return cys.a().a(bwi.c, new bwg(f, 5.0, bwg.a.a), bun.b).a(bwi.e, new bwg(g, -3.4F, bwg.a.a), bun.b).a();
   }

   public static czd c() {
      return new czd(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvj $$0, dfb $$1, jh $$2, com $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cwb $$0, bva $$1, bva $$2) {
      if (b($$2)) {
         arn $$3 = (arn)$$2.dX();
         $$2.h($$2.dA().a(jm.a.b, 0.01F));
         if ($$2 instanceof aro $$4) {
            $$4.cx = this.a($$4);
            $$4.w(true);
            $$4.g.b(new afm($$4));
         }

         if ($$1.aK()) {
            if ($$2 instanceof aro $$5) {
               $$5.b(true);
            }

            awk $$6 = $$2.aa > 5.0F ? awl.op : awl.oo;
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), awl.on, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private ezn a(aro $$0) {
      return $$0.gM() && $$0.cx != null && $$0.cx.e <= $$0.dv().e ? $$0.cx : $$0.dv();
   }

   @Override
   public void b(cwb $$0, bva $$1, bva $$2) {
      $$0.a(1, $$2, bum.a);
      if (b($$2)) {
         $$2.n();
      }
   }

   @Override
   public float a(bue $$0, float $$1, bsu $$2) {
      if ($$2.c() instanceof bva $$3) {
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

            return $$3.dX() instanceof arn $$11 ? $$8 + dbu.b($$11, $$3.eb(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dfb $$0, bue $$1, bue $$2) {
      $$0.c(2013, $$2.aS(), 750);
      $$0.a(bva.class, $$2.cS().g(3.5), a($$1, $$2)).forEach($$2x -> {
         ezn $$3 = $$2x.dv().d($$2.dv());
         double $$4 = a($$1, $$2x, $$3);
         ezn $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof aro $$6) {
               $$6.g.b(new afm($$6));
            }
         }
      });
   }

   private static Predicate<bva> a(bue $$0, bue $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.R_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bvx $$6 && $$6.q() && $$0.cH().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ckk $$8 && $$8.A()) {
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

   private static double a(bue $$0, bva $$1, ezn $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.aa > 5.0F ? 2 : 1) * (1.0 - $$1.h(bwi.p));
   }

   public static boolean b(bva $$0) {
      return $$0.aa > 1.5F && !$$0.fL();
   }

   @Nullable
   @Override
   public bsu a(bva $$0) {
      return b($$0) ? $$0.dY().f($$0) : super.a($$0);
   }
}
