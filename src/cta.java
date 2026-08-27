public class cta extends cre {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cta(cre.a $$0) {
      super($$0);
   }

   public static ctz h() {
      return ctz.a().a(brv.c, new brt(e, "Tool modifier", 8.0, brt.a.a), bqd.b).a(brv.e, new brt(f, "Tool modifier", -2.9F, brt.a.a), bqd.b).a();
   }

   @Override
   public boolean a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      return !$$3.f();
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.f;
   }

   @Override
   public int b(crj $$0) {
      return 72000;
   }

   @Override
   public void a(crj $$0, cyx $$1, bqo $$2, int $$3) {
      if ($$2 instanceof cjt $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cwr.i($$0);
            if ($$6 <= 0 || $$4.bd()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bqo.d($$2.ft()));
                  if ($$6 == 0) {
                     cky $$7 = new cky($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fM()) {
                        $$7.d = cjz.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aum.zk, aun.h, 1.0F, 1.0F);
                     if (!$$4.fM()) {
                        $$4.fZ().g($$0);
                     }
                  }
               }

               $$4.b(auw.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -axk.a($$8 * (float) (Math.PI / 180.0)) * axk.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -axk.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = axk.b($$8 * (float) (Math.PI / 180.0)) * axk.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = axk.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bqt.a, new esa(0.0, 1.1999999F, 0.0));
                  }

                  aul $$16;
                  if ($$6 >= 3) {
                     $$16 = aum.zj;
                  } else if ($$6 == 2) {
                     $$16 = aum.zi;
                  } else {
                     $$16 = aum.zh;
                  }

                  $$1.a(null, $$4, $$16, aun.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      if ($$3.m() >= $$3.n() - 1) {
         return bob.d($$3);
      } else if (cwr.i($$3) > 0 && !$$1.bd()) {
         return bob.d($$3);
      } else {
         $$1.c($$2);
         return bob.b($$3);
      }
   }

   @Override
   public boolean a(crj $$0, bqo $$1, bqo $$2) {
      $$0.a(1, $$2, bqc.a);
      return true;
   }

   @Override
   public boolean a(crj $$0, cyx $$1, doz $$2, ib $$3, bqo $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bqc.a);
      }

      return true;
   }

   @Override
   public int g() {
      return 1;
   }
}
