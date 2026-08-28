import java.util.List;

public class dai extends cyo implements czm {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public dai(cyo.a $$0) {
      super($$0);
   }

   public static dbj b() {
      return dbj.a().a(byf.c, new byd(h, 8.0, byd.a.a), bwl.b).a(byf.e, new byd(i, -2.9F, byd.a.a), bwl.b).a();
   }

   public static dbv c() {
      return new dbv(List.of(), 1.0F, 2, false);
   }

   @Override
   public cyu b(cys $$0) {
      return cyu.f;
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      return 72000;
   }

   @Override
   public boolean a(cys $$0, dip $$1, bwz $$2, int $$3) {
      if ($$2 instanceof cqs $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dfh.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               je<awk> $$8 = dfh.b($$0, dfg.C).orElse(awl.AE);
               $$4.b(awv.c.b(this));
               if ($$1 instanceof aro $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     csa $$10 = crm.a(csa::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fU()) {
                        $$10.b = cqz.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awm.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -azk.a($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azk.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azk.b($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azk.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bxd.a, new fdw(0.0, 1.1999999F, 0.0));
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
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bty.d;
      } else if (dfh.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return bty.d;
      } else {
         $$1.c($$2);
         return bty.c;
      }
   }

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      csa $$4 = new csa($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cqz.a.b;
      return $$4;
   }
}
