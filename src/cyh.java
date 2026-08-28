import java.util.List;

public class cyh extends cwk implements cxj {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyh(cwk.a $$0) {
      super($$0);
   }

   public static czf c() {
      return czf.a().a(bwo.c, new bwm(g, 8.0, bwm.a.a), but.b).a(bwo.e, new bwm(h, -2.9F, bwm.a.a), but.b).a();
   }

   public static czq d() {
      return new czq(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dww $$0, dgh $$1, ji $$2, cow $$3) {
      return !$$3.b();
   }

   @Override
   public cwq b(cwo $$0) {
      return cwq.f;
   }

   @Override
   public int a(cwo $$0, bvg $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwo $$0, dgh $$1, bvg $$2, int $$3) {
      if ($$2 instanceof cow $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dda.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jr<avz> $$8 = dda.b($$0, dcz.C).orElse(awa.Au);
               $$4.b(awk.c.b(this));
               if ($$1 instanceof ard $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqc $$10 = cpp.a(cqc::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = cpd.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awb.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
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
                     $$4.a(bvk.a, new faz(0.0, 1.1999999F, 0.0));
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
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsj.d;
      } else if (dda.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsj.d;
      } else {
         $$1.c($$2);
         return bsj.c;
      }
   }

   @Override
   public boolean a(cwo $$0, bvg $$1, bvg $$2) {
      return true;
   }

   @Override
   public void b(cwo $$0, bvg $$1, bvg $$2) {
      $$0.a(1, $$2, bus.a);
   }

   @Override
   public cpp a(dgh $$0, kb $$1, cwo $$2, jn $$3) {
      cqc $$4 = new cqc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpd.a.b;
      return $$4;
   }
}
