public class ctj extends crn {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public ctj(crn.a $$0) {
      super($$0);
   }

   public static cui h() {
      return cui.a().a(bsa.c, new bry(e, "Tool modifier", 8.0, bry.a.a), bqi.b).a(bsa.e, new bry(f, "Tool modifier", -2.9F, bry.a.a), bqi.b).a();
   }

   @Override
   public boolean a(dpi $$0, czg $$1, id $$2, cka $$3) {
      return !$$3.f();
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.f;
   }

   @Override
   public int b(crs $$0) {
      return 72000;
   }

   @Override
   public void a(crs $$0, czg $$1, bqt $$2, int $$3) {
      if ($$2 instanceof cka $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cxa.j($$0);
            if ($$6 <= 0 || $$4.bd()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bqt.d($$2.ft()));
                  if ($$6 == 0) {
                     clf $$7 = new clf($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fM()) {
                        $$7.d = ckg.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, auo.zk, aup.h, 1.0F, 1.0F);
                     if (!$$4.fM()) {
                        $$4.fZ().g($$0);
                     }
                  }
               }

               $$4.b(auz.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -axm.a($$8 * (float) (Math.PI / 180.0)) * axm.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -axm.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = axm.b($$8 * (float) (Math.PI / 180.0)) * axm.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = axm.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bqy.a, new esj(0.0, 1.1999999F, 0.0));
                  }

                  aun $$16;
                  if ($$6 >= 3) {
                     $$16 = auo.zj;
                  } else if ($$6 == 2) {
                     $$16 = auo.zi;
                  } else {
                     $$16 = auo.zh;
                  }

                  $$1.a(null, $$4, $$16, aup.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if ($$3.m() >= $$3.n() - 1) {
         return bog.d($$3);
      } else if (cxa.j($$3) > 0 && !$$1.bd()) {
         return bog.d($$3);
      } else {
         $$1.c($$2);
         return bog.b($$3);
      }
   }

   @Override
   public boolean a(crs $$0, bqt $$1, bqt $$2) {
      $$0.a(1, $$2, bqh.a);
      return true;
   }

   @Override
   public boolean a(crs $$0, czg $$1, dpi $$2, id $$3, bqt $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bqh.a);
      }

      return true;
   }

   @Override
   public int g() {
      return 1;
   }
}
