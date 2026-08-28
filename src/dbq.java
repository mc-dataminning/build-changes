import java.util.List;

public class dbq extends czw implements dau {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dbq(czw.a $$0) {
      super($$0);
   }

   public static dcr b() {
      return dcr.a().a(bzc.c, new bza(h, 8.0, bza.a.a), bxg.b).a(bzc.e, new bza(i, -2.9F, bza.a.a), bxg.b).a();
   }

   public static ddd c() {
      return new ddd(List.of(), 1.0F, 2, false);
   }

   @Override
   public dac b(daa $$0) {
      return dac.f;
   }

   @Override
   public int a(daa $$0, bxw $$1) {
      return 72000;
   }

   @Override
   public boolean a(daa $$0, djz $$1, bxw $$2, int $$3) {
      if ($$2 instanceof crz $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dgp.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jg<awq> $$8 = dgp.b($$0, dgo.C).orElse(awr.AK);
               $$4.b(axb.c.b(this));
               if ($$1 instanceof aru $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cti $$10 = csu.a(cti::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = csh.a.c;
                     } else {
                        $$4.gj().i($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), aws.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -azq.a($$11 * (float) (Math.PI / 180.0)) * azq.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azq.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azq.b($$11 * (float) (Math.PI / 180.0)) * azq.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azq.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.i((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aH()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bya.a, new ffs(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), aws.h, 1.0F, 1.0F);
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
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      if ($$3.r()) {
         return but.d;
      } else if (dgp.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return but.d;
      } else {
         $$1.c($$2);
         return but.c;
      }
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      cti $$4 = new cti($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = csh.a.b;
      return $$4;
   }
}
