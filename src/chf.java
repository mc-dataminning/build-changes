public class chf extends cja {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(alq.d) - 1.0;

   public chf(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cbu $$1 = $$0.o();
      if ($$1 != null && this.a((bjg)$$1).c() == ehl.a.b) {
         $$1.c($$0.p());
      }

      return bgy.b;
   }

   @Override
   public cky c(cjf $$0) {
      return cky.j;
   }

   @Override
   public int b(cjf $$0) {
      return 200;
   }

   @Override
   public void a(cpv $$0, bjg $$1, cjf $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cbu $$4) {
         ehl $$6 = this.a($$1);
         if ($$6 instanceof ehj $$7 && $$6.c() == ehl.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gw $$11 = $$7.a();
               dfj $$12 = $$0.a_($$11);
               bja $$13 = $$1.fn() == bgx.a ? $$4.fl() : $$4.fl().e();
               if ($$12.z() && $$12.l() != cza.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               apd $$15;
               if ($$12.b() instanceof csz $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = ape.cl;
               }

               $$0.a($$4, $$11, $$15, apf.e);
               if (!$$0.w_() && $$0.c_($$11) instanceof dcz $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     biv $$19 = $$2.equals($$4.c(biv.b)) ? biv.b : biv.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fr();
      } else {
         $$1.fr();
      }
   }

   private ehl a(bjg $$0) {
      return ccn.a($$0, $$0x -> !$$0x.M_() && $$0x.br(), c);
   }

   private void a(cpv $$0, ehj $$1, dfj $$2, ehn $$3, bja $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bja.b ? 1 : -1;
      int $$7 = $$0.D_().b(7, 12);
      ip $$8 = new ip(ix.c, $$2);
      hc $$9 = $$1.b();
      chf.a $$10 = chf.a.a($$3, $$9);
      ehn $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == hc.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == hc.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.D_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.D_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static chf.a a(ehn $$0, hc $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new chf.a($$0.c(), 0.0, -$$0.a());
            case c -> new chf.a(1.0, 0.0, -0.1);
            case d -> new chf.a(-1.0, 0.0, 0.1);
            case e -> new chf.a(-0.1, 0.0, -1.0);
            case f -> new chf.a(0.1, 0.0, 1.0);
         };
      }
   }
}
