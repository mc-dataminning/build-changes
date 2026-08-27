import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cnb extends cle implements cnd {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bmh, bmk> d;

   public cnb(cle.a $$0) {
      super($$0);
      Builder<bmh, bmk> $$1 = ImmutableMultimap.builder();
      $$1.put(bmm.c, new bmk(m, "Tool modifier", 8.0, bmk.a.a));
      $$1.put(bmm.e, new bmk(n, "Tool modifier", -2.9F, bmk.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      return !$$3.f();
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.f;
   }

   @Override
   public int b(clj $$0) {
      return 72000;
   }

   @Override
   public void a(clj $$0, csa $$1, blg $$2, int $$3) {
      if ($$2 instanceof cdu $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cpw.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fp()));
                  if ($$6 == 0) {
                     cey $$7 = new cey($$1, $$4, $$0);
                     $$7.a($$4, $$4.dF(), $$4.dD(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fU().d) {
                        $$7.d = cea.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aqr.yo, aqs.h, 1.0F, 1.0F);
                     if (!$$4.fU().d) {
                        $$4.fT().g($$0);
                     }
                  }
               }

               $$4.b(arb.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dD();
                  float $$9 = $$4.dF();
                  float $$10 = -atm.a($$8 * (float) (Math.PI / 180.0)) * atm.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -atm.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = atm.b($$8 * (float) (Math.PI / 180.0)) * atm.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = atm.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(blm.a, new eju(0.0, 1.1999999F, 0.0));
                  }

                  aqq $$16;
                  if ($$6 >= 3) {
                     $$16 = aqr.yn;
                  } else if ($$6 == 2) {
                     $$16 = aqr.ym;
                  } else {
                     $$16 = aqr.yl;
                  }

                  $$1.a(null, $$4, $$16, aqs.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return biy.d($$3);
      } else if (cpw.h($$3) > 0 && !$$1.ba()) {
         return biy.d($$3);
      } else {
         $$1.c($$2);
         return biy.b($$3);
      }
   }

   @Override
   public boolean a(clj $$0, blg $$1, blg $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bkv.a));
      return true;
   }

   @Override
   public boolean a(clj $$0, csa $$1, dhi $$2, ht $$3, blg $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bkv.a));
      }

      return true;
   }

   @Override
   public Multimap<bmh, bmk> a(bkv $$0) {
      return $$0 == bkv.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
