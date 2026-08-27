import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckx extends cja implements ckz {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bkh, bkk> d;

   public ckx(cja.a $$0) {
      super($$0);
      Builder<bkh, bkk> $$1 = ImmutableMultimap.builder();
      $$1.put(bkm.f, new bkk(m, "Tool modifier", 8.0, bkk.a.a));
      $$1.put(bkm.h, new bkk(n, "Tool modifier", -2.9F, bkk.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
      return !$$3.f();
   }

   @Override
   public cky c(cjf $$0) {
      return cky.f;
   }

   @Override
   public int b(cjf $$0) {
      return 72000;
   }

   @Override
   public void a(cjf $$0, cpv $$1, bjg $$2, int $$3) {
      if ($$2 instanceof cbu $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cnq.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fn()));
                  if ($$6 == 0) {
                     ccy $$7 = new ccy($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fS().d) {
                        $$7.d = cca.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, ape.xT, apf.h, 1.0F, 1.0F);
                     if (!$$4.fS().d) {
                        $$4.fR().g($$0);
                     }
                  }
               }

               $$4.b(apo.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -arx.a($$8 * (float) (Math.PI / 180.0)) * arx.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -arx.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = arx.b($$8 * (float) (Math.PI / 180.0)) * arx.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = arx.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bjm.a, new ehn(0.0, 1.1999999F, 0.0));
                  }

                  apd $$16;
                  if ($$6 >= 3) {
                     $$16 = ape.xS;
                  } else if ($$6 == 2) {
                     $$16 = ape.xR;
                  } else {
                     $$16 = ape.xQ;
                  }

                  $$1.a(null, $$4, $$16, apf.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bgz.d($$3);
      } else if (cnq.h($$3) > 0 && !$$1.aY()) {
         return bgz.d($$3);
      } else {
         $$1.c($$2);
         return bgz.b($$3);
      }
   }

   @Override
   public boolean a(cjf $$0, bjg $$1, bjg $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(biv.a));
      return true;
   }

   @Override
   public boolean a(cjf $$0, cpv $$1, dfj $$2, gw $$3, bjg $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(biv.a));
      }

      return true;
   }

   @Override
   public Multimap<bkh, bkk> a(biv $$0) {
      return $$0 == biv.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
