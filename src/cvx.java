import java.util.List;

public class cvx extends cty implements cuv {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cvx(cty.a $$0) {
      super($$0);
   }

   public static cwx h() {
      return cwx.a().a(buk.c, new bui(e, "Tool modifier", 8.0, bui.a.a), bsp.b).a(buk.e, new bui(f, "Tool modifier", -2.9F, bui.a.a), bsp.b).a();
   }

   public static cxh k() {
      return new cxh(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      return !$$3.f();
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.f;
   }

   @Override
   public int a(cud $$0, btc $$1) {
      return 72000;
   }

   @Override
   public void a(cud $$0, dcg $$1, btc $$2, int $$3) {
      if ($$2 instanceof cml $$4) {
         int $$5 = this.a($$0, $$2) - $$3;
         if ($$5 >= 10) {
            float $$6 = czo.b($$4);
            if (!($$6 > 0.0F) || $$4.bh()) {
               jj<avg> $$7 = czo.b($$0, czn.C).orElse(avh.zG);
               if (!$$1.B) {
                  $$0.a(1, $$4, btc.d($$2.fu()));
                  if ($$6 == 0.0F) {
                     cnq $$8 = new cnq($$1, $$4, $$0);
                     $$8.a($$4, $$4.dJ(), $$4.dH(), 0.0F, 2.5F, 1.0F);
                     if ($$4.fN()) {
                        $$8.d = cmr.a.c;
                     }

                     $$1.b($$8);
                     $$1.a(null, $$8, $$7.a(), avi.h, 1.0F, 1.0F);
                     if (!$$4.fN()) {
                        $$4.ga().h($$0);
                     }
                  }
               }

               $$4.b(avr.c.b(this));
               if ($$6 > 0.0F) {
                  float $$9 = $$4.dH();
                  float $$10 = $$4.dJ();
                  float $$11 = -ayg.a($$9 * (float) (Math.PI / 180.0)) * ayg.b($$10 * (float) (Math.PI / 180.0));
                  float $$12 = -ayg.a($$10 * (float) (Math.PI / 180.0));
                  float $$13 = ayg.b($$9 * (float) (Math.PI / 180.0)) * ayg.b($$10 * (float) (Math.PI / 180.0));
                  float $$14 = ayg.c($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
                  $$11 *= $$6 / $$14;
                  $$12 *= $$6 / $$14;
                  $$13 *= $$6 / $$14;
                  $$4.j((double)$$11, (double)$$12, (double)$$13);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aG()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bth.a, new ewh(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$7.a(), avi.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqi.d($$3);
      } else if (czo.b($$1) > 0.0F && !$$1.bh()) {
         return bqi.d($$3);
      } else {
         $$1.c($$2);
         return bqi.b($$3);
      }
   }

   @Override
   public boolean a(cud $$0, btc $$1, btc $$2) {
      return true;
   }

   @Override
   public void b(cud $$0, btc $$1, btc $$2) {
      $$0.a(1, $$2, bso.a);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnd a(dcg $$0, jt $$1, cud $$2, jf $$3) {
      cnq $$4 = new cnq($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cmr.a.b;
      return $$4;
   }
}
