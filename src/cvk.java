import java.util.List;

public class cvk extends ctl implements cui {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cvk(ctl.a $$0) {
      super($$0);
   }

   public static cwl h() {
      return cwl.a().a(bty.c, new btw(e, "Tool modifier", 8.0, btw.a.a), bse.b).a(bty.e, new btw(f, "Tool modifier", -2.9F, btw.a.a), bse.b).a();
   }

   public static cwv k() {
      return new cwv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drd $$0, daz $$1, io $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public cvl c(ctq $$0) {
      return cvl.f;
   }

   @Override
   public int b(ctq $$0) {
      return 72000;
   }

   @Override
   public void a(ctq $$0, daz $$1, bsq $$2, int $$3) {
      if ($$2 instanceof cly $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = czc.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bsq.d($$2.fw()));
                  if ($$6 == 0) {
                     cnd $$7 = new cnd($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cme.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avi.zD, avj.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(avs.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayf.a($$8 * (float) (Math.PI / 180.0)) * ayf.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayf.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayf.b($$8 * (float) (Math.PI / 180.0)) * ayf.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayf.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bsv.a, new eum(0.0, 1.1999999F, 0.0));
                  }

                  avh $$16;
                  if ($$6 >= 3) {
                     $$16 = avi.zC;
                  } else if ($$6 == 2) {
                     $$16 = avi.zB;
                  } else {
                     $$16 = avi.zA;
                  }

                  $$1.a(null, $$4, $$16, avj.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bpx.d($$3);
      } else if (czc.j($$3) > 0 && !$$1.bf()) {
         return bpx.d($$3);
      } else {
         $$1.c($$2);
         return bpx.b($$3);
      }
   }

   @Override
   public boolean a(ctq $$0, bsq $$1, bsq $$2) {
      $$0.a(1, $$2, bsd.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cmq a(daz $$0, jh $$1, ctq $$2, it $$3) {
      cnd $$4 = new cnd($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cme.a.b;
      return $$4;
   }
}
