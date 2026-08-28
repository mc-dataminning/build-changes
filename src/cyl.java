public class cyl extends czu {
   public static final int a = 10;
   private static final int b = 200;

   public cyl(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      crx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ffo.a.b) {
         $$1.c($$0.p());
      }

      return bur.c;
   }

   @Override
   public daa b(czy $$0) {
      return daa.j;
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      return 200;
   }

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof crx $$4) {
         ffo $$6 = this.a($$4);
         if ($$6 instanceof ffm $$7 && $$6.d() == ffo.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iv $$11 = $$7.b();
               ebe $$12 = $$0.a_($$11);
               bxl $$13 = $$1.fA() == buq.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dtp.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awo $$15;
               if ($$12.b() instanceof dni $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awp.cS;
               }

               $$0.a($$4, $$11, $$15, awq.e);
               if ($$0 instanceof ars $$17 && $$0.c_($$11) instanceof dyh $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bxd $$20 = $$2.equals($$4.a(bxd.b)) ? bxd.b : bxd.a;
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

   private ffo a(crx $$0) {
      return csu.a($$0, bxa.h, $$0.gL());
   }

   private void a(djx $$0, ffm $$1, ebe $$2, ffq $$3, bxl $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bxl.b ? 1 : -1;
      int $$7 = $$0.G_().b(7, 12);
      lq $$8 = new lq(ly.b, $$2);
      jb $$9 = $$1.c();
      cyl.a $$10 = cyl.a.a($$3, $$9);
      ffq $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jb.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jb.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.G_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.G_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cyl.a a(ffq $$0, jb $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cyl.a($$0.c(), 0.0, -$$0.a());
            case c -> new cyl.a(1.0, 0.0, -0.1);
            case d -> new cyl.a(-1.0, 0.0, 0.1);
            case e -> new cyl.a(-0.1, 0.0, -1.0);
            case f -> new cyl.a(0.1, 0.0, 1.0);
         };
      }
   }
}
