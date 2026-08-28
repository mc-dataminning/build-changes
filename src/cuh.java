import java.util.List;
import java.util.function.Predicate;

public class cuh extends ctv {
   private static final int c = 5;
   private static final float j = -3.5F;
   public static final float a = 1.5F;
   private static final float k = 5.0F;
   public static final float b = 3.5F;
   private static final float l = 0.7F;

   public cuh(ctv.a $$0) {
      super($$0);
   }

   public static cwu h() {
      return cwu.a().a(bug.c, new bue(e, "Weapon modifier", 5.0, bue.a.a), bsl.b).a(bug.e, new bue(f, "Weapon modifier", -3.5, bue.a.a), bsl.b).a();
   }

   public static cxe k() {
      return new cxe(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cua $$0, bsy $$1, bsy $$2) {
      if ($$2 instanceof aql $$3 && a($$3)) {
         aqk $$4 = (aqk)$$2.dP();
         $$3.cx = $$3.dn();
         $$3.cz = true;
         $$3.h($$3.ds().a(jf.a.b, 0.01F));
         $$3.c.b(new aeu($$3));
         if ($$1.aE()) {
            $$3.b(true);
            ave $$5 = $$3.ac > 5.0F ? avf.oq : avf.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), avf.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
         return true;
      }

      return false;
   }

   @Override
   public void b(cua $$0, bsy $$1, bsy $$2) {
      $$0.a(1, $$2, bsk.a);
   }

   @Override
   public boolean a(cua $$0, cua $$1) {
      return $$1.a(cud.yG);
   }

   @Override
   public float a(bsd $$0, float $$1, bqw $$2) {
      if ($$2.c() instanceof bsy $$3) {
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

            return $$3.dP() instanceof aqk $$11 ? $$8 + czl.b($$11, $$3.eT(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dcd $$0, cmh $$1, bsd $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(bsy.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evz $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evz $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<bsy> a(cmh $$0, bsd $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof btv $$6 && $$6.s() && $$0.cz().equals($$6.W_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cig $$8 && $$8.z()) {
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

   private static double a(cmh $$0, bsy $$1, evz $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(bug.p));
   }

   public static boolean a(bsy $$0) {
      return $$0.ac > 1.5F && !$$0.fA();
   }
}
