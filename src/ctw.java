public class ctw extends cvk {
   public static final int a = 10;
   private static final int b = 200;

   public ctw(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      cnu $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == eyq.a.b) {
         $$1.c($$0.p());
      }

      return brp.c;
   }

   @Override
   public cvr a(cvp $$0) {
      return cvr.j;
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      return 200;
   }

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cnu $$4) {
         eyq $$6 = this.a($$4);
         if ($$6 instanceof eyo $$7 && $$6.d() == eyq.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               je $$11 = $$7.b();
               duo $$12 = $$0.a_($$11);
               bue $$13 = $$1.fw() == bro.a ? $$4.fu() : $$4.fu().e();
               if ($$12.D() && $$12.o() != dnq.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awd $$15;
               if ($$12.b() instanceof dho $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awe.cS;
               }

               $$0.a($$4, $$11, $$15, awf.e);
               if (!$$0.w_() && $$0.c_($$11) instanceof drw $$17) {
                  boolean $$18 = $$17.a($$0.aa(), $$4, $$7.c());
                  if ($$18) {
                     btw $$19 = $$2.equals($$4.a(btw.b)) ? btw.b : btw.a;
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

   private eyq a(cnu $$0) {
      return coq.a($$0, btt.h, $$0.gC());
   }

   private void a(deg $$0, eyo $$1, duo $$2, eys $$3, bue $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bue.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lf $$8 = new lf(ln.b, $$2);
      jj $$9 = $$1.c();
      ctw.a $$10 = ctw.a.a($$3, $$9);
      eys $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jj.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jj.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ctw.a a(eys $$0, jj $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ctw.a($$0.c(), 0.0, -$$0.a());
            case c -> new ctw.a(1.0, 0.0, -0.1);
            case d -> new ctw.a(-1.0, 0.0, 0.1);
            case e -> new ctw.a(-0.1, 0.0, -1.0);
            case f -> new ctw.a(0.1, 0.0, 1.0);
         };
      }
   }
}
