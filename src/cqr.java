import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cqr extends cou {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<ij<bpg>, bpj> d;

   public cqr(cou.a $$0) {
      super($$0);
      Builder<ij<bpg>, bpj> $$1 = ImmutableMultimap.builder();
      $$1.put(bpl.c, new bpj(m, "Tool modifier", 8.0, bpj.a.a));
      $$1.put(bpl.e, new bpj(n, "Tool modifier", -2.9F, bpj.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      return !$$3.f();
   }

   @Override
   public cqs c(coz $$0) {
      return cqs.f;
   }

   @Override
   public int b(coz $$0) {
      return 72000;
   }

   @Override
   public void a(coz $$0, cvn $$1, bog $$2, int $$3) {
      if ($$2 instanceof chh $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = ctj.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bog.d($$2.fo()));
                  if ($$6 == 0) {
                     cim $$7 = new cim($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fU().d) {
                        $$7.d = chn.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, atk.yY, atl.h, 1.0F, 1.0F);
                     if (!$$4.fU().d) {
                        $$4.fT().g($$0);
                     }
                  }
               }

               $$4.b(atu.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -awh.a($$8 * (float) (Math.PI / 180.0)) * awh.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -awh.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = awh.b($$8 * (float) (Math.PI / 180.0)) * awh.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = awh.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bol.a, new ens(0.0, 1.1999999F, 0.0));
                  }

                  atj $$16;
                  if ($$6 >= 3) {
                     $$16 = atk.yX;
                  } else if ($$6 == 2) {
                     $$16 = atk.yW;
                  } else {
                     $$16 = atk.yV;
                  }

                  $$1.a(null, $$4, $$16, atl.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if ($$3.l() >= $$3.m() - 1) {
         return blv.d($$3);
      } else if (ctj.h($$3) > 0 && !$$1.ba()) {
         return blv.d($$3);
      } else {
         $$1.c($$2);
         return blv.b($$3);
      }
   }

   @Override
   public boolean a(coz $$0, bog $$1, bog $$2) {
      $$0.a(1, $$2, bnv.a);
      return true;
   }

   @Override
   public boolean a(coz $$0, cvn $$1, dlf $$2, hz $$3, bog $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bnv.a);
      }

      return true;
   }

   @Override
   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      return $$0 == bnv.a ? this.d : super.a($$0);
   }

   @Override
   public int an_() {
      return 1;
   }
}
