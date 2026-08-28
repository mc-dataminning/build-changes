import java.util.List;

public class cwl extends cum implements cvj {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwl(cum.a $$0) {
      super($$0);
   }

   public static cxm h() {
      return cxm.a().a(buz.c, new bux(e, "Tool modifier", 8.0, bux.a.a), bte.b).a(buz.e, new bux(f, "Tool modifier", -2.9F, bux.a.a), bte.b).a();
   }

   public static cxw k() {
      return new cxw(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      return !$$3.f();
   }

   @Override
   public cwm c(cur $$0) {
      return cwm.f;
   }

   @Override
   public int b(cur $$0) {
      return 72000;
   }

   @Override
   public void a(cur $$0, dca $$1, btr $$2, int $$3) {
      if ($$2 instanceof cmz $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = dad.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, btr.d($$2.fw()));
                  if ($$6 == 0) {
                     coe $$7 = new coe($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cnf.a.c;
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
                     $$4.a(btw.a, new evt(0.0, 1.1999999F, 0.0));
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
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqx.d($$3);
      } else if (dad.j($$3) > 0 && !$$1.bf()) {
         return bqx.d($$3);
      } else {
         $$1.c($$2);
         return bqx.b($$3);
      }
   }

   @Override
   public boolean a(cur $$0, btr $$1, btr $$2) {
      $$0.a(1, $$2, btd.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnr a(dca $$0, js $$1, cur $$2, je $$3) {
      coe $$4 = new coe($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnf.a.b;
      return $$4;
   }
}
