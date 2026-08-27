import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cks extends civ implements cku {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bkc, bkf> d;

   public cks(civ.a $$0) {
      super($$0);
      Builder<bkc, bkf> $$1 = ImmutableMultimap.builder();
      $$1.put(bkh.f, new bkf(m, "Tool modifier", 8.0, bkf.a.a));
      $$1.put(bkh.h, new bkf(n, "Tool modifier", -2.9F, bkf.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      return !$$3.f();
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.f;
   }

   @Override
   public int b(cja $$0) {
      return 72000;
   }

   @Override
   public void a(cja $$0, cpq $$1, bjb $$2, int $$3) {
      if ($$2 instanceof cbp $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cnl.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fm()));
                  if ($$6 == 0) {
                     cct $$7 = new cct($$1, $$4, $$0);
                     $$7.a($$4, $$4.dC(), $$4.dA(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fR().d) {
                        $$7.d = cbv.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aoz.xT, apa.h, 1.0F, 1.0F);
                     if (!$$4.fR().d) {
                        $$4.fQ().g($$0);
                     }
                  }
               }

               $$4.b(apj.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dA();
                  float $$9 = $$4.dC();
                  float $$10 = -ars.a($$8 * (float) (Math.PI / 180.0)) * ars.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ars.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ars.b($$8 * (float) (Math.PI / 180.0)) * ars.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ars.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bjh.a, new ehi(0.0, 1.1999999F, 0.0));
                  }

                  aoy $$16;
                  if ($$6 >= 3) {
                     $$16 = aoz.xS;
                  } else if ($$6 == 2) {
                     $$16 = aoz.xR;
                  } else {
                     $$16 = aoz.xQ;
                  }

                  $$1.a(null, $$4, $$16, apa.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bgu.d($$3);
      } else if (cnl.h($$3) > 0 && !$$1.aY()) {
         return bgu.d($$3);
      } else {
         $$1.c($$2);
         return bgu.b($$3);
      }
   }

   @Override
   public boolean a(cja $$0, bjb $$1, bjb $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(biq.a));
      return true;
   }

   @Override
   public boolean a(cja $$0, cpq $$1, dfe $$2, gw $$3, bjb $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(biq.a));
      }

      return true;
   }

   @Override
   public Multimap<bkc, bkf> a(biq $$0) {
      return $$0 == biq.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
