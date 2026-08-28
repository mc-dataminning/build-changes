import java.util.List;

public class czd extends cxg implements cyf {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public czd(cxg.a $$0) {
      super($$0);
   }

   public static dab c() {
      return dab.a().a(bxj.c, new bxh(f, 8.0, bxh.a.a), bvo.b).a(bxj.e, new bxh(g, -2.9F, bxh.a.a), bvo.b).a();
   }

   public static dam d() {
      return new dam(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxn $$0, dha $$1, jh $$2, cps $$3) {
      return !$$3.b();
   }

   @Override
   public cxm b(cxk $$0) {
      return cxm.f;
   }

   @Override
   public int a(cxk $$0, bwb $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxk $$0, dha $$1, bwb $$2, int $$3) {
      if ($$2 instanceof cps $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = ddt.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<axe> $$8 = ddt.b($$0, dds.C).orElse(axf.Ae);
               if ($$1 instanceof ash $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqy $$10 = cql.a(cqy::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fT()) {
                        $$10.c = cpz.a.c;
                     } else {
                        $$4.gg().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), axg.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(axp.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -bae.a($$11 * (float) (Math.PI / 180.0)) * bae.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -bae.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = bae.b($$11 * (float) (Math.PI / 180.0)) * bae.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = bae.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bwf.a, new fbs(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), axg.h, 1.0F, 1.0F);
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bte.d;
      } else if (ddt.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bte.d;
      } else {
         $$1.c($$2);
         return bte.c;
      }
   }

   @Override
   public boolean a(cxk $$0, bwb $$1, bwb $$2) {
      return true;
   }

   @Override
   public void b(cxk $$0, bwb $$1, bwb $$2) {
      $$0.a(1, $$2, bvn.a);
   }

   @Override
   public cql a(dha $$0, ka $$1, cxk $$2, jm $$3) {
      cqy $$4 = new cqy($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.c = cpz.a.b;
      return $$4;
   }
}
