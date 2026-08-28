import java.util.List;

public class cyf extends cwi implements cxh {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyf(cwi.a $$0) {
      super($$0);
   }

   public static czd c() {
      return czd.a().a(bwp.c, new bwn(f, 8.0, bwn.a.a), buu.b).a(bwp.e, new bwn(g, -2.9F, bwn.a.a), buu.b).a();
   }

   public static czo d() {
      return new czo(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvv $$0, dfm $$1, jh $$2, cou $$3) {
      return !$$3.b();
   }

   @Override
   public cwo b(cwm $$0) {
      return cwo.f;
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwm $$0, dfm $$1, bvh $$2, int $$3) {
      if ($$2 instanceof cou $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dcf.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<awm> $$8 = dcf.b($$0, dce.C).orElse(awn.zK);
               if ($$1 instanceof arp $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqa $$10 = cpn.a(cqa::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fT()) {
                        $$10.c = cpb.a.c;
                     } else {
                        $$4.gg().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awo.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(awx.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -azm.a($$11 * (float) (Math.PI / 180.0)) * azm.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azm.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azm.b($$11 * (float) (Math.PI / 180.0)) * azm.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azm.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bvl.a, new ezy(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awo.h, 1.0F, 1.0F);
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
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsk.d;
      } else if (dcf.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsk.d;
      } else {
         $$1.c($$2);
         return bsk.c;
      }
   }

   @Override
   public boolean a(cwm $$0, bvh $$1, bvh $$2) {
      return true;
   }

   @Override
   public void b(cwm $$0, bvh $$1, bvh $$2) {
      $$0.a(1, $$2, but.a);
   }

   @Override
   public cpn a(dfm $$0, ka $$1, cwm $$2, jm $$3) {
      cqa $$4 = new cqa($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.c = cpb.a.b;
      return $$4;
   }
}
