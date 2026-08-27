public class cha extends civ {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(all.d) - 1.0;

   public cha(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cbp $$1 = $$0.o();
      if ($$1 != null && this.a((bjb)$$1).c() == ehg.a.b) {
         $$1.c($$0.p());
      }

      return bgt.b;
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.j;
   }

   @Override
   public int b(cja $$0) {
      return 200;
   }

   @Override
   public void a(cpq $$0, bjb $$1, cja $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cbp $$4) {
         ehg $$6 = this.a($$1);
         if ($$6 instanceof ehe $$7 && $$6.c() == ehg.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gw $$11 = $$7.a();
               dfe $$12 = $$0.a_($$11);
               biv $$13 = $$1.fm() == bgs.a ? $$4.fk() : $$4.fk().e();
               if ($$12.z() && $$12.l() != cyv.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aoy $$15;
               if ($$12.b() instanceof csu $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = aoz.cl;
               }

               $$0.a($$4, $$11, $$15, apa.e);
               if (!$$0.r_() && $$0.c_($$11) instanceof dcu $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     biq $$19 = $$2.equals($$4.c(biq.b)) ? biq.b : biq.a;
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

   private ehg a(bjb $$0) {
      return cci.a($$0, $$0x -> !$$0x.G_() && $$0x.br(), c);
   }

   private void a(cpq $$0, ehe $$1, dfe $$2, ehi $$3, biv $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == biv.b ? 1 : -1;
      int $$7 = $$0.y_().b(7, 12);
      ip $$8 = new ip(ix.c, $$2);
      hc $$9 = $$1.b();
      cha.a $$10 = cha.a.a($$3, $$9);
      ehi $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == hc.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == hc.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.y_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.y_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cha.a a(ehi $$0, hc $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cha.a($$0.c(), 0.0, -$$0.a());
            case c -> new cha.a(1.0, 0.0, -0.1);
            case d -> new cha.a(-1.0, 0.0, 0.1);
            case e -> new cha.a(-0.1, 0.0, -1.0);
            case f -> new cha.a(0.1, 0.0, 1.0);
         };
      }
   }
}
