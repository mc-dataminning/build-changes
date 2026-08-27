import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cqv extends coy {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<ij<bpk>, bpn> d;

   public cqv(coy.a $$0) {
      super($$0);
      Builder<ij<bpk>, bpn> $$1 = ImmutableMultimap.builder();
      $$1.put(bpp.c, new bpn(m, "Tool modifier", 8.0, bpn.a.a));
      $$1.put(bpp.e, new bpn(n, "Tool modifier", -2.9F, bpn.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      return !$$3.f();
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.f;
   }

   @Override
   public int b(cpd $$0) {
      return 72000;
   }

   @Override
   public void a(cpd $$0, cvr $$1, boi $$2, int $$3) {
      if ($$2 instanceof chl $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = ctn.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, boi.d($$2.fo()));
                  if ($$6 == 0) {
                     ciq $$7 = new ciq($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fU().d) {
                        $$7.d = chr.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, atl.yZ, atm.h, 1.0F, 1.0F);
                     if (!$$4.fU().d) {
                        $$4.fT().g($$0);
                     }
                  }
               }

               $$4.b(atv.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -awi.a($$8 * (float) (Math.PI / 180.0)) * awi.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -awi.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = awi.b($$8 * (float) (Math.PI / 180.0)) * awi.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = awi.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bon.a, new enz(0.0, 1.1999999F, 0.0));
                  }

                  atk $$16;
                  if ($$6 >= 3) {
                     $$16 = atl.yY;
                  } else if ($$6 == 2) {
                     $$16 = atl.yX;
                  } else {
                     $$16 = atl.yW;
                  }

                  $$1.a(null, $$4, $$16, atm.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if ($$3.l() >= $$3.m() - 1) {
         return blx.d($$3);
      } else if (ctn.h($$3) > 0 && !$$1.ba()) {
         return blx.d($$3);
      } else {
         $$1.c($$2);
         return blx.b($$3);
      }
   }

   @Override
   public boolean a(cpd $$0, boi $$1, boi $$2) {
      $$0.a(1, $$2, bnx.a);
      return true;
   }

   @Override
   public boolean a(cpd $$0, cvr $$1, dlj $$2, hz $$3, boi $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bnx.a);
      }

      return true;
   }

   @Override
   public Multimap<ij<bpk>, bpn> a(bnx $$0) {
      return $$0 == bnx.a ? this.d : super.a($$0);
   }

   @Override
   public int an_() {
      return 1;
   }
}
