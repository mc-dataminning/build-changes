public class cgw extends cir {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(alg.d) - 1.0;

   public cgw(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cbl $$1 = $$0.o();
      if ($$1 != null && this.a((biw)$$1).c() == ehd.a.b) {
         $$1.c($$0.p());
      }

      return bgo.b;
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.j;
   }

   @Override
   public int b(ciw $$0) {
      return 200;
   }

   @Override
   public void a(cpk $$0, biw $$1, ciw $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cbl $$4) {
         ehd $$6 = this.a($$1);
         if ($$6 instanceof ehb $$7 && $$6.c() == ehd.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gv $$11 = $$7.a();
               dey $$12 = $$0.a_($$11);
               biq $$13 = $$1.fm() == bgn.a ? $$4.fk() : $$4.fk().e();
               if ($$12.z() && $$12.l() != cyp.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aot $$15;
               if ($$12.b() instanceof cso $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = aou.cl;
               }

               $$0.a($$4, $$11, $$15, aov.e);
               if (!$$0.r_() && $$0.c_($$11) instanceof dco $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bil $$19 = $$2.equals($$4.c(bil.b)) ? bil.b : bil.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fq();
      } else {
         $$1.fq();
      }
   }

   private ehd a(biw $$0) {
      return cce.a($$0, $$0x -> !$$0x.G_() && $$0x.br(), c);
   }

   private void a(cpk $$0, ehb $$1, dey $$2, ehf $$3, biq $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == biq.b ? 1 : -1;
      int $$7 = $$0.y_().b(7, 12);
      io $$8 = new io(iw.c, $$2);
      hb $$9 = $$1.b();
      cgw.a $$10 = cgw.a.a($$3, $$9);
      ehf $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == hb.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == hb.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.y_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.y_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cgw.a a(ehf $$0, hb $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cgw.a($$0.c(), 0.0, -$$0.a());
            case c -> new cgw.a(1.0, 0.0, -0.1);
            case d -> new cgw.a(-1.0, 0.0, 0.1);
            case e -> new cgw.a(-0.1, 0.0, -1.0);
            case f -> new cgw.a(0.1, 0.0, 1.0);
         };
      }
   }
}
