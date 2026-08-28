import java.util.List;

public class dbo extends czu implements das {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dbo(czu.a $$0) {
      super($$0);
   }

   public static dcp b() {
      return dcp.a().a(bza.c, new byy(h, 8.0, byy.a.a), bxe.b).a(bza.e, new byy(i, -2.9F, byy.a.a), bxe.b).a();
   }

   public static ddb c() {
      return new ddb(List.of(), 1.0F, 2, false);
   }

   @Override
   public daa b(czy $$0) {
      return daa.f;
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      return 72000;
   }

   @Override
   public boolean a(czy $$0, djx $$1, bxu $$2, int $$3) {
      if ($$2 instanceof crx $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dgn.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jf<awo> $$8 = dgn.b($$0, dgm.C).orElse(awp.AK);
               $$4.b(awz.c.b(this));
               if ($$1 instanceof ars $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     ctg $$10 = css.a(ctg::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = csf.a.c;
                     } else {
                        $$4.gj().i($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awq.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -azo.a($$11 * (float) (Math.PI / 180.0)) * azo.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azo.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azo.b($$11 * (float) (Math.PI / 180.0)) * azo.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azo.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.i((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aH()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bxy.a, new ffq(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awq.h, 1.0F, 1.0F);
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
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bur.d;
      } else if (dgn.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bur.d;
      } else {
         $$1.c($$2);
         return bur.c;
      }
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      ctg $$4 = new ctg($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = csf.a.b;
      return $$4;
   }
}
