import java.util.List;

public class cur extends csu {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cur(csu.a $$0) {
      super($$0);
   }

   public static cvs h() {
      return cvs.a().a(bth.c, new btf(e, "Tool modifier", 8.0, btf.a.a), brp.b).a(bth.e, new btf(f, "Tool modifier", -2.9F, btf.a.a), brp.b).a();
   }

   public static cwc i() {
      return new cwc(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dqh $$0, dad $$1, in $$2, clh $$3) {
      return !$$3.f();
   }

   @Override
   public cus c(csz $$0) {
      return cus.f;
   }

   @Override
   public int b(csz $$0) {
      return 72000;
   }

   @Override
   public void a(csz $$0, dad $$1, bsa $$2, int $$3) {
      if ($$2 instanceof clh $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cyh.j($$0);
            if ($$6 <= 0 || $$4.bd()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bsa.d($$2.fu()));
                  if ($$6 == 0) {
                     cmm $$7 = new cmm($$1, $$4, $$0);
                     $$7.a($$4, $$4.dF(), $$4.dD(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fN()) {
                        $$7.d = cln.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avc.zs, avd.h, 1.0F, 1.0F);
                     if (!$$4.fN()) {
                        $$4.ga().h($$0);
                     }
                  }
               }

               $$4.b(avm.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dD();
                  float $$9 = $$4.dF();
                  float $$10 = -axz.a($$8 * (float) (Math.PI / 180.0)) * axz.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -axz.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = axz.b($$8 * (float) (Math.PI / 180.0)) * axz.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = axz.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aC()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bsf.a, new etp(0.0, 1.1999999F, 0.0));
                  }

                  avb $$16;
                  if ($$6 >= 3) {
                     $$16 = avc.zr;
                  } else if ($$6 == 2) {
                     $$16 = avc.zq;
                  } else {
                     $$16 = avc.zp;
                  }

                  $$1.a(null, $$4, $$16, avd.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if ($$3.m() >= $$3.n() - 1) {
         return bpn.d($$3);
      } else if (cyh.j($$3) > 0 && !$$1.bd()) {
         return bpn.d($$3);
      } else {
         $$1.c($$2);
         return bpn.b($$3);
      }
   }

   @Override
   public boolean a(csz $$0, bsa $$1, bsa $$2) {
      $$0.a(1, $$2, bro.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }
}
