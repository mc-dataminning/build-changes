import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckp extends cis implements ckr {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bjz, bkc> d;

   public ckp(cis.a $$0) {
      super($$0);
      Builder<bjz, bkc> $$1 = ImmutableMultimap.builder();
      $$1.put(bke.f, new bkc(m, "Tool modifier", 8.0, bkc.a.a));
      $$1.put(bke.h, new bkc(n, "Tool modifier", -2.9F, bkc.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      return !$$3.f();
   }

   @Override
   public ckq c(cix $$0) {
      return ckq.f;
   }

   @Override
   public int b(cix $$0) {
      return 72000;
   }

   @Override
   public void a(cix $$0, cpl $$1, biy $$2, int $$3) {
      if ($$2 instanceof cbm $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cng.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fm()));
                  if ($$6 == 0) {
                     ccq $$7 = new ccq($$1, $$4, $$0);
                     $$7.a($$4, $$4.dC(), $$4.dA(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fR().d) {
                        $$7.d = cbs.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aow.xT, aox.h, 1.0F, 1.0F);
                     if (!$$4.fR().d) {
                        $$4.fQ().g($$0);
                     }
                  }
               }

               $$4.b(apg.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dA();
                  float $$9 = $$4.dC();
                  float $$10 = -arp.a($$8 * (float) (Math.PI / 180.0)) * arp.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -arp.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = arp.b($$8 * (float) (Math.PI / 180.0)) * arp.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = arp.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bje.a, new ehd(0.0, 1.1999999F, 0.0));
                  }

                  aov $$16;
                  if ($$6 >= 3) {
                     $$16 = aow.xS;
                  } else if ($$6 == 2) {
                     $$16 = aow.xR;
                  } else {
                     $$16 = aow.xQ;
                  }

                  $$1.a(null, $$4, $$16, aox.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bgr.d($$3);
      } else if (cng.h($$3) > 0 && !$$1.aY()) {
         return bgr.d($$3);
      } else {
         $$1.c($$2);
         return bgr.b($$3);
      }
   }

   @Override
   public boolean a(cix $$0, biy $$1, biy $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bin.a));
      return true;
   }

   @Override
   public boolean a(cix $$0, cpl $$1, dez $$2, gu $$3, biy $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bin.a));
      }

      return true;
   }

   @Override
   public Multimap<bjz, bkc> a(bin $$0) {
      return $$0 == bin.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
