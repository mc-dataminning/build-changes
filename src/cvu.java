import java.util.List;

public class cvu extends ctv implements cus {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cvu(ctv.a $$0) {
      super($$0);
   }

   public static cwu h() {
      return cwu.a().a(bug.c, new bue(e, "Tool modifier", 8.0, bue.a.a), bsl.b).a(bug.e, new bue(f, "Tool modifier", -2.9F, bue.a.a), bsl.b).a();
   }

   public static cxe k() {
      return new cxe(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      return !$$3.f();
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.f;
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 72000;
   }

   @Override
   public void a(cua $$0, dcd $$1, bsy $$2, int $$3) {
      if ($$2 instanceof cmh $$4) {
         int $$5 = this.a($$0, $$2) - $$3;
         if ($$5 >= 10) {
            float $$7 = $$1 instanceof aqk $$6 ? czl.a($$6, $$0, (bsy)$$4) : 0.0F;
            if (!($$7 > 0.0F) || $$4.bf()) {
               jj<ave> $$8 = czl.b($$0, czk.D).orElse(avf.zG);
               if (!$$1.B) {
                  $$0.a(1, $$4, bsy.d($$2.fs()));
                  if ($$7 == 0.0F) {
                     cnm $$9 = new cnm($$1, $$4, $$0);
                     $$9.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F, 1.0F);
                     if ($$4.fL()) {
                        $$9.d = cmn.a.c;
                     }

                     $$1.b($$9);
                     $$1.a(null, $$9, $$8.a(), avg.h, 1.0F, 1.0F);
                     if (!$$4.fL()) {
                        $$4.fY().h($$0);
                     }
                  }
               }

               $$4.b(avp.c.b(this));
               if ($$7 > 0.0F) {
                  float $$10 = $$4.dF();
                  float $$11 = $$4.dH();
                  float $$12 = -aye.a($$10 * (float) (Math.PI / 180.0)) * aye.b($$11 * (float) (Math.PI / 180.0));
                  float $$13 = -aye.a($$11 * (float) (Math.PI / 180.0));
                  float $$14 = aye.b($$10 * (float) (Math.PI / 180.0)) * aye.b($$11 * (float) (Math.PI / 180.0));
                  float $$15 = aye.c($$12 * $$12 + $$13 * $$13 + $$14 * $$14);
                  $$12 *= $$7 / $$15;
                  $$13 *= $$7 / $$15;
                  $$14 *= $$7 / $$15;
                  $$4.j((double)$$12, (double)$$13, (double)$$14);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aE()) {
                     float $$16 = 1.1999999F;
                     $$4.a(btd.a, new evz(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), avg.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqe.d($$3);
      } else {
         if ($$0 instanceof aqk $$4 && czl.a($$4, $$3, (bsy)$$1) > 0.0F && !$$1.bf()) {
            return bqe.d($$3);
         }

         $$1.c($$2);
         return bqe.b($$3);
      }
   }

   @Override
   public boolean a(cua $$0, bsy $$1, bsy $$2) {
      return true;
   }

   @Override
   public void b(cua $$0, bsy $$1, bsy $$2) {
      $$0.a(1, $$2, bsk.a);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      cnm $$4 = new cnm($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cmn.a.b;
      return $$4;
   }
}
