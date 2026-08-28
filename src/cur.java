import java.util.List;
import java.util.function.Predicate;

public class cur extends cuf {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public cur(cuf.a $$0) {
      super($$0);
   }

   public static cxf h() {
      return cxf.a().a(bus.c, new buq(e, "Weapon modifier", 6.0, buq.a.a), bsx.b).a(bus.e, new buq(f, "Weapon modifier", -2.4F, buq.a.a), bsx.b).a();
   }

   public static cxp k() {
      return new cxp(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cuk $$0, btk $$1, btk $$2) {
      $$0.a(1, $$2, bsw.a);
      if ($$2 instanceof arc $$3 && a($$3)) {
         arb $$4 = (arb)$$2.dP();
         $$3.cv = $$3.dn();
         $$3.cx = true;
         $$3.h($$3.ds().a(je.a.b, 0.01F));
         $$3.c.b(new afl($$3));
         if ($$1.aE()) {
            $$3.b(true);
            avv $$5 = $$3.ac > 5.0F ? avw.oq : avw.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), avw.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
         return true;
      }

      return false;
   }

   @Override
   public boolean a(cuk $$0, cuk $$1) {
      return $$1.a(cun.yD);
   }

   @Override
   public float a(cms $$0, float $$1) {
      int $$2 = czw.a(czy.L, $$0);
      float $$3 = czt.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dbt $$0, cms $$1, bsp $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(btk.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evm $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evm $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<btk> a(cms $$0, bsp $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof cis $$6 && $$6.z()) {
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

   private static double a(cms $$0, btk $$1, evm $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(bus.n));
   }

   public static boolean a(cms $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
