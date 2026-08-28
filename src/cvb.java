public class cvb extends cwm {
   public static final int a = 10;
   private static final int b = 200;

   public cvb(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      coy $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == faz.a.b) {
         $$1.c($$0.p());
      }

      return bsl.c;
   }

   @Override
   public cws b(cwq $$0) {
      return cws.j;
   }

   @Override
   public int a(cwq $$0, bvi $$1) {
      return 200;
   }

   @Override
   public void a(dgj $$0, bvi $$1, cwq $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof coy $$4) {
         faz $$6 = this.a($$4);
         if ($$6 instanceof fax $$7 && $$6.d() == faz.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ji $$11 = $$7.b();
               dwy $$12 = $$0.a_($$11);
               bvc $$13 = $$1.fA() == bsk.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dpy.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof djt $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if ($$0 instanceof ard $$17 && $$0.c_($$11) instanceof due $$18) {
                  boolean $$19 = $$18.a($$0.ad(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     buu $$20 = $$2.equals($$4.a(buu.b)) ? buu.b : buu.a;
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

   private faz a(coy $$0) {
      return cpt.a($$0, bur.h, $$0.gL());
   }

   private void a(dgj $$0, fax $$1, dwy $$2, fbb $$3, bvc $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvc.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      ll $$8 = new ll(lt.b, $$2);
      jn $$9 = $$1.c();
      cvb.a $$10 = cvb.a.a($$3, $$9);
      fbb $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jn.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jn.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.H_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.H_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cvb.a a(fbb $$0, jn $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cvb.a($$0.c(), 0.0, -$$0.a());
            case c -> new cvb.a(1.0, 0.0, -0.1);
            case d -> new cvb.a(-1.0, 0.0, 0.1);
            case e -> new cvb.a(-0.1, 0.0, -1.0);
            case f -> new cvb.a(0.1, 0.0, 1.0);
         };
      }
   }
}
