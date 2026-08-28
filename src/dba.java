import java.util.List;

public class dba extends czg implements dae {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dba(czg.a $$0) {
      super($$0);
   }

   public static dcb b() {
      return dcb.a().a(byp.c, new byn(h, 8.0, byn.a.a), bwt.b).a(byp.e, new byn(i, -2.9F, byn.a.a), bwt.b).a();
   }

   public static dcn c() {
      return new dcn(List.of(), 1.0F, 2, false);
   }

   @Override
   public czm b(czk $$0) {
      return czm.f;
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      return 72000;
   }

   @Override
   public boolean a(czk $$0, djh $$1, bxj $$2, int $$3) {
      if ($$2 instanceof crj $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dfz.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bj()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jf<awm> $$8 = dfz.b($$0, dfy.C).orElse(awn.AK);
               $$4.b(awx.c.b(this));
               if ($$1 instanceof arq $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     css $$10 = cse.a(css::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fU()) {
                        $$10.b = crr.a.c;
                     } else {
                        $$4.gi().i($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awo.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dK();
                  float $$12 = $$4.dM();
                  float $$13 = -azm.a($$11 * (float) (Math.PI / 180.0)) * azm.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azm.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azm.b($$11 * (float) (Math.PI / 180.0)) * azm.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azm.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.i((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aH()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bxn.a, new fex(0.0, 1.1999999F, 0.0));
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
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bug.d;
      } else if (dfz.a($$3, $$1) > 0.0F && !$$1.bj()) {
         return bug.d;
      } else {
         $$1.c($$2);
         return bug.c;
      }
   }

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      css $$4 = new css($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = crr.a.b;
      return $$4;
   }
}
