import java.util.List;
import java.util.function.Predicate;

public class cuw extends cuk {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public cuw(cuk.a $$0) {
      super($$0);
   }

   public static cxk h() {
      return cxk.a().a(bux.c, new buv(e, "Weapon modifier", 6.0, buv.a.a), btc.b).a(bux.e, new buv(f, "Weapon modifier", -2.4F, buv.a.a), btc.b).a();
   }

   public static cxu k() {
      return new cxu(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cup $$0, btp $$1, btp $$2) {
      $$0.a(1, $$2, btb.a);
      if ($$2 instanceof arg $$3 && a($$3)) {
         arf $$4 = (arf)$$2.dP();
         $$3.cv = $$3.dn();
         $$3.cx = true;
         $$3.h($$3.ds().a(je.a.b, 0.01F));
         $$3.c.b(new afp($$3));
         if ($$1.aE()) {
            $$3.b(true);
            avz $$5 = $$3.ac > 5.0F ? awa.oq : awa.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), awa.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
         return true;
      }

      return false;
   }

   @Override
   public boolean a(cup $$0, cup $$1) {
      return $$1.a(cus.yD);
   }

   @Override
   public float a(cmx $$0, float $$1) {
      int $$2 = dab.a(dad.L, $$0);
      float $$3 = czy.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dby $$0, cmx $$1, bsu $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(btp.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evr $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evr $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<btp> a(cmx $$0, bsu $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof cix $$6 && $$6.z()) {
               var10000 = false;
               break label44;
            }

            var10000 = true;
         }

         boolean $$8 = var10000;
         boolean $$9 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$9;
      };
   }

   private static double a(cmx $$0, btp $$1, evr $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(bux.n));
   }

   public static boolean a(cmx $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
