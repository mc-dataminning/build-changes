import java.util.List;

public class cvw extends ctx implements cuu {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cvw(ctx.a $$0) {
      super($$0);
   }

   public static cww h() {
      return cww.a().a(buj.c, new buh(e, "Tool modifier", 8.0, buh.a.a), bso.b).a(buj.e, new buh(f, "Tool modifier", -2.9F, buh.a.a), bso.b).a();
   }

   public static cxg k() {
      return new cxg(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      return !$$3.f();
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.f;
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return 72000;
   }

   @Override
   public void a(cuc $$0, dcf $$1, btb $$2, int $$3) {
      if ($$2 instanceof cmk $$4) {
         int $$5 = this.a($$0, $$2) - $$3;
         if ($$5 >= 10) {
            float $$6 = czn.b($$4);
            if (!($$6 > 0.0F) || $$4.bg()) {
               jj<avg> $$7 = czn.b($$0, czm.C).orElse(avh.zG);
               if (!$$1.B) {
                  $$0.a(1, $$4, btb.d($$2.ft()));
                  if ($$6 == 0.0F) {
                     cnp $$8 = new cnp($$1, $$4, $$0);
                     $$8.a($$4, $$4.dI(), $$4.dG(), 0.0F, 2.5F, 1.0F);
                     if ($$4.fM()) {
                        $$8.d = cmq.a.c;
                     }

                     $$1.b($$8);
                     $$1.a(null, $$8, $$7.a(), avi.h, 1.0F, 1.0F);
                     if (!$$4.fM()) {
                        $$4.fZ().h($$0);
                     }
                  }
               }

               $$4.b(avr.c.b(this));
               if ($$6 > 0.0F) {
                  float $$9 = $$4.dG();
                  float $$10 = $$4.dI();
                  float $$11 = -ayg.a($$9 * (float) (Math.PI / 180.0)) * ayg.b($$10 * (float) (Math.PI / 180.0));
                  float $$12 = -ayg.a($$10 * (float) (Math.PI / 180.0));
                  float $$13 = ayg.b($$9 * (float) (Math.PI / 180.0)) * ayg.b($$10 * (float) (Math.PI / 180.0));
                  float $$14 = ayg.c($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
                  $$11 *= $$6 / $$14;
                  $$12 *= $$6 / $$14;
                  $$13 *= $$6 / $$14;
                  $$4.j((double)$$11, (double)$$12, (double)$$13);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aF()) {
                     float $$15 = 1.1999999F;
                     $$4.a(btg.a, new ewf(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$7.a(), avi.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqh.d($$3);
      } else if (czn.b($$1) > 0.0F && !$$1.bg()) {
         return bqh.d($$3);
      } else {
         $$1.c($$2);
         return bqh.b($$3);
      }
   }

   @Override
   public boolean a(cuc $$0, btb $$1, btb $$2) {
      return true;
   }

   @Override
   public void b(cuc $$0, btb $$1, btb $$2) {
      $$0.a(1, $$2, bsn.a);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      cnp $$4 = new cnp($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cmq.a.b;
      return $$4;
   }
}
