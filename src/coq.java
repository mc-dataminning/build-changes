import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coq extends cms implements cos {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bnl, bno> d;

   public coq(cms.a $$0) {
      super($$0);
      Builder<bnl, bno> $$1 = ImmutableMultimap.builder();
      $$1.put(bnq.c, new bno(m, "Tool modifier", 8.0, bno.a.a));
      $$1.put(bnq.e, new bno(n, "Tool modifier", -2.9F, bno.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      return !$$3.f();
   }

   @Override
   public cor c(cmx $$0) {
      return cor.f;
   }

   @Override
   public int b(cmx $$0) {
      return 72000;
   }

   @Override
   public void a(cmx $$0, cto $$1, bmk $$2, int $$3) {
      if ($$2 instanceof cfh $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = crk.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cgl $$7 = new cgl($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cfn.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, arr.yJ, ars.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(asb.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -aun.a($$8 * (float) (Math.PI / 180.0)) * aun.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aun.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aun.b($$8 * (float) (Math.PI / 180.0)) * aun.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aun.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bmq.a, new els(0.0, 1.1999999F, 0.0));
                  }

                  arq $$16;
                  if ($$6 >= 3) {
                     $$16 = arr.yI;
                  } else if ($$6 == 2) {
                     $$16 = arr.yH;
                  } else {
                     $$16 = arr.yG;
                  }

                  $$1.a(null, $$4, $$16, ars.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bkb.d($$3);
      } else if (crk.h($$3) > 0 && !$$1.ba()) {
         return bkb.d($$3);
      } else {
         $$1.c($$2);
         return bkb.b($$3);
      }
   }

   @Override
   public boolean a(cmx $$0, bmk $$1, bmk $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blz.a));
      return true;
   }

   @Override
   public boolean a(cmx $$0, cto $$1, djg $$2, hx $$3, bmk $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blz.a));
      }

      return true;
   }

   @Override
   public Multimap<bnl, bno> a(blz $$0) {
      return $$0 == blz.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
