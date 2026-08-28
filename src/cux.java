import java.util.List;
import java.util.function.Predicate;

public class cux extends cul {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public cux(cul.a $$0) {
      super($$0);
   }

   public static cxl h() {
      return cxl.a().a(buy.c, new buw(e, "Weapon modifier", 6.0, buw.a.a), btd.b).a(buy.e, new buw(f, "Weapon modifier", -2.4F, buw.a.a), btd.b).a();
   }

   public static cxv k() {
      return new cxv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cuq $$0, btq $$1, btq $$2) {
      $$0.a(1, $$2, btc.a);
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
   public boolean a(cuq $$0, cuq $$1) {
      return $$1.a(cut.yD);
   }

   @Override
   public float a(cmy $$0, float $$1) {
      int $$2 = dac.a(dae.L, $$0);
      float $$3 = czz.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dbz $$0, cmy $$1, bsv $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(btq.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evs $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evs $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<btq> a(cmy $$0, bsv $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof ciy $$6 && $$6.z()) {
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

   private static double a(cmy $$0, btq $$1, evs $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buy.n));
   }

   public static boolean a(cmy $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
