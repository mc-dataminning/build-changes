public class css extends cui {
   public static final int a = 10;
   private static final int b = 200;

   public css(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      cmv $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evn.a.b) {
         $$1.c($$0.p());
      }

      return bqs.c;
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.j;
   }

   @Override
   public int b(cun $$0) {
      return 200;
   }

   @Override
   public void a(dbw $$0, btn $$1, cun $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmv $$4) {
         evn $$6 = this.a($$4);
         if ($$6 instanceof evl $$7 && $$6.c() == evn.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               dsa $$12 = $$0.a_($$11);
               bth $$13 = $$1.fw() == bqr.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dld.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avy $$15;
               if ($$12.b() instanceof dfc $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avz.cS;
               }

               $$0.a($$4, $$11, $$15, awa.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpj $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsz $$19 = $$2.equals($$4.a(bsz.b)) ? bsz.b : bsz.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fA();
      } else {
         $$1.fA();
      }
   }

   private evn a(cmv $$0) {
      return cnp.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dbw $$0, evl $$1, dsa $$2, evp $$3, bth $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bth.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(li.b, $$2);
      je $$9 = $$1.b();
      css.a $$10 = css.a.a($$3, $$9);
      evp $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == je.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == je.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static css.a a(evp $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new css.a($$0.c(), 0.0, -$$0.a());
            case c -> new css.a(1.0, 0.0, -0.1);
            case d -> new css.a(-1.0, 0.0, 0.1);
            case e -> new css.a(-0.1, 0.0, -1.0);
            case f -> new css.a(0.1, 0.0, 1.0);
         };
      }
   }
}
