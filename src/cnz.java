import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cnz extends cmc implements cob {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bmw, bmz> d;

   public cnz(cmc.a $$0) {
      super($$0);
      Builder<bmw, bmz> $$1 = ImmutableMultimap.builder();
      $$1.put(bnb.c, new bmz(m, "Tool modifier", 8.0, bmz.a.a));
      $$1.put(bnb.e, new bmz(n, "Tool modifier", -2.9F, bmz.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, cer $$3) {
      return !$$3.f();
   }

   @Override
   public coa c(cmh $$0) {
      return coa.f;
   }

   @Override
   public int b(cmh $$0) {
      return 72000;
   }

   @Override
   public void a(cmh $$0, csy $$1, blv $$2, int $$3) {
      if ($$2 instanceof cer $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cqu.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cfv $$7 = new cfv($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cex.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, arc.yJ, ard.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(arm.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -aty.a($$8 * (float) (Math.PI / 180.0)) * aty.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aty.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aty.b($$8 * (float) (Math.PI / 180.0)) * aty.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aty.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bmb.a, new elb(0.0, 1.1999999F, 0.0));
                  }

                  arb $$16;
                  if ($$6 >= 3) {
                     $$16 = arc.yI;
                  } else if ($$6 == 2) {
                     $$16 = arc.yH;
                  } else {
                     $$16 = arc.yG;
                  }

                  $$1.a(null, $$4, $$16, ard.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bjm.d($$3);
      } else if (cqu.h($$3) > 0 && !$$1.ba()) {
         return bjm.d($$3);
      } else {
         $$1.c($$2);
         return bjm.b($$3);
      }
   }

   @Override
   public boolean a(cmh $$0, blv $$1, blv $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blk.a));
      return true;
   }

   @Override
   public boolean a(cmh $$0, csy $$1, dip $$2, hv $$3, blv $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blk.a));
      }

      return true;
   }

   @Override
   public Multimap<bmw, bmz> a(blk $$0) {
      return $$0 == blk.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
