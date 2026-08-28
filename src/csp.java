public class csp extends cuf {
   public static final int a = 10;
   private static final int b = 200;

   public csp(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      cms $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evk.a.b) {
         $$1.c($$0.p());
      }

      return bqp.c;
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.j;
   }

   @Override
   public int b(cuk $$0) {
      return 200;
   }

   @Override
   public void a(dbt $$0, btk $$1, cuk $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cms $$4) {
         evk $$6 = this.a($$4);
         if ($$6 instanceof evi $$7 && $$6.c() == evk.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               drx $$12 = $$0.a_($$11);
               bte $$13 = $$1.fw() == bqo.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dla.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avv $$15;
               if ($$12.b() instanceof dez $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avw.cS;
               }

               $$0.a($$4, $$11, $$15, avx.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpg $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsw $$19 = $$2.equals($$4.a(bsw.b)) ? bsw.b : bsw.a;
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

   private evk a(cms $$0) {
      return cnm.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dbt $$0, evi $$1, drx $$2, evm $$3, bte $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bte.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(lj.b, $$2);
      je $$9 = $$1.b();
      csp.a $$10 = csp.a.a($$3, $$9);
      evm $$11 = $$1.e();

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

      public static csp.a a(evm $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csp.a($$0.c(), 0.0, -$$0.a());
            case c -> new csp.a(1.0, 0.0, -0.1);
            case d -> new csp.a(-1.0, 0.0, 0.1);
            case e -> new csp.a(-0.1, 0.0, -1.0);
            case f -> new csp.a(0.1, 0.0, 1.0);
         };
      }
   }
}
