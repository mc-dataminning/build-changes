import java.util.List;

public class cwl extends cuj implements cvk {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwl(cuj.a $$0) {
      super($$0);
   }

   public static cxl h() {
      return cxl.a().a(buu.c, new bus(e, 8.0, bus.a.a), bsy.b).a(buu.e, new bus(f, -2.9F, bus.a.a), bsy.b).a();
   }

   public static cxv k() {
      return new cxv(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      return !$$3.f();
   }

   @Override
   public cwm b(cuo $$0) {
      return cwm.f;
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      return 72000;
   }

   @Override
   public void a(cuo $$0, dcu $$1, btl $$2, int $$3) {
      if ($$2 instanceof cmv $$4) {
         int $$5 = this.a($$0, $$2) - $$3;
         if ($$5 >= 10) {
            float $$6 = dac.b($$4);
            if (!($$6 > 0.0F) || $$4.bg()) {
               jm<avn> $$7 = dac.b($$0, dab.C).orElse(avo.zG);
               if (!$$1.B) {
                  $$0.a(1, $$4, btl.d($$2.ft()));
                  if ($$6 == 0.0F) {
                     coa $$8 = new coa($$1, $$4, $$0);
                     $$8.a($$4, $$4.dI(), $$4.dG(), 0.0F, 2.5F, 1.0F);
                     if ($$4.fM()) {
                        $$8.d = cnb.a.c;
                     }

                     $$1.b($$8);
                     $$1.a(null, $$8, $$7.a(), avp.h, 1.0F, 1.0F);
                     if (!$$4.fM()) {
                        $$4.fZ().h($$0);
                     }
                  }
               }

               $$4.b(avy.c.b(this));
               if ($$6 > 0.0F) {
                  float $$9 = $$4.dG();
                  float $$10 = $$4.dI();
                  float $$11 = -ayn.a($$9 * (float) (Math.PI / 180.0)) * ayn.b($$10 * (float) (Math.PI / 180.0));
                  float $$12 = -ayn.a($$10 * (float) (Math.PI / 180.0));
                  float $$13 = ayn.b($$9 * (float) (Math.PI / 180.0)) * ayn.b($$10 * (float) (Math.PI / 180.0));
                  float $$14 = ayn.c($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
                  $$11 *= $$6 / $$14;
                  $$12 *= $$6 / $$14;
                  $$13 *= $$6 / $$14;
                  $$4.j((double)$$11, (double)$$12, (double)$$13);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aF()) {
                     float $$15 = 1.1999999F;
                     $$4.a(btq.a, new eww(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$7.a(), avp.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqr.d($$3);
      } else if (dac.b($$1) > 0.0F && !$$1.bg()) {
         return bqr.d($$3);
      } else {
         $$1.c($$2);
         return bqr.b($$3);
      }
   }

   @Override
   public boolean a(cuo $$0, btl $$1, btl $$2) {
      return true;
   }

   @Override
   public void b(cuo $$0, btl $$1, btl $$2) {
      $$0.a(1, $$2, bsx.a);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      coa $$4 = new coa($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnb.a.b;
      return $$4;
   }
}
