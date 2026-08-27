import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cko extends cir implements ckq {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bjy, bkb> d;

   public cko(cir.a $$0) {
      super($$0);
      Builder<bjy, bkb> $$1 = ImmutableMultimap.builder();
      $$1.put(bkd.f, new bkb(m, "Tool modifier", 8.0, bkb.a.a));
      $$1.put(bkd.h, new bkb(n, "Tool modifier", -2.9F, bkb.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      return !$$3.f();
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.f;
   }

   @Override
   public int b(ciw $$0) {
      return 72000;
   }

   @Override
   public void a(ciw $$0, cpk $$1, biw $$2, int $$3) {
      if ($$2 instanceof cbl $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cnf.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fm()));
                  if ($$6 == 0) {
                     ccp $$7 = new ccp($$1, $$4, $$0);
                     $$7.a($$4, $$4.dC(), $$4.dA(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fR().d) {
                        $$7.d = cbr.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aou.xO, aov.h, 1.0F, 1.0F);
                     if (!$$4.fR().d) {
                        $$4.fQ().g($$0);
                     }
                  }
               }

               $$4.b(ape.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dA();
                  float $$9 = $$4.dC();
                  float $$10 = -aro.a($$8 * (float) (Math.PI / 180.0)) * aro.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aro.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aro.b($$8 * (float) (Math.PI / 180.0)) * aro.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aro.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bjc.a, new ehf(0.0, 1.1999999F, 0.0));
                  }

                  aot $$16;
                  if ($$6 >= 3) {
                     $$16 = aou.xN;
                  } else if ($$6 == 2) {
                     $$16 = aou.xM;
                  } else {
                     $$16 = aou.xL;
                  }

                  $$1.a(null, $$4, $$16, aov.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bgp.d($$3);
      } else if (cnf.h($$3) > 0 && !$$1.aY()) {
         return bgp.d($$3);
      } else {
         $$1.c($$2);
         return bgp.b($$3);
      }
   }

   @Override
   public boolean a(ciw $$0, biw $$1, biw $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bil.a));
      return true;
   }

   @Override
   public boolean a(ciw $$0, cpk $$1, dey $$2, gv $$3, biw $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bil.a));
      }

      return true;
   }

   @Override
   public Multimap<bjy, bkb> a(bil $$0) {
      return $$0 == bil.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
