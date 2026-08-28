import java.util.List;

public class cwh extends cui implements cvf {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwh(cui.a $$0) {
      super($$0);
   }

   public static cxi h() {
      return cxi.a().a(buv.c, new but(e, "Tool modifier", 8.0, but.a.a), bta.b).a(buv.e, new but(f, "Tool modifier", -2.9F, but.a.a), bta.b).a();
   }

   public static cxs k() {
      return new cxs(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
      return !$$3.f();
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.f;
   }

   @Override
   public int b(cun $$0) {
      return 72000;
   }

   @Override
   public void a(cun $$0, dbw $$1, btn $$2, int $$3) {
      if ($$2 instanceof cmv $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = czz.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, btn.d($$2.fw()));
                  if ($$6 == 0) {
                     coa $$7 = new coa($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cnb.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avz.zD, awa.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(awj.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayx.a($$8 * (float) (Math.PI / 180.0)) * ayx.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayx.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayx.b($$8 * (float) (Math.PI / 180.0)) * ayx.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayx.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bts.a, new evp(0.0, 1.1999999F, 0.0));
                  }

                  avy $$16;
                  if ($$6 >= 3) {
                     $$16 = avz.zC;
                  } else if ($$6 == 2) {
                     $$16 = avz.zB;
                  } else {
                     $$16 = avz.zA;
                  }

                  $$1.a(null, $$4, $$16, awa.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqt.d($$3);
      } else if (czz.j($$3) > 0 && !$$1.bf()) {
         return bqt.d($$3);
      } else {
         $$1.c($$2);
         return bqt.b($$3);
      }
   }

   @Override
   public boolean a(cun $$0, btn $$1, btn $$2) {
      $$0.a(1, $$2, bsz.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      coa $$4 = new coa($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnb.a.b;
      return $$4;
   }
}
