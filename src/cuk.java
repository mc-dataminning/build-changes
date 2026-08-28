import java.util.List;
import java.util.function.Predicate;

public class cuk extends cty {
   private static final int c = 5;
   private static final float j = -3.5F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cuk(cty.a $$0) {
      super($$0);
   }

   public static cwx h() {
      return cwx.a().a(buk.c, new bui(e, "Weapon modifier", 5.0, bui.a.a), bsp.b).a(buk.e, new bui(f, "Weapon modifier", -3.5, bui.a.a), bsp.b).a();
   }

   public static cxh k() {
      return new cxh(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cud $$0, btc $$1, btc $$2) {
      if ($$2 instanceof aqn $$3 && a($$3)) {
         aqm $$4 = (aqm)$$2.dR();
         $$3.cy = $$3.dp();
         $$3.cA = true;
         $$3.j($$3.du().a(jf.a.b, 0.01F));
         $$3.c.b(new aeu($$3));
         if ($$1.aG()) {
            $$3.c(true);
            avg $$5 = $$3.ac > 5.0F ? avh.oq : avh.op;
            $$4.a(null, $$3.dw(), $$3.dy(), $$3.dC(), $$5, $$3.dg(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.dw(), $$3.dy(), $$3.dC(), avh.oo, $$3.dg(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public void b(cud $$0, btc $$1, btc $$2) {
      $$0.a(1, $$2, bso.a);
   }

   @Override
   public boolean a(cud $$0, cud $$1) {
      return $$1.a(cug.yG);
   }

   @Override
   public float a(bsh $$0, float $$1, bra $$2) {
      if ($$2.c() instanceof btc $$3) {
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

            return $$3.dR() instanceof aqm $$11 ? $$8 + czo.b($$11, $$3.eV(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dcg $$0, cml $$1, bsh $$2) {
      $$0.c(2013, $$2.aN(), 750);
      $$0.a(btc.class, $$2.cM().g(3.5), a($$1, $$2)).forEach($$2x -> {
         ewh $$3 = $$2x.dp().d($$2.dp());
         double $$4 = a($$1, $$2x, $$3);
         ewh $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
            if ($$2x instanceof aqn $$6) {
               $$6.c.b(new aeu($$6));
            }
         }
      });
   }

   private static Predicate<btc> a(cml $$0, bsh $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof btz $$6 && $$6.s() && $$0.cB().equals($$6.W_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cik $$8 && $$8.z()) {
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

   private static double a(cml $$0, btc $$1, ewh $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buk.p));
   }

   public static boolean a(btc $$0) {
      return $$0.ac > 1.5F && !$$0.fC();
   }
}
