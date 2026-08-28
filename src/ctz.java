public class ctz extends cvn {
   public static final int a = 10;
   private static final int b = 200;

   public ctz(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      cnx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == eyu.a.b) {
         $$1.c($$0.p());
      }

      return brs.c;
   }

   @Override
   public cvu a(cvs $$0) {
      return cvu.j;
   }

   @Override
   public int a(cvs $$0, bun $$1) {
      return 200;
   }

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cnx $$4) {
         eyu $$6 = this.a($$4);
         if ($$6 instanceof eys $$7 && $$6.d() == eyu.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jf $$11 = $$7.b();
               dus $$12 = $$0.a_($$11);
               buh $$13 = $$1.fw() == brr.a ? $$4.fu() : $$4.fu().e();
               if ($$12.D() && $$12.o() != dnt.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awf $$15;
               if ($$12.b() instanceof dhr $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awg.cS;
               }

               $$0.a($$4, $$11, $$15, awh.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof drz $$17) {
                  boolean $$18 = $$17.a($$0.aa(), $$4, $$7.c());
                  if ($$18) {
                     btz $$19 = $$2.equals($$4.a(btz.b)) ? btz.b : btz.a;
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

   private eyu a(cnx $$0) {
      return cot.a($$0, btw.h, $$0.gD());
   }

   private void a(dej $$0, eys $$1, dus $$2, eyw $$3, buh $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == buh.b ? 1 : -1;
      int $$7 = $$0.D_().b(7, 12);
      lg $$8 = new lg(lo.b, $$2);
      jk $$9 = $$1.c();
      ctz.a $$10 = ctz.a.a($$3, $$9);
      eyw $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jk.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jk.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.D_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.D_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ctz.a a(eyw $$0, jk $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ctz.a($$0.c(), 0.0, -$$0.a());
            case c -> new ctz.a(1.0, 0.0, -0.1);
            case d -> new ctz.a(-1.0, 0.0, 0.1);
            case e -> new ctz.a(-0.1, 0.0, -1.0);
            case f -> new ctz.a(0.1, 0.0, 1.0);
         };
      }
   }
}
