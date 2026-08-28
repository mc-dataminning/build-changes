import java.util.List;

public class dat extends cyz implements czx {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dat(cyz.a $$0) {
      super($$0);
   }

   public static dbu b() {
      return dbu.a().a(byk.c, new byi(h, 8.0, byi.a.a), bwq.b).a(byk.e, new byi(i, -2.9F, byi.a.a), bwq.b).a();
   }

   public static dcg c() {
      return new dcg(List.of(), 1.0F, 2, false);
   }

   @Override
   public czf b(czd $$0) {
      return czf.f;
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      return 72000;
   }

   @Override
   public boolean a(czd $$0, dja $$1, bxe $$2, int $$3) {
      if ($$2 instanceof crc $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dfs.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               je<awm> $$8 = dfs.b($$0, dfr.C).orElse(awn.AK);
               $$4.b(awx.c.b(this));
               if ($$1 instanceof arq $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     csl $$10 = crx.a(csl::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = crk.a.c;
                     } else {
                        $$4.gj().i($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awo.h, 1.0F, 1.0F);
                     return true;
                  }
               }

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
                  $$4.i((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bxi.a, new feq(0.0, 1.1999999F, 0.0));
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
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bud.d;
      } else if (dfs.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return bud.d;
      } else {
         $$1.c($$2);
         return bud.c;
      }
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      csl $$4 = new csl($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = crk.a.b;
      return $$4;
   }
}
