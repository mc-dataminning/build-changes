import java.util.List;

public class cxy extends cwb implements cxa {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxy(cwb.a $$0) {
      super($$0);
   }

   public static cyw c() {
      return cyw.a().a(bwm.c, new bwk(f, 8.0, bwk.a.a), bur.b).a(bwm.e, new bwk(g, -2.9F, bwk.a.a), bur.b).a();
   }

   public static czh d() {
      return new czh(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvo $$0, dff $$1, jh $$2, cor $$3) {
      return !$$3.f();
   }

   @Override
   public cwh b(cwf $$0) {
      return cwh.f;
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwf $$0, dff $$1, bve $$2, int $$3) {
      if ($$2 instanceof cor $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dby.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bm()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jq<awn> $$8 = dby.b($$0, dbx.C).orElse(awo.zK);
               if ($$1 instanceof arq $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cpx $$10 = cpk.a(cpx::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fY()) {
                        $$10.d = coy.a.c;
                     } else {
                        $$4.gl().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awp.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(awy.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dO();
                  float $$12 = $$4.dQ();
                  float $$13 = -azn.a($$11 * (float) (Math.PI / 180.0)) * azn.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azn.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azn.b($$11 * (float) (Math.PI / 180.0)) * azn.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azn.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aL()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bvi.a, new ezr(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awp.h, 1.0F, 1.0F);
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
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsh.d;
      } else if (dby.a($$3, $$1) > 0.0F && !$$1.bm()) {
         return bsh.d;
      } else {
         $$1.c($$2);
         return bsh.c;
      }
   }

   @Override
   public boolean a(cwf $$0, bve $$1, bve $$2) {
      return true;
   }

   @Override
   public void b(cwf $$0, bve $$1, bve $$2) {
      $$0.a(1, $$2, buq.a);
   }

   @Override
   public cpk a(dff $$0, ka $$1, cwf $$2, jm $$3) {
      cpx $$4 = new cpx($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = coy.a.b;
      return $$4;
   }
}
