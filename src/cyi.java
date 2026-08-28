import java.util.List;

public class cyi extends cwl implements cxk {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyi(cwl.a $$0) {
      super($$0);
   }

   public static czg c() {
      return czg.a().a(bwo.c, new bwm(g, 8.0, bwm.a.a), but.b).a(bwo.e, new bwm(h, -2.9F, bwm.a.a), but.b).a();
   }

   public static czr d() {
      return new czr(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      return !$$3.b();
   }

   @Override
   public cwr b(cwp $$0) {
      return cwr.f;
   }

   @Override
   public int a(cwp $$0, bvg $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwp $$0, dgi $$1, bvg $$2, int $$3) {
      if ($$2 instanceof cox $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = ddb.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jr<avz> $$8 = ddb.b($$0, dda.C).orElse(awa.Av);
               $$4.b(awk.c.b(this));
               if ($$1 instanceof arc $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqd $$10 = cpq.a(cqd::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = cpe.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awb.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dM();
                  float $$12 = $$4.dO();
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
                     $$4.a(bvk.a, new fba(0.0, 1.1999999F, 0.0));
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
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsj.d;
      } else if (ddb.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsj.d;
      } else {
         $$1.c($$2);
         return bsj.c;
      }
   }

   @Override
   public boolean a(cwp $$0, bvg $$1, bvg $$2) {
      return true;
   }

   @Override
   public void b(cwp $$0, bvg $$1, bvg $$2) {
      $$0.a(1, $$2, bus.a);
   }

   @Override
   public cpq a(dgi $$0, kb $$1, cwp $$2, jn $$3) {
      cqd $$4 = new cqd($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpe.a.b;
      return $$4;
   }
}
