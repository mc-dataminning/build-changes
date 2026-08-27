import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cmt extends ckw implements cmv {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<blz, bmc> d;

   public cmt(ckw.a $$0) {
      super($$0);
      Builder<blz, bmc> $$1 = ImmutableMultimap.builder();
      $$1.put(bme.c, new bmc(m, "Tool modifier", 8.0, bmc.a.a));
      $$1.put(bme.e, new bmc(n, "Tool modifier", -2.9F, bmc.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      return !$$3.f();
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.f;
   }

   @Override
   public int b(clb $$0) {
      return 72000;
   }

   @Override
   public void a(clb $$0, crs $$1, bky $$2, int $$3) {
      if ($$2 instanceof cdm $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cpo.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     ceq $$7 = new ceq($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cds.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aqn.xX, aqo.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(aqx.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -ati.a($$8 * (float) (Math.PI / 180.0)) * ati.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ati.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ati.b($$8 * (float) (Math.PI / 180.0)) * ati.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ati.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(ble.a, new eji(0.0, 1.1999999F, 0.0));
                  }

                  aqm $$16;
                  if ($$6 >= 3) {
                     $$16 = aqn.xW;
                  } else if ($$6 == 2) {
                     $$16 = aqn.xV;
                  } else {
                     $$16 = aqn.xU;
                  }

                  $$1.a(null, $$4, $$16, aqo.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bir.d($$3);
      } else if (cpo.h($$3) > 0 && !$$1.aY()) {
         return bir.d($$3);
      } else {
         $$1.c($$2);
         return bir.b($$3);
      }
   }

   @Override
   public boolean a(clb $$0, bky $$1, bky $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bkn.a));
      return true;
   }

   @Override
   public boolean a(clb $$0, crs $$1, dgw $$2, ht $$3, bky $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bkn.a));
      }

      return true;
   }

   @Override
   public Multimap<blz, bmc> a(bkn $$0) {
      return $$0 == bkn.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
