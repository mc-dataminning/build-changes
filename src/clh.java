public class clh extends cnb {
   public static final int a = 10;
   private static final int b = 200;

   public clh(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      cfq $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ema.a.b) {
         $$1.c($$0.p());
      }

      return bkc.b;
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.j;
   }

   @Override
   public int b(cng $$0) {
      return 200;
   }

   @Override
   public void a(ctx $$0, bmo $$1, cng $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cfq $$4) {
         ema $$6 = this.a($$4);
         if ($$6 instanceof ely $$7 && $$6.c() == ema.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hx $$11 = $$7.a();
               djp $$12 = $$0.a_($$11);
               bmi $$13 = $$1.fo() == bkb.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != ddd.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               ars $$15;
               if ($$12.b() instanceof cxd $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = art.cJ;
               }

               $$0.a($$4, $$11, $$15, aru.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dhh $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bmd $$19 = $$2.equals($$4.c(bmd.b)) ? bmd.b : bmd.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fs();
      } else {
         $$1.fs();
      }
   }

   private ema a(cfq $$0) {
      return cgj.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), $$0.gs());
   }

   private void a(ctx $$0, ely $$1, djp $$2, emc $$3, bmi $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bmi.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jp $$8 = new jp(jx.c, $$2);
      ic $$9 = $$1.b();
      clh.a $$10 = clh.a.a($$3, $$9);
      emc $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ic.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ic.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static clh.a a(emc $$0, ic $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new clh.a($$0.c(), 0.0, -$$0.a());
            case c -> new clh.a(1.0, 0.0, -0.1);
            case d -> new clh.a(-1.0, 0.0, 0.1);
            case e -> new clh.a(-0.1, 0.0, -1.0);
            case f -> new clh.a(0.1, 0.0, 1.0);
         };
      }
   }
}
