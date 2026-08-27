import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cri extends cpl {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<il<bpz>, bqc> d;

   public cri(cpl.a $$0) {
      super($$0);
      Builder<il<bpz>, bqc> $$1 = ImmutableMultimap.builder();
      $$1.put(bqe.c, new bqc(m, "Tool modifier", 8.0, bqc.a.a));
      $$1.put(bqe.e, new bqc(n, "Tool modifier", -2.9F, bqc.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      return !$$3.f();
   }

   @Override
   public crj c(cpq $$0) {
      return crj.f;
   }

   @Override
   public int b(cpq $$0) {
      return 72000;
   }

   @Override
   public void a(cpq $$0, cwe $$1, box $$2, int $$3) {
      if ($$2 instanceof cia $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cua.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, box.d($$2.fq()));
                  if ($$6 == 0) {
                     cjf $$7 = new cjf($$1, $$4, $$0);
                     $$7.a($$4, $$4.dB(), $$4.dz(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fW().d) {
                        $$7.d = cig.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, atp.yZ, atq.h, 1.0F, 1.0F);
                     if (!$$4.fW().d) {
                        $$4.fV().g($$0);
                     }
                  }
               }

               $$4.b(atz.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dz();
                  float $$9 = $$4.dB();
                  float $$10 = -awm.a($$8 * (float) (Math.PI / 180.0)) * awm.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -awm.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = awm.b($$8 * (float) (Math.PI / 180.0)) * awm.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = awm.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bpc.a, new eov(0.0, 1.1999999F, 0.0));
                  }

                  ato $$16;
                  if ($$6 >= 3) {
                     $$16 = atp.yY;
                  } else if ($$6 == 2) {
                     $$16 = atp.yX;
                  } else {
                     $$16 = atp.yW;
                  }

                  $$1.a(null, $$4, $$16, atq.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if ($$3.l() >= $$3.m() - 1) {
         return bmm.d($$3);
      } else if (cua.h($$3) > 0 && !$$1.ba()) {
         return bmm.d($$3);
      } else {
         $$1.c($$2);
         return bmm.b($$3);
      }
   }

   @Override
   public boolean a(cpq $$0, box $$1, box $$2) {
      $$0.a(1, $$2, bom.a);
      return true;
   }

   @Override
   public boolean a(cpq $$0, cwe $$1, dme $$2, ib $$3, box $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, bom.a);
      }

      return true;
   }

   @Override
   public Multimap<il<bpz>, bqc> a(bom $$0) {
      return $$0 == bom.a ? this.d : super.a($$0);
   }

   @Override
   public int e() {
      return 1;
   }
}
