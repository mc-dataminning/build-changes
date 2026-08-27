import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cmb extends cke implements cmd {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<blk, bln> d;

   public cmb(cke.a $$0) {
      super($$0);
      Builder<blk, bln> $$1 = ImmutableMultimap.builder();
      $$1.put(blp.c, new bln(m, "Tool modifier", 8.0, bln.a.a));
      $$1.put(blp.e, new bln(n, "Tool modifier", -2.9F, bln.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
      return !$$3.f();
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.f;
   }

   @Override
   public int b(ckj $$0) {
      return 72000;
   }

   @Override
   public void a(ckj $$0, cqz $$1, bkj $$2, int $$3) {
      if ($$2 instanceof ccx $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cov.h($$0);
            if ($$6 <= 0 || $$4.aY()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     ceb $$7 = new ceb($$1, $$4, $$0);
                     $$7.a($$4, $$4.dD(), $$4.dB(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cdd.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aqd.xV, aqe.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(aqn.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dB();
                  float $$9 = $$4.dD();
                  float $$10 = -asy.a($$8 * (float) (Math.PI / 180.0)) * asy.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -asy.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = asy.b($$8 * (float) (Math.PI / 180.0)) * asy.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = asy.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aA()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bkp.a, new eif(0.0, 1.1999999F, 0.0));
                  }

                  aqc $$16;
                  if ($$6 >= 3) {
                     $$16 = aqd.xU;
                  } else if ($$6 == 2) {
                     $$16 = aqd.xT;
                  } else {
                     $$16 = aqd.xS;
                  }

                  $$1.a(null, $$4, $$16, aqe.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bic.d($$3);
      } else if (cov.h($$3) > 0 && !$$1.aY()) {
         return bic.d($$3);
      } else {
         $$1.c($$2);
         return bic.b($$3);
      }
   }

   @Override
   public boolean a(ckj $$0, bkj $$1, bkj $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bjy.a));
      return true;
   }

   @Override
   public boolean a(ckj $$0, cqz $$1, dgb $$2, ht $$3, bkj $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bjy.a));
      }

      return true;
   }

   @Override
   public Multimap<blk, bln> a(bjy $$0) {
      return $$0 == bjy.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
