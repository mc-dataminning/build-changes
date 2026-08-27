import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckz extends cjc implements clb {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bkj, bkm> d;

   public ckz(cjc.a $$0) {
      super($$0);
      Builder<bkj, bkm> $$1 = ImmutableMultimap.builder();
      $$1.put(bko.f, new bkm(m, "Tool modifier", 8.0, bkm.a.a));
      $$1.put(bko.h, new bkm(n, "Tool modifier", -2.9F, bkm.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
      return !$$3.f();
   }

   @Override
   public cla c(cjh $$0) {
      return cla.f;
   }

   @Override
   public int b(cjh $$0) {
      return 72000;
   }

   @Override
   public void a(cjh $$0, cpx $$1, bji $$2, int $$3) {
      if ($$2 instanceof cbw $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cns.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fn()));
                  if ($$6 == 0) {
                     cda $$7 = new cda($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fS().d) {
                        $$7.d = ccc.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, apf.xT, apg.h, 1.0F, 1.0F);
                     if (!$$4.fS().d) {
                        $$4.fR().g($$0);
                     }
                  }
               }

               $$4.b(app.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -ary.a($$8 * (float) (Math.PI / 180.0)) * ary.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ary.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ary.b($$8 * (float) (Math.PI / 180.0)) * ary.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ary.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bjo.a, new ehp(0.0, 1.1999999F, 0.0));
                  }

                  ape $$16;
                  if ($$6 >= 3) {
                     $$16 = apf.xS;
                  } else if ($$6 == 2) {
                     $$16 = apf.xR;
                  } else {
                     $$16 = apf.xQ;
                  }

                  $$1.a(null, $$4, $$16, apg.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bhb.d($$3);
      } else if (cns.h($$3) > 0 && !$$1.aY()) {
         return bhb.d($$3);
      } else {
         $$1.c($$2);
         return bhb.b($$3);
      }
   }

   @Override
   public boolean a(cjh $$0, bji $$1, bji $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bix.a));
      return true;
   }

   @Override
   public boolean a(cjh $$0, cpx $$1, dfl $$2, gw $$3, bji $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bix.a));
      }

      return true;
   }

   @Override
   public Multimap<bkj, bkm> a(bix $$0) {
      return $$0 == bix.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
