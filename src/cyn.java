public class cyn extends czw {
   public static final int a = 10;
   private static final int b = 200;

   public cyn(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      crz $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ffq.a.b) {
         $$1.c($$0.p());
      }

      return but.c;
   }

   @Override
   public dac b(daa $$0) {
      return dac.j;
   }

   @Override
   public int a(daa $$0, bxw $$1) {
      return 200;
   }

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof crz $$4) {
         ffq $$6 = this.a($$4);
         if ($$6 instanceof ffo $$7 && $$6.d() == ffq.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iw $$11 = $$7.b();
               ebg $$12 = $$0.a_($$11);
               bxn $$13 = $$1.fA() == bus.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dtr.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awq $$15;
               if ($$12.b() instanceof dnk $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awr.cS;
               }

               $$0.a($$4, $$11, $$15, aws.e);
               if ($$0 instanceof aru $$17 && $$0.c_($$11) instanceof dyj $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bxf $$20 = $$2.equals($$4.a(bxf.b)) ? bxf.b : bxf.a;
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

   private ffq a(crz $$0) {
      return csw.a($$0, bxc.h, $$0.gL());
   }

   private void a(djz $$0, ffo $$1, ebg $$2, ffs $$3, bxn $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bxn.b ? 1 : -1;
      int $$7 = $$0.G_().b(7, 12);
      lr $$8 = new lr(lz.b, $$2);
      jc $$9 = $$1.c();
      cyn.a $$10 = cyn.a.a($$3, $$9);
      ffs $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jc.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jc.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.G_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.G_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cyn.a a(ffs $$0, jc $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cyn.a($$0.c(), 0.0, -$$0.a());
            case c -> new cyn.a(1.0, 0.0, -0.1);
            case d -> new cyn.a(-1.0, 0.0, 0.1);
            case e -> new cyn.a(-0.1, 0.0, -1.0);
            case f -> new cyn.a(0.1, 0.0, 1.0);
         };
      }
   }
}
