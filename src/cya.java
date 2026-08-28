public class cya extends czj {
   public static final int a = 10;
   private static final int b = 200;

   public cya(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      crm $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ffa.a.b) {
         $$1.c($$0.p());
      }

      return bug.c;
   }

   @Override
   public czp b(czn $$0) {
      return czp.j;
   }

   @Override
   public int a(czn $$0, bxj $$1) {
      return 200;
   }

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof crm $$4) {
         ffa $$6 = this.a($$4);
         if ($$6 instanceof fey $$7 && $$6.d() == ffa.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iv $$11 = $$7.b();
               eat $$12 = $$0.a_($$11);
               bxa $$13 = $$1.fz() == buf.a ? $$4.fx() : $$4.fx().e();
               if ($$12.D() && $$12.o() != dte.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awm $$15;
               if ($$12.b() instanceof dmx $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awn.cS;
               }

               $$0.a($$4, $$11, $$15, awo.e);
               if ($$0 instanceof arq $$17 && $$0.c_($$11) instanceof dxw $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bws $$20 = $$2.equals($$4.a(bws.b)) ? bws.b : bws.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fD();
      } else {
         $$1.fD();
      }
   }

   private ffa a(crm $$0) {
      return csj.a($$0, bwp.h, $$0.gK());
   }

   private void a(djm $$0, fey $$1, eat $$2, ffc $$3, bxa $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bxa.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lq $$8 = new lq(ly.b, $$2);
      jb $$9 = $$1.c();
      cya.a $$10 = cya.a.a($$3, $$9);
      ffc $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jb.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jb.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cya.a a(ffc $$0, jb $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cya.a($$0.c(), 0.0, -$$0.a());
            case c -> new cya.a(1.0, 0.0, -0.1);
            case d -> new cya.a(-1.0, 0.0, 0.1);
            case e -> new cya.a(-0.1, 0.0, -1.0);
            case f -> new cya.a(0.1, 0.0, 1.0);
         };
      }
   }
}
