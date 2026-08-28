import java.util.List;
import java.util.function.Predicate;

public class cuv extends cuj {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public cuv(cuj.a $$0) {
      super($$0);
   }

   public static cxj h() {
      return cxj.a().a(buw.c, new buu(e, "Weapon modifier", 6.0, buu.a.a), btb.b).a(buw.e, new buu(f, "Weapon modifier", -2.4F, buu.a.a), btb.b).a();
   }

   public static cxt k() {
      return new cxt(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cuo $$0, bto $$1, bto $$2) {
      $$0.a(1, $$2, bta.a);
      if ($$2 instanceof arf $$3 && a($$3)) {
         are $$4 = (are)$$2.dP();
         $$3.cv = $$3.dn();
         $$3.cx = true;
         $$3.h($$3.ds().a(je.a.b, 0.01F));
         $$3.c.b(new afo($$3));
         if ($$1.aE()) {
            $$3.b(true);
            avy $$5 = $$3.ac > 5.0F ? avz.oq : avz.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), avz.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
         return true;
      }

      return false;
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return $$1.a(cur.yD);
   }

   @Override
   public float a(cmw $$0, float $$1) {
      int $$2 = daa.a(dac.L, $$0);
      float $$3 = czx.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dbx $$0, cmw $$1, bst $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(bto.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         evq $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         evq $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<bto> a(cmw $$0, bst $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof ciw $$6 && $$6.z()) {
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

   private static double a(cmw $$0, bto $$1, evq $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(buw.n));
   }

   public static boolean a(cmw $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
