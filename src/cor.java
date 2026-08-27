import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cor extends cmt implements cot {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bnm, bnp> d;

   public cor(cmt.a $$0) {
      super($$0);
      Builder<bnm, bnp> $$1 = ImmutableMultimap.builder();
      $$1.put(bnr.c, new bnp(m, "Tool modifier", 8.0, bnp.a.a));
      $$1.put(bnr.e, new bnp(n, "Tool modifier", -2.9F, bnp.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
      return !$$3.f();
   }

   @Override
   public cos c(cmy $$0) {
      return cos.f;
   }

   @Override
   public int b(cmy $$0) {
      return 72000;
   }

   @Override
   public void a(cmy $$0, ctp $$1, bml $$2, int $$3) {
      if ($$2 instanceof cfi $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = crl.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cgm $$7 = new cgm($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cfo.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, ars.yJ, art.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(asc.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -auo.a($$8 * (float) (Math.PI / 180.0)) * auo.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -auo.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = auo.b($$8 * (float) (Math.PI / 180.0)) * auo.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = auo.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bmr.a, new elt(0.0, 1.1999999F, 0.0));
                  }

                  arr $$16;
                  if ($$6 >= 3) {
                     $$16 = ars.yI;
                  } else if ($$6 == 2) {
                     $$16 = ars.yH;
                  } else {
                     $$16 = ars.yG;
                  }

                  $$1.a(null, $$4, $$16, art.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bkc.d($$3);
      } else if (crl.h($$3) > 0 && !$$1.ba()) {
         return bkc.d($$3);
      } else {
         $$1.c($$2);
         return bkc.b($$3);
      }
   }

   @Override
   public boolean a(cmy $$0, bml $$1, bml $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bma.a));
      return true;
   }

   @Override
   public boolean a(cmy $$0, ctp $$1, djh $$2, hx $$3, bml $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bma.a));
      }

      return true;
   }

   @Override
   public Multimap<bnm, bnp> a(bma $$0) {
      return $$0 == bma.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
