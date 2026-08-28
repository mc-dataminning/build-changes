import java.util.List;
import java.util.function.Predicate;

public class cwe extends cvn {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cwe(cvn.a $$0) {
      super($$0);
   }

   public static cyn c() {
      return cyn.a().a(bvu.c, new bvs(f, 5.0, bvs.a.a), bua.b).a(bvu.e, new bvs(g, -3.4F, bvs.a.a), bua.b).a();
   }

   public static cyy d() {
      return new cyy(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dus $$0, dej $$1, jf $$2, cnx $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cvs $$0, bun $$1, bun $$2) {
      if (a($$2)) {
         arj $$3 = (arj)$$2.dS();
         $$2.h($$2.dv().a(jk.a.b, 0.01F));
         if ($$2 instanceof ark $$4) {
            $$4.ct = this.a($$4);
            $$4.w(true);
            $$4.c.b(new afi($$4));
         }

         if ($$1.aH()) {
            if ($$2 instanceof ark $$5) {
               $$5.b(true);
            }

            awf $$6 = $$2.aa > 5.0F ? awg.or : awg.oq;
            $$3.a(null, $$2.dx(), $$2.dz(), $$2.dD(), $$6, $$2.di(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dx(), $$2.dz(), $$2.dD(), awg.op, $$2.di(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private eyw a(ark $$0) {
      return $$0.gF() && $$0.ct != null && $$0.ct.e <= $$0.dq().e ? $$0.ct : $$0.dq();
   }

   @Override
   public void b(cvs $$0, bun $$1, bun $$2) {
      $$0.a(1, $$2, btz.a);
      if (a($$2)) {
         $$2.n();
      }
   }

   @Override
   public float a(btr $$0, float $$1, bsj $$2) {
      if ($$2.c() instanceof bun $$3) {
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

            return $$3.dS() instanceof arj $$11 ? $$8 + dbp.b($$11, $$3.dW(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dej $$0, btr $$1, btr $$2) {
      $$0.c(2013, $$2.aP(), 750);
      $$0.a(bun.class, $$2.cO().g(3.5), a($$1, $$2)).forEach($$2x -> {
         eyw $$3 = $$2x.dq().d($$2.dq());
         double $$4 = a($$1, $$2x, $$3);
         eyw $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof ark $$6) {
               $$6.c.b(new afi($$6));
            }
         }
      });
   }

   private static Predicate<bun> a(btr $$0, btr $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.Q_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bvj $$6 && $$6.q() && $$0.cD().equals($$6.aa_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cjw $$8 && $$8.A()) {
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

   private static double a(btr $$0, bun $$1, eyw $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.aa > 5.0F ? 2 : 1) * (1.0 - $$1.h(bvu.p));
   }

   public static boolean a(bun $$0) {
      return $$0.aa > 1.5F && !$$0.fF();
   }
}
