import java.util.List;

public class dca extends dag implements dbe {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dca(dag.a $$0) {
      super($$0);
   }

   public static ddb b() {
      return ddb.a().a(bzl.c, new bzj(h, 8.0, bzj.a.a), bxp.b).a(bzl.e, new bzj(i, -2.9F, bzj.a.a), bxp.b).a();
   }

   public static ddn c() {
      return new ddn(List.of(), 1.0F, 2, false);
   }

   @Override
   public dam b(dak $$0) {
      return dam.f;
   }

   @Override
   public int a(dak $$0, byf $$1) {
      return 72000;
   }

   @Override
   public boolean a(dak $$0, dkj $$1, byf $$2, int $$3) {
      if ($$2 instanceof csi $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dgz.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jg<awx> $$8 = dgz.b($$0, dgy.C).orElse(awy.AK);
               $$4.b(axi.c.b(this));
               if ($$1 instanceof asb $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     dak $$10 = $$0.b(1, $$4);
                     ctr $$11 = ctd.a(ctr::new, $$9, $$10, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$11.b = csq.a.c;
                     }

                     $$1.a(null, $$11, $$8.a(), awz.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$12 = $$4.dL();
                  float $$13 = $$4.dN();
                  float $$14 = -azz.a($$12 * (float) (Math.PI / 180.0)) * azz.b($$13 * (float) (Math.PI / 180.0));
                  float $$15 = -azz.a($$13 * (float) (Math.PI / 180.0));
                  float $$16 = azz.b($$12 * (float) (Math.PI / 180.0)) * azz.b($$13 * (float) (Math.PI / 180.0));
                  float $$17 = azz.c($$14 * $$14 + $$15 * $$15 + $$16 * $$16);
                  $$14 *= $$7 / $$17;
                  $$15 *= $$7 / $$17;
                  $$16 *= $$7 / $$17;
                  $$4.i((double)$$14, (double)$$15, (double)$$16);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aH()) {
                     float $$18 = 1.1999999F;
                     $$4.a(byj.a, new fgc(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awz.h, 1.0F, 1.0F);
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
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bvc.d;
      } else if (dgz.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bvc.d;
      } else {
         $$1.c($$2);
         return bvc.c;
      }
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      ctr $$4 = new ctr($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = csq.a.b;
      return $$4;
   }
}
