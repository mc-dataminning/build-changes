public class cuz extends cwk {
   public static final int a = 10;
   private static final int b = 200;

   public cuz(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      cow $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fax.a.b) {
         $$1.c($$0.p());
      }

      return bsj.c;
   }

   @Override
   public cwq b(cwo $$0) {
      return cwq.j;
   }

   @Override
   public int a(cwo $$0, bvg $$1) {
      return 200;
   }

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cow $$4) {
         fax $$6 = this.a($$4);
         if ($$6 instanceof fav $$7 && $$6.d() == fax.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ji $$11 = $$7.b();
               dww $$12 = $$0.a_($$11);
               bva $$13 = $$1.fA() == bsi.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dpw.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof djr $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if ($$0 instanceof ard $$17 && $$0.c_($$11) instanceof duc $$18) {
                  boolean $$19 = $$18.a($$0.ad(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bus $$20 = $$2.equals($$4.a(bus.b)) ? bus.b : bus.a;
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

   private fax a(cow $$0) {
      return cpr.a($$0, bup.h, $$0.gL());
   }

   private void a(dgh $$0, fav $$1, dww $$2, faz $$3, bva $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bva.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      ll $$8 = new ll(lt.b, $$2);
      jn $$9 = $$1.c();
      cuz.a $$10 = cuz.a.a($$3, $$9);
      faz $$11 = $$1.g();

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

      public static cuz.a a(faz $$0, jn $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cuz.a($$0.c(), 0.0, -$$0.a());
            case c -> new cuz.a(1.0, 0.0, -0.1);
            case d -> new cuz.a(-1.0, 0.0, 0.1);
            case e -> new cuz.a(-0.1, 0.0, -1.0);
            case f -> new cuz.a(0.1, 0.0, 1.0);
         };
      }
   }
}
