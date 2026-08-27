import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cld extends cjg implements clf {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bkn, bkq> d;

   public cld(cjg.a $$0) {
      super($$0);
      Builder<bkn, bkq> $$1 = ImmutableMultimap.builder();
      $$1.put(bks.c, new bkq(m, "Tool modifier", 8.0, bkq.a.a));
      $$1.put(bks.e, new bkq(n, "Tool modifier", -2.9F, bkq.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
      return !$$3.f();
   }

   @Override
   public cle c(cjl $$0) {
      return cle.f;
   }

   @Override
   public int b(cjl $$0) {
      return 72000;
   }

   @Override
   public void a(cjl $$0, cqb $$1, bjm $$2, int $$3) {
      if ($$2 instanceof cca $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cnw.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cde $$7 = new cde($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = ccg.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, apg.xT, aph.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(apq.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -asb.a($$8 * (float) (Math.PI / 180.0)) * asb.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -asb.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = asb.b($$8 * (float) (Math.PI / 180.0)) * asb.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = asb.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bjs.a, new ehh(0.0, 1.1999999F, 0.0));
                  }

                  apf $$16;
                  if ($$6 >= 3) {
                     $$16 = apg.xS;
                  } else if ($$6 == 2) {
                     $$16 = apg.xR;
                  } else {
                     $$16 = apg.xQ;
                  }

                  $$1.a(null, $$4, $$16, aph.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bhf.d($$3);
      } else if (cnw.h($$3) > 0 && !$$1.aY()) {
         return bhf.d($$3);
      } else {
         $$1.c($$2);
         return bhf.b($$3);
      }
   }

   @Override
   public boolean a(cjl $$0, bjm $$1, bjm $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bjb.a));
      return true;
   }

   @Override
   public boolean a(cjl $$0, cqb $$1, dfd $$2, gw $$3, bjm $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bjb.a));
      }

      return true;
   }

   @Override
   public Multimap<bkn, bkq> a(bjb $$0) {
      return $$0 == bjb.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
