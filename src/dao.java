import java.util.List;

public class dao extends cyu implements czs {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dao(cyu.a $$0) {
      super($$0);
   }

   public static dbp b() {
      return dbp.a().a(byi.c, new byg(h, 8.0, byg.a.a), bwo.b).a(byi.e, new byg(i, -2.9F, byg.a.a), bwo.b).a();
   }

   public static dcb c() {
      return new dcb(List.of(), 1.0F, 2, false);
   }

   @Override
   public cza b(cyy $$0) {
      return cza.f;
   }

   @Override
   public int a(cyy $$0, bxc $$1) {
      return 72000;
   }

   @Override
   public boolean a(cyy $$0, div $$1, bxc $$2, int $$3) {
      if ($$2 instanceof cqy $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dfn.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               je<awm> $$8 = dfn.b($$0, dfm.C).orElse(awn.AH);
               $$4.b(awx.c.b(this));
               if ($$1 instanceof arq $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     csg $$10 = crs.a(csg::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fU()) {
                        $$10.b = crf.a.c;
                     } else {
                        $$4.gi().h($$0);
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
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bxg.a, new fei(0.0, 1.1999999F, 0.0));
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
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bub.d;
      } else if (dfn.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return bub.d;
      } else {
         $$1.c($$2);
         return bub.c;
      }
   }

   @Override
   public crs a(div $$0, jo $$1, cyy $$2, ja $$3) {
      csg $$4 = new csg($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = crf.a.b;
      return $$4;
   }
}
