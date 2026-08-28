public class cvr extends cxc {
   public static final int a = 10;
   private static final int b = 200;

   public cvr(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      cpo $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fbp.a.b) {
         $$1.c($$0.p());
      }

      return bta.c;
   }

   @Override
   public cxi b(cxg $$0) {
      return cxi.j;
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      return 200;
   }

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cpo $$4) {
         fbp $$6 = this.a($$4);
         if ($$6 instanceof fbn $$7 && $$6.d() == fbp.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jh $$11 = $$7.b();
               dxo $$12 = $$0.a_($$11);
               bvr $$13 = $$1.fA() == bsz.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dqo.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awu $$15;
               if ($$12.b() instanceof dkj $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awv.cS;
               }

               $$0.a($$4, $$11, $$15, aww.e);
               if ($$0 instanceof arx $$17 && $$0.c_($$11) instanceof duu $$18) {
                  boolean $$19 = $$18.a($$0.ad(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bvj $$20 = $$2.equals($$4.a(bvj.b)) ? bvj.b : bvj.a;
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

   private fbp a(cpo $$0) {
      return cqj.a($$0, bvg.h, $$0.gJ());
   }

   private void a(dgz $$0, fbn $$1, dxo $$2, fbr $$3, bvr $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvr.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      lk $$8 = new lk(ls.b, $$2);
      jm $$9 = $$1.c();
      cvr.a $$10 = cvr.a.a($$3, $$9);
      fbr $$11 = $$1.g();

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

      public static cvr.a a(fbr $$0, jm $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cvr.a($$0.c(), 0.0, -$$0.a());
            case c -> new cvr.a(1.0, 0.0, -0.1);
            case d -> new cvr.a(-1.0, 0.0, 0.1);
            case e -> new cvr.a(-0.1, 0.0, -1.0);
            case f -> new cvr.a(0.1, 0.0, 1.0);
         };
      }
   }
}
