import java.util.List;

public class czh extends cxk implements cyj {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public czh(cxk.a $$0) {
      super($$0);
   }

   public static daf c() {
      return daf.a().a(bxn.c, new bxl(g, 8.0, bxl.a.a), bvs.b).a(bxn.e, new bxl(h, -2.9F, bxl.a.a), bvs.b).a();
   }

   public static daq d() {
      return new daq(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
      return !$$3.b();
   }

   @Override
   public cxq b(cxo $$0) {
      return cxq.f;
   }

   @Override
   public int a(cxo $$0, bwf $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxo $$0, dhh $$1, bwf $$2, int $$3) {
      if ($$2 instanceof cpw $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dea.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<axe> $$8 = dea.b($$0, ddz.C).orElse(axf.Af);
               if ($$1 instanceof ash $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     crc $$10 = cqp.a(crc::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.c = cqd.a.c;
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
                     $$4.a(bwj.a, new fbx(0.0, 1.1999999F, 0.0));
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
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bti.d;
      } else if (dea.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bti.d;
      } else {
         $$1.c($$2);
         return bti.c;
      }
   }

   @Override
   public boolean a(cxo $$0, bwf $$1, bwf $$2) {
      return true;
   }

   @Override
   public void b(cxo $$0, bwf $$1, bwf $$2) {
      $$0.a(1, $$2, bvr.a);
   }

   @Override
   public cqp a(dhh $$0, ka $$1, cxo $$2, jm $$3) {
      crc $$4 = new crc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.c = cqd.a.b;
      return $$4;
   }
}
