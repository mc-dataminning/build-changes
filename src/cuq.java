public class cuq extends cwb {
   public static final int a = 10;
   private static final int b = 200;

   public cuq(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      cor $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ezp.a.b) {
         $$1.c($$0.p());
      }

      return bsh.c;
   }

   @Override
   public cwh b(cwf $$0) {
      return cwh.j;
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      return 200;
   }

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cor $$4) {
         ezp $$6 = this.a($$4);
         if ($$6 instanceof ezn $$7 && $$6.d() == ezp.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jh $$11 = $$7.b();
               dvo $$12 = $$0.a_($$11);
               buy $$13 = $$1.fD() == bsg.a ? $$4.fB() : $$4.fB().e();
               if ($$12.D() && $$12.o() != dop.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awn $$15;
               if ($$12.b() instanceof dio $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awo.cS;
               }

               $$0.a($$4, $$11, $$15, awp.e);
               if ($$0 instanceof arq $$17 && $$0.c_($$11) instanceof dsv $$18) {
                  boolean $$19 = $$18.a($$0.aa(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     buq $$20 = $$2.equals($$4.a(buq.b)) ? buq.b : buq.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fH();
      } else {
         $$1.fH();
      }
   }

   private ezp a(cor $$0) {
      return cpm.a($$0, bun.h, $$0.gM());
   }

   private void a(dff $$0, ezn $$1, dvo $$2, ezr $$3, buy $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == buy.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      lk $$8 = new lk(ls.b, $$2);
      jm $$9 = $$1.c();
      cuq.a $$10 = cuq.a.a($$3, $$9);
      ezr $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jm.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jm.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cuq.a a(ezr $$0, jm $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cuq.a($$0.c(), 0.0, -$$0.a());
            case c -> new cuq.a(1.0, 0.0, -0.1);
            case d -> new cuq.a(-1.0, 0.0, 0.1);
            case e -> new cuq.a(-0.1, 0.0, -1.0);
            case f -> new cuq.a(0.1, 0.0, 1.0);
         };
      }
   }
}
