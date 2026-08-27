import java.util.List;
import java.util.function.Predicate;

public class ctx extends ctl {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;

   public ctx(ctl.a $$0) {
      super($$0);
   }

   public static cwl h() {
      return cwl.a().a(bty.c, new btw(e, "Weapon modifier", 6.0, btw.a.a), bse.b).a(bty.e, new btw(f, "Weapon modifier", -2.4F, btw.a.a), bse.b).a();
   }

   public static cwv k() {
      return new cwv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drd $$0, daz $$1, io $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(ctq $$0, bsq $$1, bsq $$2) {
      $$0.a(1, $$2, bsd.a);
      if ($$2 instanceof aqo $$3 && a($$3)) {
         aqn $$4 = (aqn)$$2.dP();
         if (!$$3.cx || $$3.cv == null || $$3.cv.b() > $$3.dw()) {
            $$3.cv = $$3.dn();
            $$3.cx = true;
         }

         $$3.g($$3.ds().a(it.a.b, 0.0));
         $$3.c.b(new aex($$3));
         if ($$1.aE()) {
            $$3.b(true);
            avh $$5 = $$3.ac > 5.0F ? avi.oq : avi.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), avi.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public boolean a(ctq $$0, ctq $$1) {
      return $$1.a(ctt.yD);
   }

   @Override
   public float a(cly $$0, float $$1) {
      int $$2 = czc.a(cze.L, $$0);
      float $$3 = cyz.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(daz $$0, cly $$1, brw $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(bsq.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         eum $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         eum $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<bsq> a(cly $$0, brw $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof chy $$6 && $$6.z()) {
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

   private static double a(cly $$0, bsq $$1, eum $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(bty.n));
   }

   public static boolean a(cly $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
