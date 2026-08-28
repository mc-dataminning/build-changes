import java.util.List;

public class cyg extends cwj implements cxi {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyg(cwj.a $$0) {
      super($$0);
   }

   public static cze c() {
      return cze.a().a(bwn.c, new bwl(g, 8.0, bwl.a.a), bus.b).a(bwn.e, new bwl(h, -2.9F, bwl.a.a), bus.b).a();
   }

   public static czp d() {
      return new czp(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      return !$$3.b();
   }

   @Override
   public cwp b(cwn $$0) {
      return cwp.f;
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwn $$0, dgg $$1, bvf $$2, int $$3) {
      if ($$2 instanceof cov $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dcz.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jr<avy> $$8 = dcz.b($$0, dcy.C).orElse(avz.Au);
               $$4.b(awj.c.b(this));
               if ($$1 instanceof arc $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqb $$10 = cpo.a(cqb::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = cpc.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awa.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dM();
                  float $$12 = $$4.dO();
                  float $$13 = -ayy.a($$11 * (float) (Math.PI / 180.0)) * ayy.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -ayy.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = ayy.b($$11 * (float) (Math.PI / 180.0)) * ayy.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = ayy.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bvj.a, new fay(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awa.h, 1.0F, 1.0F);
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
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsi.d;
      } else if (dcz.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsi.d;
      } else {
         $$1.c($$2);
         return bsi.c;
      }
   }

   @Override
   public boolean a(cwn $$0, bvf $$1, bvf $$2) {
      return true;
   }

   @Override
   public void b(cwn $$0, bvf $$1, bvf $$2) {
      $$0.a(1, $$2, bur.a);
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      cqb $$4 = new cqb($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpc.a.b;
      return $$4;
   }
}
