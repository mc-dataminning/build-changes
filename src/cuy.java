import java.util.List;
import java.util.function.Predicate;

public class cuy extends cum {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public cuy(cum.a $$0) {
      super($$0);
   }

   public static cxm h() {
      return cxm.a().a(buz.c, new bux(e, "Weapon modifier", 6.0, bux.a.a), bte.b).a(buz.e, new bux(f, "Weapon modifier", -2.4F, bux.a.a), bte.b).a();
   }

   public static cxw k() {
      return new cxw(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cur $$0, btr $$1, btr $$2) {
      $$0.a(1, $$2, btd.a);
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
   public boolean a(cur $$0, cur $$1) {
      return $$1.a(cuu.yD);
   }

   @Override
   public float a(cmz $$0, float $$1) {
      int $$2 = dad.a(daf.L, $$0);
      float $$3 = daa.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dca $$0, cmz $$1, bsw $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(btr.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evt $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evt $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<btr> a(cmz $$0, bsw $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof ciz $$6 && $$6.z()) {
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

   private static double a(cmz $$0, btr $$1, evt $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buz.n));
   }

   public static boolean a(cmz $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
