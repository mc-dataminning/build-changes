import java.util.List;

public class cwj extends cuc {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwj(cuc.a $$0) {
      super($$0);
   }

   public static cxl d() {
      return cxl.a().a(btv.c, new btt(e, "Tool modifier", 8.0, btt.a.a), bsd.b).a(btv.e, new btt(f, "Tool modifier", -2.9F, btt.a.a), bsd.b).a();
   }

   public static cxw h() {
      return new cxw(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.f;
   }

   @Override
   public int b(cuh $$0) {
      return 72000;
   }

   @Override
   public void a(cuh $$0, dca $$1, bso $$2, int $$3) {
      if ($$2 instanceof cly $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = dae.j($$0);
            if ($$6 <= 0 || $$4.bj()) {
               if (!$$1.C) {
                  $$0.a(1, $$4, bso.d($$2.fF()));
                  if ($$6 == 0) {
                     cnf $$7 = new cnf($$1, $$4, $$0);
                     $$7.a($$4, $$4.dM(), $$4.dK(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fY()) {
                        $$7.d = cme.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avo.Ab, avq.h, 1.0F, 1.0F);
                     if (!$$4.fY()) {
                        $$4.gl().h($$0);
                     }
                  }
               }

               $$4.b(avz.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dK();
                  float $$9 = $$4.dM();
                  float $$10 = -aym.a($$8 * (float) (Math.PI / 180.0)) * aym.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aym.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aym.b($$8 * (float) (Math.PI / 180.0)) * aym.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aym.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.v(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bst.a, new ewu(0.0, 1.1999999F, 0.0));
                  }

                  avn $$16;
                  if ($$6 >= 3) {
                     $$16 = avo.Aa;
                  } else if ($$6 == 2) {
                     $$16 = avo.zZ;
                  } else {
                     $$16 = avo.zY;
                  }

                  $$1.a(null, $$4, $$16, avq.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if ($$3.m() >= $$3.n() - 1) {
         return bqb.d($$3);
      } else if (dae.j($$3) > 0 && !$$1.bj()) {
         return bqb.d($$3);
      } else {
         $$1.c($$2);
         return bqb.b($$3);
      }
   }

   @Override
   public boolean a(cuh $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsc.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }
}
