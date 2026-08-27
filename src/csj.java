public class csj extends cuc {
   public static final int a = 10;
   private static final int b = 200;

   public csj(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      cly $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ews.a.b) {
         $$1.c($$0.p());
      }

      return bqa.b;
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.j;
   }

   @Override
   public int b(cuh $$0) {
      return 200;
   }

   @Override
   public void a(dca $$0, bso $$1, cuh $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cly $$4) {
         ews $$6 = this.a($$4);
         if ($$6 instanceof ewq $$7 && $$6.c() == ews.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ir $$11 = $$7.a();
               dtc $$12 = $$0.a_($$11);
               bsi $$13 = $$1.fF() == bpz.a ? $$4.fD() : $$4.fD().e();
               if ($$12.z() && $$12.l() != dlw.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avn $$15;
               if ($$12.b() instanceof dfh $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avo.cX;
               }

               $$0.a($$4, $$11, $$15, avq.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dqg $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsc $$19 = $$2.equals($$4.d(bsc.b)) ? bsc.b : bsc.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fJ();
      } else {
         $$1.fJ();
      }
   }

   private ews a(cly $$0) {
      return cmu.a($$0, $$0x -> !$$0x.O_() && $$0x.bE(), $$0.gN());
   }

   private void a(dca $$0, ewq $$1, dtc $$2, ewu $$3, bsi $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bsi.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      ks $$8 = new ks(lb.b, $$2);
      iw $$9 = $$1.b();
      csj.a $$10 = csj.a.a($$3, $$9);
      ewu $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == iw.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == iw.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static csj.a a(ewu $$0, iw $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csj.a($$0.c(), 0.0, -$$0.a());
            case c -> new csj.a(1.0, 0.0, -0.1);
            case d -> new csj.a(-1.0, 0.0, 0.1);
            case e -> new csj.a(-0.1, 0.0, -1.0);
            case f -> new csj.a(0.1, 0.0, 1.0);
         };
      }
   }
}
