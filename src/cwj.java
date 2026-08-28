import java.util.List;

public class cwj extends cuk implements cvh {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwj(cuk.a $$0) {
      super($$0);
   }

   public static cxk h() {
      return cxk.a().a(bux.c, new buv(e, "Tool modifier", 8.0, buv.a.a), btc.b).a(bux.e, new buv(f, "Tool modifier", -2.9F, buv.a.a), btc.b).a();
   }

   public static cxu k() {
      return new cxu(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      return !$$3.f();
   }

   @Override
   public cwk c(cup $$0) {
      return cwk.f;
   }

   @Override
   public int b(cup $$0) {
      return 72000;
   }

   @Override
   public void a(cup $$0, dby $$1, btp $$2, int $$3) {
      if ($$2 instanceof cmx $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = dab.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, btp.d($$2.fw()));
                  if ($$6 == 0) {
                     coc $$7 = new coc($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cnd.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, awa.zD, awb.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(awk.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayz.a($$8 * (float) (Math.PI / 180.0)) * ayz.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayz.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayz.b($$8 * (float) (Math.PI / 180.0)) * ayz.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayz.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(btu.a, new evr(0.0, 1.1999999F, 0.0));
                  }

                  avz $$16;
                  if ($$6 >= 3) {
                     $$16 = awa.zC;
                  } else if ($$6 == 2) {
                     $$16 = awa.zB;
                  } else {
                     $$16 = awa.zA;
                  }

                  $$1.a(null, $$4, $$16, awb.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqv.d($$3);
      } else if (dab.j($$3) > 0 && !$$1.bf()) {
         return bqv.d($$3);
      } else {
         $$1.c($$2);
         return bqv.b($$3);
      }
   }

   @Override
   public boolean a(cup $$0, btp $$1, btp $$2) {
      $$0.a(1, $$2, btb.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnp a(dby $$0, js $$1, cup $$2, je $$3) {
      coc $$4 = new coc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnd.a.b;
      return $$4;
   }
}
