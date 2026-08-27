import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cng extends clj implements cni {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bmm, bmp> d;

   public cng(clj.a $$0) {
      super($$0);
      Builder<bmm, bmp> $$1 = ImmutableMultimap.builder();
      $$1.put(bmr.c, new bmp(m, "Tool modifier", 8.0, bmp.a.a));
      $$1.put(bmr.e, new bmp(n, "Tool modifier", -2.9F, bmp.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
      return !$$3.f();
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.f;
   }

   @Override
   public int b(clo $$0) {
      return 72000;
   }

   @Override
   public void a(clo $$0, csf $$1, bll $$2, int $$3) {
      if ($$2 instanceof cdz $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cqb.h($$0);
            if ($$6 <= 0 || $$4.ba()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fp()));
                  if ($$6 == 0) {
                     cfd $$7 = new cfd($$1, $$4, $$0);
                     $$7.a($$4, $$4.dF(), $$4.dD(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fU().d) {
                        $$7.d = cef.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, aqv.yo, aqw.h, 1.0F, 1.0F);
                     if (!$$4.fU().d) {
                        $$4.fT().g($$0);
                     }
                  }
               }

               $$4.b(arf.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dD();
                  float $$9 = $$4.dF();
                  float $$10 = -atq.a($$8 * (float) (Math.PI / 180.0)) * atq.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -atq.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = atq.b($$8 * (float) (Math.PI / 180.0)) * atq.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = atq.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(blr.a, new ejz(0.0, 1.1999999F, 0.0));
                  }

                  aqu $$16;
                  if ($$6 >= 3) {
                     $$16 = aqv.yn;
                  } else if ($$6 == 2) {
                     $$16 = aqv.ym;
                  } else {
                     $$16 = aqv.yl;
                  }

                  $$1.a(null, $$4, $$16, aqw.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bjc.d($$3);
      } else if (cqb.h($$3) > 0 && !$$1.ba()) {
         return bjc.d($$3);
      } else {
         $$1.c($$2);
         return bjc.b($$3);
      }
   }

   @Override
   public boolean a(clo $$0, bll $$1, bll $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bla.a));
      return true;
   }

   @Override
   public boolean a(clo $$0, csf $$1, dhn $$2, hx $$3, bll $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bla.a));
      }

      return true;
   }

   @Override
   public Multimap<bmm, bmp> a(bla $$0) {
      return $$0 == bla.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
