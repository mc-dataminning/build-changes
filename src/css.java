public class css extends cuj {
   public static final int a = 10;
   private static final int b = 200;

   public css(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      cmv $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ewu.a.b) {
         $$1.c($$0.p());
      }

      return bqq.c;
   }

   @Override
   public cwm b(cuo $$0) {
      return cwm.j;
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      return 200;
   }

   @Override
   public void a(dcu $$0, btl $$1, cuo $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmv $$4) {
         ewu $$6 = this.a($$4);
         if ($$6 instanceof ews $$7 && $$6.c() == ewu.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jd $$11 = $$7.a();
               dta $$12 = $$0.a_($$11);
               btf $$13 = $$1.ft() == bqp.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != dmd.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avn $$15;
               if ($$12.b() instanceof dgb $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avo.cS;
               }

               $$0.a($$4, $$11, $$15, avp.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dqj $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsx $$19 = $$2.equals($$4.a(bsx.b)) ? bsx.b : bsx.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fx();
      } else {
         $$1.fx();
      }
   }

   private ewu a(cmv $$0) {
      return cnp.a($$0, $$0x -> !$$0x.N_() && $$0x.bA(), $$0.gz());
   }

   private void a(dcu $$0, ews $$1, dta $$2, eww $$3, btf $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btf.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      le $$8 = new le(lm.b, $$2);
      ji $$9 = $$1.b();
      css.a $$10 = css.a.a($$3, $$9);
      eww $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ji.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ji.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static css.a a(eww $$0, ji $$1) {
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
