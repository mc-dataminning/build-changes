import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coz extends cnb implements cpb {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<ih<bnp>, bns> d;

   public coz(cnb.a $$0) {
      super($$0);
      Builder<ih<bnp>, bns> $$1 = ImmutableMultimap.builder();
      $$1.put(bnu.c, new bns(m, "Tool modifier", 8.0, bns.a.a));
      $$1.put(bnu.e, new bns(n, "Tool modifier", -2.9F, bns.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      return !$$3.f();
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.f;
   }

   @Override
   public int b(cng $$0) {
      return 72000;
   }

   @Override
   public void a(cng $$0, ctx $$1, bmo $$2, int $$3) {
      if ($$2 instanceof cfq $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = crt.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cgu $$7 = new cgu($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cfw.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, art.yY, aru.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(asd.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -aup.a($$8 * (float) (Math.PI / 180.0)) * aup.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aup.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aup.b($$8 * (float) (Math.PI / 180.0)) * aup.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aup.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bmu.a, new emc(0.0, 1.1999999F, 0.0));
                  }

                  ars $$16;
                  if ($$6 >= 3) {
                     $$16 = art.yX;
                  } else if ($$6 == 2) {
                     $$16 = art.yW;
                  } else {
                     $$16 = art.yV;
                  }

                  $$1.a(null, $$4, $$16, aru.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bkd.d($$3);
      } else if (crt.h($$3) > 0 && !$$1.ba()) {
         return bkd.d($$3);
      } else {
         $$1.c($$2);
         return bkd.b($$3);
      }
   }

   @Override
   public boolean a(cng $$0, bmo $$1, bmo $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bmd.a));
      return true;
   }

   @Override
   public boolean a(cng $$0, ctx $$1, djp $$2, hx $$3, bmo $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bmd.a));
      }

      return true;
   }

   @Override
   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      return $$0 == bmd.a ? this.d : super.a($$0);
   }

   @Override
   public int an_() {
      return 1;
   }
}
