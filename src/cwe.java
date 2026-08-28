import java.util.List;

public class cwe extends cuf implements cvc {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwe(cuf.a $$0) {
      super($$0);
   }

   public static cxf h() {
      return cxf.a().a(bus.c, new buq(e, "Tool modifier", 8.0, buq.a.a), bsx.b).a(bus.e, new buq(f, "Tool modifier", -2.9F, buq.a.a), bsx.b).a();
   }

   public static cxp k() {
      return new cxp(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      return !$$3.f();
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.f;
   }

   @Override
   public int b(cuk $$0) {
      return 72000;
   }

   @Override
   public void a(cuk $$0, dbt $$1, btk $$2, int $$3) {
      if ($$2 instanceof cms $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = czw.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, btk.d($$2.fw()));
                  if ($$6 == 0) {
                     cnx $$7 = new cnx($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cmy.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avw.zD, avx.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(awg.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayu.a($$8 * (float) (Math.PI / 180.0)) * ayu.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayu.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayu.b($$8 * (float) (Math.PI / 180.0)) * ayu.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayu.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(btp.a, new evm(0.0, 1.1999999F, 0.0));
                  }

                  avv $$16;
                  if ($$6 >= 3) {
                     $$16 = avw.zC;
                  } else if ($$6 == 2) {
                     $$16 = avw.zB;
                  } else {
                     $$16 = avw.zA;
                  }

                  $$1.a(null, $$4, $$16, avx.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqq.d($$3);
      } else if (czw.j($$3) > 0 && !$$1.bf()) {
         return bqq.d($$3);
      } else {
         $$1.c($$2);
         return bqq.b($$3);
      }
   }

   @Override
   public boolean a(cuk $$0, btk $$1, btk $$2) {
      $$0.a(1, $$2, bsw.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      cnx $$4 = new cnx($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cmy.a.b;
      return $$4;
   }
}
