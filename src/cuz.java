import java.util.List;
import java.util.function.Predicate;

public class cuz extends cuj {
   private static final int c = 5;
   private static final float j = -3.5F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cuz(cuj.a $$0) {
      super($$0);
   }

   public static cxl h() {
      return cxl.a().a(buu.c, new bus(e, 5.0, bus.a.a), bsy.b).a(buu.e, new bus(f, -3.5, bus.a.a), bsy.b).a();
   }

   public static cxv k() {
      return new cxv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cuo $$0, btl $$1, btl $$2) {
      if ($$2 instanceof aqu $$3 && a($$3)) {
         aqt $$4 = (aqt)$$2.dQ();
         $$3.cx = $$3.do();
         $$3.cz = true;
         $$3.i($$3.dt().a(ji.a.b, 0.01F));
         $$3.c.b(new afa($$3));
         if ($$1.aF()) {
            $$3.c(true);
            avn $$5 = $$3.ac > 5.0F ? avo.oq : avo.op;
            $$4.a(null, $$3.dv(), $$3.dx(), $$3.dB(), $$5, $$3.df(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.dv(), $$3.dx(), $$3.dB(), avo.oo, $$3.df(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public void b(cuo $$0, btl $$1, btl $$2) {
      $$0.a(1, $$2, bsx.a);
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return $$1.a(cur.yG);
   }

   @Override
   public float a(bsq $$0, float $$1, brj $$2) {
      if ($$2.c() instanceof btl $$3) {
         if (!a($$3)) {
            return 0.0F;
         } else {
            float $$5 = 3.0F;
            float $$6 = 8.0F;
            float $$7 = $$3.ac;
            float $$8;
            if ($$7 <= 3.0F) {
               $$8 = 4.0F * $$7;
            } else if ($$7 <= 8.0F) {
               $$8 = 12.0F + 2.0F * ($$7 - 3.0F);
            } else {
               $$8 = 22.0F + $$7 - 8.0F;
            }

            return $$3.dQ() instanceof aqt $$11 ? $$8 + dac.b($$11, $$3.eU(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dcu $$0, cmv $$1, bsq $$2) {
      $$0.c(2013, $$2.aM(), 750);
      $$0.a(btl.class, $$2.cL().g(3.5), a($$1, $$2)).forEach($$2x -> {
         eww $$3 = $$2x.do().d($$2.do());
         double $$4 = a($$1, $$2x, $$3);
         eww $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
            if ($$2x instanceof aqu $$6) {
               $$6.c.b(new afa($$6));
            }
         }
      });
   }

   private static Predicate<btl> a(cmv $$0, bsq $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof buj $$6 && $$6.s() && $$0.cA().equals($$6.W_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ciu $$8 && $$8.z()) {
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

   private static double a(cmv $$0, btl $$1, eww $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buu.p));
   }

   public static boolean a(btl $$0) {
      return $$0.ac > 1.5F && !$$0.fB();
   }
}
