import java.util.List;

public class cyy extends cxd implements cyb {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyy(cxd.a $$0) {
      super($$0);
   }

   public static czw c() {
      return czw.a().a(bxg.c, new bxe(h, 8.0, bxe.a.a), bvk.b).a(bxg.e, new bxe(i, -2.9F, bxe.a.a), bvk.b).a();
   }

   public static dah d() {
      return new dah(List.of(), 1.0F, 2, false);
   }

   @Override
   public cxj b(cxh $$0) {
      return cxj.f;
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxh $$0, dgz $$1, bvy $$2, int $$3) {
      if ($$2 instanceof cpr $$4) {
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
               jr<avz> $$8 = ddt.b($$0, dds.C).orElse(awa.AE);
               $$4.b(awk.c.b(this));
               if ($$1 instanceof ard $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqx $$10 = cqk.a(cqx::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fX()) {
                        $$10.b = cpy.a.c;
                     } else {
                        $$4.gl().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awb.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dK();
                  float $$12 = $$4.dM();
                  float $$13 = -ayz.a($$11 * (float) (Math.PI / 180.0)) * ayz.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -ayz.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = ayz.b($$11 * (float) (Math.PI / 180.0)) * ayz.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = ayz.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bwc.a, new fbx(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awb.h, 1.0F, 1.0F);
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
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsy.d;
      } else if (ddt.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsy.d;
      } else {
         $$1.c($$2);
         return bsy.c;
      }
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      cqx $$4 = new cqx($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpy.a.b;
      return $$4;
   }
}
