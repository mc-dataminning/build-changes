import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cse extends cqh {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<il<bqr>, bqu> d;

   public cse(cqh.a $$0) {
      super($$0);
      Builder<il<bqr>, bqu> $$1 = ImmutableMultimap.builder();
      $$1.put(bqw.c, new bqu(m, "Tool modifier", 8.0, bqu.a.a));
      $$1.put(bqw.e, new bqu(n, "Tool modifier", -2.9F, bqu.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      return !$$3.f();
   }

   @Override
   public csf c(cqm $$0) {
      return csf.f;
   }

   @Override
   public int b(cqm $$0) {
      return 72000;
   }

   @Override
   public void a(cqm $$0, cxb $$1, bpp $$2, int $$3) {
      if ($$2 instanceof ciu $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cux.h($$0);
            if ($$6 <= 0 || $$4.bd()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bpp.d($$2.ft()));
                  if ($$6 == 0) {
                     cjz $$7 = new cjz($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fM()) {
                        $$7.d = cja.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aty.zh, atz.h, 1.0F, 1.0F);
                     if (!$$4.fM()) {
                        $$4.fZ().g($$0);
                     }
                  }
               }

               $$4.b(aui.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -aww.a($$8 * (float) (Math.PI / 180.0)) * aww.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aww.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aww.b($$8 * (float) (Math.PI / 180.0)) * aww.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aww.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bpu.a, new ept(0.0, 1.1999999F, 0.0));
                  }

                  atx $$16;
                  if ($$6 >= 3) {
                     $$16 = aty.zg;
                  } else if ($$6 == 2) {
                     $$16 = aty.zf;
                  } else {
                     $$16 = aty.ze;
                  }

                  $$1.a(null, $$4, $$16, atz.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if ($$3.l() >= $$3.m() - 1) {
         return bne.d($$3);
      } else if (cux.h($$3) > 0 && !$$1.bd()) {
         return bne.d($$3);
      } else {
         $$1.c($$2);
         return bne.b($$3);
      }
   }

   @Override
   public boolean a(cqm $$0, bpp $$1, bpp $$2) {
      $$0.a(1, $$2, bpe.a);
      return true;
   }

   @Override
   public boolean a(cqm $$0, cxb $$1, dnb $$2, ib $$3, bpp $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bpe.a);
      }

      return true;
   }

   @Override
   public Multimap<il<bqr>, bqu> a(bpe $$0) {
      return $$0 == bpe.a ? this.d : super.a($$0);
   }

   @Override
   public int e() {
      return 1;
   }
}
