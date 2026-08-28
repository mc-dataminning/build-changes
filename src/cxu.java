import java.util.List;

public class cxu extends cvx implements cww {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxu(cvx.a $$0) {
      super($$0);
   }

   public static cys c() {
      return cys.a().a(bwi.c, new bwg(f, 8.0, bwg.a.a), bun.b).a(bwi.e, new bwg(g, -2.9F, bwg.a.a), bun.b).a();
   }

   public static czd d() {
      return new czd(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvj $$0, dfb $$1, jh $$2, com $$3) {
      return !$$3.f();
   }

   @Override
   public cwd b(cwb $$0) {
      return cwd.f;
   }

   @Override
   public int a(cwb $$0, bva $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwb $$0, dfb $$1, bva $$2, int $$3) {
      if ($$2 instanceof com $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dbu.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<awk> $$8 = dbu.b($$0, dbt.C).orElse(awl.zK);
               if ($$1 instanceof arn $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cpt $$10 = cpg.a(cpt::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fX()) {
                        $$10.d = cou.a.c;
                     } else {
                        $$4.gk().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awm.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(awv.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dN();
                  float $$12 = $$4.dP();
                  float $$13 = -azk.a($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azk.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azk.b($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azk.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aK()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bve.a, new ezn(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awm.h, 1.0F, 1.0F);
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
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsd.d;
      } else if (dbu.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return bsd.d;
      } else {
         $$1.c($$2);
         return bsd.c;
      }
   }

   @Override
   public boolean a(cwb $$0, bva $$1, bva $$2) {
      return true;
   }

   @Override
   public void b(cwb $$0, bva $$1, bva $$2) {
      $$0.a(1, $$2, bum.a);
   }

   @Override
   public cpg a(dfb $$0, ka $$1, cwb $$2, jm $$3) {
      cpt $$4 = new cpt($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cou.a.b;
      return $$4;
   }
}
