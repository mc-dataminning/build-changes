import java.util.List;

public class cxi extends cvk implements cwk {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxi(cvk.a $$0) {
      super($$0);
   }

   public static cyk d() {
      return cyk.a().a(bvr.c, new bvp(f, 8.0, bvp.a.a), btx.b).a(bvr.e, new bvp(g, -2.9F, bvp.a.a), btx.b).a();
   }

   public static cyv g() {
      return new cyv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(duo $$0, deg $$1, je $$2, cnu $$3) {
      return !$$3.f();
   }

   @Override
   public cvr a(cvp $$0) {
      return cvr.f;
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      return 72000;
   }

   @Override
   public void a(cvp $$0, deg $$1, buk $$2, int $$3) {
      if ($$2 instanceof cnu $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 >= 10) {
            float $$7 = dbm.a($$0, $$4);
            if (!($$7 > 0.0F) || $$4.bj()) {
               if (!g($$0)) {
                  jn<awd> $$8 = dbm.b($$0, dbl.C).orElse(awe.zM);
                  if ($$1 instanceof arh $$9) {
                     $$0.a(1, $$4);
                     if ($$7 == 0.0F) {
                        cpb $$10 = coo.a(cpb::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                        if ($$4.fQ()) {
                           $$10.d = cob.a.c;
                        } else {
                           $$4.gc().h($$0);
                        }

                        $$1.a(null, $$10, $$8.a(), awf.h, 1.0F, 1.0F);
                     }
                  }

                  $$4.b(awo.c.b(this));
                  if ($$7 > 0.0F) {
                     float $$11 = $$4.dI();
                     float $$12 = $$4.dK();
                     float $$13 = -azd.a($$11 * (float) (Math.PI / 180.0)) * azd.b($$12 * (float) (Math.PI / 180.0));
                     float $$14 = -azd.a($$12 * (float) (Math.PI / 180.0));
                     float $$15 = azd.b($$11 * (float) (Math.PI / 180.0)) * azd.b($$12 * (float) (Math.PI / 180.0));
                     float $$16 = azd.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                     $$13 *= $$7 / $$16;
                     $$14 *= $$7 / $$16;
                     $$15 *= $$7 / $$16;
                     $$4.j((double)$$13, (double)$$14, (double)$$15);
                     $$4.a(20, 8.0F, $$0);
                     if ($$4.aH()) {
                        float $$17 = 1.1999999F;
                        $$4.a(buo.a, new eys(0.0, 1.1999999F, 0.0));
                     }

                     $$1.a(null, $$4, $$8.a(), awf.h, 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      if (g($$3)) {
         return brp.d;
      } else if (dbm.a($$3, $$1) > 0.0F && !$$1.bj()) {
         return brp.d;
      } else {
         $$1.c($$2);
         return brp.c;
      }
   }

   private static boolean g(cvp $$0) {
      return $$0.o() >= $$0.p() - 1;
   }

   @Override
   public boolean a(cvp $$0, buk $$1, buk $$2) {
      return true;
   }

   @Override
   public void b(cvp $$0, buk $$1, buk $$2) {
      $$0.a(1, $$2, btw.a);
   }

   @Override
   public coo a(deg $$0, jx $$1, cvp $$2, jj $$3) {
      cpb $$4 = new cpb($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cob.a.b;
      return $$4;
   }
}
