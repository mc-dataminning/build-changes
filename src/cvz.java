public class cvz extends cxk {
   public static final int a = 10;
   private static final int b = 200;

   public cvz(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      cpw $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fbv.a.b) {
         $$1.c($$0.p());
      }

      return bti.c;
   }

   @Override
   public cxq b(cxo $$0) {
      return cxq.j;
   }

   @Override
   public int a(cxo $$0, bwf $$1) {
      return 200;
   }

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cpw $$4) {
         fbv $$6 = this.a($$4);
         if ($$6 instanceof fbt $$7 && $$6.d() == fbv.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jh $$11 = $$7.b();
               dxu $$12 = $$0.a_($$11);
               bvz $$13 = $$1.fy() == bth.a ? $$4.fw() : $$4.fw().e();
               if ($$12.D() && $$12.o() != dqu.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               axe $$15;
               if ($$12.b() instanceof dkr $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = axf.cS;
               }

               $$0.a($$4, $$11, $$15, axg.e);
               if ($$0 instanceof ash $$17 && $$0.c_($$11) instanceof dva $$18) {
                  boolean $$19 = $$18.a($$0.ac(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bvr $$20 = $$2.equals($$4.a(bvr.b)) ? bvr.b : bvr.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fC();
      } else {
         $$1.fC();
      }
   }

   private fbv a(cpw $$0) {
      return cqr.a($$0, bvo.h, $$0.gH());
   }

   private void a(dhh $$0, fbt $$1, dxu $$2, fbx $$3, bvz $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvz.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      lk $$8 = new lk(ls.b, $$2);
      jm $$9 = $$1.c();
      cvz.a $$10 = cvz.a.a($$3, $$9);
      fbx $$11 = $$1.g();

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

      public static cvz.a a(fbx $$0, jm $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cvz.a($$0.c(), 0.0, -$$0.a());
            case c -> new cvz.a(1.0, 0.0, -0.1);
            case d -> new cvz.a(-1.0, 0.0, 0.1);
            case e -> new cvz.a(-0.1, 0.0, -1.0);
            case f -> new cvz.a(0.1, 0.0, 1.0);
         };
      }
   }
}
