public class chh extends cjc {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(alr.d) - 1.0;

   public chh(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cbw $$1 = $$0.o();
      if ($$1 != null && this.a((bji)$$1).c() == ehn.a.b) {
         $$1.c($$0.p());
      }

      return bha.b;
   }

   @Override
   public cla c(cjh $$0) {
      return cla.j;
   }

   @Override
   public int b(cjh $$0) {
      return 200;
   }

   @Override
   public void a(cpx $$0, bji $$1, cjh $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cbw $$4) {
         ehn $$6 = this.a($$1);
         if ($$6 instanceof ehl $$7 && $$6.c() == ehn.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gw $$11 = $$7.a();
               dfl $$12 = $$0.a_($$11);
               bjc $$13 = $$1.fn() == bgz.a ? $$4.fl() : $$4.fl().e();
               if ($$12.z() && $$12.l() != czc.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               ape $$15;
               if ($$12.b() instanceof ctb $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = apf.cl;
               }

               $$0.a($$4, $$11, $$15, apg.e);
               if (!$$0.w_() && $$0.c_($$11) instanceof ddb $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bix $$19 = $$2.equals($$4.c(bix.b)) ? bix.b : bix.a;
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

   private ehn a(bji $$0) {
      return ccp.a($$0, $$0x -> !$$0x.M_() && $$0x.br(), c);
   }

   private void a(cpx $$0, ehl $$1, dfl $$2, ehp $$3, bjc $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bjc.b ? 1 : -1;
      int $$7 = $$0.D_().b(7, 12);
      ip $$8 = new ip(ix.c, $$2);
      hc $$9 = $$1.b();
      chh.a $$10 = chh.a.a($$3, $$9);
      ehp $$11 = $$1.e();

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

      public static chh.a a(ehp $$0, hc $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new chh.a($$0.c(), 0.0, -$$0.a());
            case c -> new chh.a(1.0, 0.0, -0.1);
            case d -> new chh.a(-1.0, 0.0, 0.1);
            case e -> new chh.a(-0.1, 0.0, -1.0);
            case f -> new chh.a(0.1, 0.0, 1.0);
         };
      }
   }
}
