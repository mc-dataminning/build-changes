public class cwk extends cxu {
   public static final int a = 10;
   private static final int b = 200;

   public cwk(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      cqi $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fcs.a.b) {
         $$1.c($$0.p());
      }

      return btq.c;
   }

   @Override
   public cya b(cxy $$0) {
      return cya.j;
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      return 200;
   }

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cqi $$4) {
         fcs $$6 = this.a($$4);
         if ($$6 instanceof fcq $$7 && $$6.d() == fcs.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jj $$11 = $$7.b();
               dym $$12 = $$0.a_($$11);
               bwk $$13 = $$1.fz() == btp.a ? $$4.fx() : $$4.fx().e();
               if ($$12.D() && $$12.o() != drf.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awj $$15;
               if ($$12.b() instanceof dla $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awk.cS;
               }

               $$0.a($$4, $$11, $$15, awl.e);
               if ($$0 instanceof arn $$17 && $$0.c_($$11) instanceof dvq $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bwc $$20 = $$2.equals($$4.a(bwc.b)) ? bwc.b : bwc.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fD();
      } else {
         $$1.fD();
      }
   }

   private fcs a(cqi $$0) {
      return crd.a($$0, bvz.h, $$0.gK());
   }

   private void a(dhp $$0, fcq $$1, dym $$2, fcu $$3, bwk $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bwk.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      ln $$8 = new ln(lv.b, $$2);
      jo $$9 = $$1.c();
      cwk.a $$10 = cwk.a.a($$3, $$9);
      fcu $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jo.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jo.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cwk.a a(fcu $$0, jo $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cwk.a($$0.c(), 0.0, -$$0.a());
            case c -> new cwk.a(1.0, 0.0, -0.1);
            case d -> new cwk.a(-1.0, 0.0, 0.1);
            case e -> new cwk.a(-0.1, 0.0, -1.0);
            case f -> new cwk.a(0.1, 0.0, 1.0);
         };
      }
   }
}
