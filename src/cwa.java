public class cwa extends cxl {
   public static final int a = 10;
   private static final int b = 200;

   public cwa(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      cpx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fbw.a.b) {
         $$1.c($$0.p());
      }

      return btj.c;
   }

   @Override
   public cxr b(cxp $$0) {
      return cxr.j;
   }

   @Override
   public int a(cxp $$0, bwg $$1) {
      return 200;
   }

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cpx $$4) {
         fbw $$6 = this.a($$4);
         if ($$6 instanceof fbu $$7 && $$6.d() == fbw.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jh $$11 = $$7.b();
               dxv $$12 = $$0.a_($$11);
               bwa $$13 = $$1.fA() == bti.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dqv.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               axe $$15;
               if ($$12.b() instanceof dks $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = axf.cS;
               }

               $$0.a($$4, $$11, $$15, axg.e);
               if ($$0 instanceof ash $$17 && $$0.c_($$11) instanceof dvb $$18) {
                  boolean $$19 = $$18.a($$0.ac(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bvs $$20 = $$2.equals($$4.a(bvs.b)) ? bvs.b : bvs.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fE();
      } else {
         $$1.fE();
      }
   }

   private fbw a(cpx $$0) {
      return cqs.a($$0, bvp.h, $$0.gJ());
   }

   private void a(dhi $$0, fbu $$1, dxv $$2, fby $$3, bwa $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bwa.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      lk $$8 = new lk(ls.b, $$2);
      jm $$9 = $$1.c();
      cwa.a $$10 = cwa.a.a($$3, $$9);
      fby $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jm.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jm.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.H_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.H_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cwa.a a(fby $$0, jm $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cwa.a($$0.c(), 0.0, -$$0.a());
            case c -> new cwa.a(1.0, 0.0, -0.1);
            case d -> new cwa.a(-1.0, 0.0, 0.1);
            case e -> new cwa.a(-0.1, 0.0, -1.0);
            case f -> new cwa.a(0.1, 0.0, 1.0);
         };
      }
   }
}
