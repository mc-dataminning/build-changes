import java.util.List;

public class cwk extends cul implements cvi {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwk(cul.a $$0) {
      super($$0);
   }

   public static cxl h() {
      return cxl.a().a(buy.c, new buw(e, "Tool modifier", 8.0, buw.a.a), btd.b).a(buy.e, new buw(f, "Tool modifier", -2.9F, buw.a.a), btd.b).a();
   }

   public static cxv k() {
      return new cxv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      return !$$3.f();
   }

   @Override
   public cwl c(cuq $$0) {
      return cwl.f;
   }

   @Override
   public int b(cuq $$0) {
      return 72000;
   }

   @Override
   public void a(cuq $$0, dbz $$1, btq $$2, int $$3) {
      if ($$2 instanceof cmy $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = dac.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, btq.d($$2.fw()));
                  if ($$6 == 0) {
                     cod $$7 = new cod($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cne.a.c;
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
                     $$4.a(btv.a, new evs(0.0, 1.1999999F, 0.0));
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
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqw.d($$3);
      } else if (dac.j($$3) > 0 && !$$1.bf()) {
         return bqw.d($$3);
      } else {
         $$1.c($$2);
         return bqw.b($$3);
      }
   }

   @Override
   public boolean a(cuq $$0, btq $$1, btq $$2) {
      $$0.a(1, $$2, btc.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnq a(dbz $$0, js $$1, cuq $$2, je $$3) {
      cod $$4 = new cod($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cne.a.b;
      return $$4;
   }
}
