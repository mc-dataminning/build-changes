public class ctv extends cry {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public ctv(cry.a $$0) {
      super($$0);
   }

   public static cuw h() {
      return cuw.a().a(bsl.c, new bsj(e, "Tool modifier", 8.0, bsj.a.a), bqt.b).a(bsl.e, new bsj(f, "Tool modifier", -2.9F, bsj.a.a), bqt.b).a();
   }

   @Override
   public boolean a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      return !$$3.f();
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.f;
   }

   @Override
   public int b(csd $$0) {
      return 72000;
   }

   @Override
   public void a(csd $$0, czu $$1, bre $$2, int $$3) {
      if ($$2 instanceof ckl $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cxo.j($$0);
            if ($$6 <= 0 || $$4.bd()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bre.d($$2.fu()));
                  if ($$6 == 0) {
                     clq $$7 = new clq($$1, $$4, $$0);
                     $$7.a($$4, $$4.dF(), $$4.dD(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fN()) {
                        $$7.d = ckr.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, auz.zr, ava.h, 1.0F, 1.0F);
                     if (!$$4.fN()) {
                        $$4.ga().g($$0);
                     }
                  }
               }

               $$4.b(avj.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dD();
                  float $$9 = $$4.dF();
                  float $$10 = -axw.a($$8 * (float) (Math.PI / 180.0)) * axw.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -axw.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = axw.b($$8 * (float) (Math.PI / 180.0)) * axw.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = axw.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(brj.a, new etf(0.0, 1.1999999F, 0.0));
                  }

                  auy $$16;
                  if ($$6 >= 3) {
                     $$16 = auz.zq;
                  } else if ($$6 == 2) {
                     $$16 = auz.zp;
                  } else {
                     $$16 = auz.zo;
                  }

                  $$1.a(null, $$4, $$16, ava.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      if ($$3.m() >= $$3.n() - 1) {
         return bor.d($$3);
      } else if (cxo.j($$3) > 0 && !$$1.bd()) {
         return bor.d($$3);
      } else {
         $$1.c($$2);
         return bor.b($$3);
      }
   }

   @Override
   public boolean a(csd $$0, bre $$1, bre $$2) {
      $$0.a(1, $$2, bqs.a);
      return true;
   }

   @Override
   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bqs.a);
      }

      return true;
   }

   @Override
   public int g() {
      return 1;
   }
}
