import java.util.List;
import java.util.function.Predicate;

public class cvb extends cul {
   private static final int c = 5;
   private static final float j = -3.4F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cvb(cul.a $$0) {
      super($$0);
   }

   public static cxn h() {
      return cxn.a().a(buw.c, new buu(e, 5.0, buu.a.a), bsz.b).a(buw.e, new buu(f, -3.4F, buu.a.a), bsz.b).a();
   }

   public static cxx k() {
      return new cxx(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cuq $$0, btn $$1, btn $$2) {
      if ($$2 instanceof aqv $$3 && a($$3)) {
         aqu $$4 = (aqu)$$2.dO();
         $$3.cx = $$3.dm();
         $$3.w(true);
         $$3.i($$3.dr().a(ji.a.b, 0.01F));
         $$3.c.b(new afb($$3));
         if ($$1.aF()) {
            $$3.b(true);
            avo $$5 = $$3.ac > 5.0F ? avp.oq : avp.op;
            $$4.a(null, $$3.dt(), $$3.dv(), $$3.dz(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.dt(), $$3.dv(), $$3.dz(), avp.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public void b(cuq $$0, btn $$1, btn $$2) {
      $$0.a(1, $$2, bsy.a);
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return $$1.a(cut.yG);
   }

   @Override
   public float a(bsr $$0, float $$1, brk $$2) {
      if ($$2.c() instanceof btn $$3) {
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

            return $$3.dO() instanceof aqu $$11 ? $$8 + dae.b($$11, $$3.dS(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dcw $$0, cmx $$1, bsr $$2) {
      $$0.c(2013, $$2.aM(), 750);
      $$0.a(btn.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         exc $$3 = $$2x.dm().d($$2.dm());
         double $$4 = a($$1, $$2x, $$3);
         exc $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
            if ($$2x instanceof aqv $$6) {
               $$6.c.b(new afb($$6));
            }
         }
      });
   }

   private static Predicate<btn> a(cmx $$0, bsr $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.R_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bul $$6 && $$6.s() && $$0.cz().equals($$6.aa_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ciw $$8 && $$8.z()) {
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

   private static double a(cmx $$0, btn $$1, exc $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buw.p));
   }

   public static boolean a(btn $$0) {
      return $$0.ac > 1.5F && !$$0.fA();
   }
}
