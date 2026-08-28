import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtr extends dvy implements dmp, dtx {
   public static final MapCodec<dtr> a = b(dtr::new);
   public static final int b = 4;
   public static final ebo c = ebe.aV;
   public static final ebf d = ebe.I;
   private static final ffr e = dmm.b(4.0, 0.0, 6.0);
   private static final ffr f = dmm.b(10.0, 0.0, 6.0);
   private static final ffr g = dmm.b(12.0, 0.0, 6.0);
   private static final ffr h = dmm.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   protected dtr(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ewv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eww.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(eao $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return !$$0.g($$1, $$2).a(jb.b).c() || $$0.c($$1, $$2, jb.b);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axc.at);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      int $$4 = 5;
      int $$5 = 1;
      int $$6 = 2;
      int $$7 = 0;
      int $$8 = $$2.u() - 2;
      int $$9 = 0;

      for (int $$10 = 0; $$10 < 5; $$10++) {
         for (int $$11 = 0; $$11 < $$5; $$11++) {
            int $$12 = 2 + $$2.v() - 1;

            for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
               iv $$14 = new iv($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dmo.J)) {
                  eao $$15 = $$0.a_($$14.e());
                  if ($$15.a(axc.at)) {
                     $$0.a($$14, dmo.nB.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
                  }
               }
            }
         }

         if ($$7 < 2) {
            $$5 += 2;
            $$9++;
         } else {
            $$5 -= 2;
            $$9--;
         }

         $$7++;
      }

      $$0.a($$2, $$3.b(c, Integer.valueOf(4)), 2);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
