public class cmz extends cou {
   public static final int a = 10;
   private static final int b = 200;

   public cmz(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      chh $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == enq.a.b) {
         $$1.c($$0.p());
      }

      return blu.b;
   }

   @Override
   public cqs c(coz $$0) {
      return cqs.j;
   }

   @Override
   public int b(coz $$0) {
      return 200;
   }

   @Override
   public void a(cvn $$0, bog $$1, coz $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof chh $$4) {
         enq $$6 = this.a($$4);
         if ($$6 instanceof eno $$7 && $$6.c() == enq.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hz $$11 = $$7.a();
               dlf $$12 = $$0.a_($$11);
               boa $$13 = $$1.fo() == blt.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != det.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               atj $$15;
               if ($$12.b() instanceof cyt $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = atk.cJ;
               }

               $$0.a($$4, $$11, $$15, atl.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dix $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bnv $$19 = $$2.equals($$4.c(bnv.b)) ? bnv.b : bnv.a;
                     $$2.a(1, $$1, $$19);
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

   private enq a(chh $$0) {
      return cib.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), $$0.gt());
   }

   private void a(cvn $$0, eno $$1, dlf $$2, ens $$3, boa $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == boa.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jr $$8 = new jr(jz.c, $$2);
      ie $$9 = $$1.b();
      cmz.a $$10 = cmz.a.a($$3, $$9);
      ens $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ie.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ie.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cmz.a a(ens $$0, ie $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cmz.a($$0.c(), 0.0, -$$0.a());
            case c -> new cmz.a(1.0, 0.0, -0.1);
            case d -> new cmz.a(-1.0, 0.0, 0.1);
            case e -> new cmz.a(-0.1, 0.0, -1.0);
            case f -> new cmz.a(0.1, 0.0, 1.0);
         };
      }
   }
}
