import java.util.List;

public class cyz extends cxc implements cyb {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyz(cxc.a $$0) {
      super($$0);
   }

   public static czx c() {
      return czx.a().a(bxf.c, new bxd(g, 8.0, bxd.a.a), bvk.b).a(bxf.e, new bxd(h, -2.9F, bxd.a.a), bvk.b).a();
   }

   public static dai d() {
      return new dai(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      return !$$3.b();
   }

   @Override
   public cxi b(cxg $$0) {
      return cxi.f;
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxg $$0, dgz $$1, bvx $$2, int $$3) {
      if ($$2 instanceof cpo $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dds.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<awu> $$8 = dds.b($$0, ddr.C).orElse(awv.Av);
               if ($$1 instanceof arx $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqu $$10 = cqh.a(cqu::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = cpv.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), aww.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(axf.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dM();
                  float $$12 = $$4.dO();
                  float $$13 = -azu.a($$11 * (float) (Math.PI / 180.0)) * azu.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azu.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azu.b($$11 * (float) (Math.PI / 180.0)) * azu.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azu.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bwb.a, new fbr(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), aww.h, 1.0F, 1.0F);
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
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bta.d;
      } else if (dds.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bta.d;
      } else {
         $$1.c($$2);
         return bta.c;
      }
   }

   @Override
   public boolean a(cxg $$0, bvx $$1, bvx $$2) {
      return true;
   }

   @Override
   public void b(cxg $$0, bvx $$1, bvx $$2) {
      $$0.a(1, $$2, bvj.a);
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      cqu $$4 = new cqu($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpv.a.b;
      return $$4;
   }
}
