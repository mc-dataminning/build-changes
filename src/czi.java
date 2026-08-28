import java.util.List;

public class czi extends cxl implements cyk {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public czi(cxl.a $$0) {
      super($$0);
   }

   public static dag c() {
      return dag.a().a(bxo.c, new bxm(g, 8.0, bxm.a.a), bvt.b).a(bxo.e, new bxm(h, -2.9F, bxm.a.a), bvt.b).a();
   }

   public static dar d() {
      return new dar(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      return !$$3.b();
   }

   @Override
   public cxr b(cxp $$0) {
      return cxr.f;
   }

   @Override
   public int a(cxp $$0, bwg $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxp $$0, dhi $$1, bwg $$2, int $$3) {
      if ($$2 instanceof cpx $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = deb.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<axe> $$8 = deb.b($$0, dea.C).orElse(axf.Af);
               if ($$1 instanceof ash $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     crd $$10 = cqq.a(crd::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.c = cqe.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), axg.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(axp.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dM();
                  float $$12 = $$4.dO();
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
                     $$4.a(bwk.a, new fby(0.0, 1.1999999F, 0.0));
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
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      if ($$3.r()) {
         return btj.d;
      } else if (deb.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return btj.d;
      } else {
         $$1.c($$2);
         return btj.c;
      }
   }

   @Override
   public boolean a(cxp $$0, bwg $$1, bwg $$2) {
      return true;
   }

   @Override
   public void b(cxp $$0, bwg $$1, bwg $$2) {
      $$0.a(1, $$2, bvs.a);
   }

   @Override
   public cqq a(dhi $$0, ka $$1, cxp $$2, jm $$3) {
      crd $$4 = new crd($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.c = cqe.a.b;
      return $$4;
   }
}
