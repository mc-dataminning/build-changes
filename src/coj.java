import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coj extends cmm implements col {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bng, bnj> d;

   public coj(cmm.a $$0) {
      super($$0);
      Builder<bng, bnj> $$1 = ImmutableMultimap.builder();
      $$1.put(bnl.c, new bnj(m, "Tool modifier", 8.0, bnj.a.a));
      $$1.put(bnl.e, new bnj(n, "Tool modifier", -2.9F, bnj.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      return !$$3.f();
   }

   @Override
   public cok c(cmr $$0) {
      return cok.f;
   }

   @Override
   public int b(cmr $$0) {
      return 72000;
   }

   @Override
   public void a(cmr $$0, cti $$1, bmf $$2, int $$3) {
      if ($$2 instanceof cfb $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cre.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fo()));
                  if ($$6 == 0) {
                     cgf $$7 = new cgf($$1, $$4, $$0);
                     $$7.a($$4, $$4.dE(), $$4.dC(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fT().d) {
                        $$7.d = cfh.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, arm.yJ, arn.h, 1.0F, 1.0F);
                     if (!$$4.fT().d) {
                        $$4.fS().g($$0);
                     }
                  }
               }

               $$4.b(arw.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dC();
                  float $$9 = $$4.dE();
                  float $$10 = -aui.a($$8 * (float) (Math.PI / 180.0)) * aui.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -aui.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = aui.b($$8 * (float) (Math.PI / 180.0)) * aui.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = aui.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bml.a, new elm(0.0, 1.1999999F, 0.0));
                  }

                  arl $$16;
                  if ($$6 >= 3) {
                     $$16 = arm.yI;
                  } else if ($$6 == 2) {
                     $$16 = arm.yH;
                  } else {
                     $$16 = arm.yG;
                  }

                  $$1.a(null, $$4, $$16, arn.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bjw.d($$3);
      } else if (cre.h($$3) > 0 && !$$1.ba()) {
         return bjw.d($$3);
      } else {
         $$1.c($$2);
         return bjw.b($$3);
      }
   }

   @Override
   public boolean a(cmr $$0, bmf $$1, bmf $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blu.a));
      return true;
   }

   @Override
   public boolean a(cmr $$0, cti $$1, dja $$2, hx $$3, bmf $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blu.a));
      }

      return true;
   }

   @Override
   public Multimap<bng, bnj> a(blu $$0) {
      return $$0 == blu.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
