import java.util.List;

public class cvi extends ctj implements cug {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cvi(ctj.a $$0) {
      super($$0);
   }

   public static cwj h() {
      return cwj.a().a(btw.c, new btu(e, "Tool modifier", 8.0, btu.a.a), bsc.b).a(btw.e, new btu(f, "Tool modifier", -2.9F, btu.a.a), bsc.b).a();
   }

   public static cwt j() {
      return new cwt(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drb $$0, dax $$1, io $$2, clw $$3) {
      return !$$3.f();
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.f;
   }

   @Override
   public int b(cto $$0) {
      return 72000;
   }

   @Override
   public void a(cto $$0, dax $$1, bso $$2, int $$3) {
      if ($$2 instanceof clw $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cza.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bso.d($$2.fw()));
                  if ($$6 == 0) {
                     cnb $$7 = new cnb($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cmc.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avh.zD, avi.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(avr.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayd.a($$8 * (float) (Math.PI / 180.0)) * ayd.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayd.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayd.b($$8 * (float) (Math.PI / 180.0)) * ayd.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayd.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bst.a, new euk(0.0, 1.1999999F, 0.0));
                  }

                  avg $$16;
                  if ($$6 >= 3) {
                     $$16 = avh.zC;
                  } else if ($$6 == 2) {
                     $$16 = avh.zB;
                  } else {
                     $$16 = avh.zA;
                  }

                  $$1.a(null, $$4, $$16, avi.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bpv.d($$3);
      } else if (cza.j($$3) > 0 && !$$1.bf()) {
         return bpv.d($$3);
      } else {
         $$1.c($$2);
         return bpv.b($$3);
      }
   }

   @Override
   public boolean a(cto $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsb.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      cnb $$4 = new cnb($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cmc.a.b;
      return $$4;
   }
}
