public class cjj extends cle {
   public static final int a = 10;
   private static final int b = 200;

   public cjj(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      cdu $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ejs.a.b) {
         $$1.c($$0.p());
      }

      return bix.b;
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.j;
   }

   @Override
   public int b(clj $$0) {
      return 200;
   }

   @Override
   public void a(csa $$0, blg $$1, clj $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cdu $$4) {
         ejs $$6 = this.a($$4);
         if ($$6 instanceof ejq $$7 && $$6.c() == ejs.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ht $$11 = $$7.a();
               dhi $$12 = $$0.a_($$11);
               bla $$13 = $$1.fp() == biw.a ? $$4.fn() : $$4.fn().e();
               if ($$12.z() && $$12.l() != dbf.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aqq $$15;
               if ($$12.b() instanceof cvf $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aqr.cl;
               }

               $$0.a($$4, $$11, $$15, aqs.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dfh $$17) {
                  boolean $$18 = $$17.a($$0.W(), $$4, $$7.b());
                  if ($$18) {
                     bkv $$19 = $$2.equals($$4.c(bkv.b)) ? bkv.b : bkv.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.ft();
      } else {
         $$1.ft();
      }
   }

   private ejs a(cdu $$0) {
      return cen.a($$0, $$0x -> !$$0x.O_() && $$0x.bt(), (double)cdu.v($$0.f()));
   }

   private void a(csa $$0, ejq $$1, dhi $$2, eju $$3, bla $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bla.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      jk $$8 = new jk(js.c, $$2);
      hx $$9 = $$1.b();
      cjj.a $$10 = cjj.a.a($$3, $$9);
      eju $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == hx.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == hx.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cjj.a a(eju $$0, hx $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cjj.a($$0.c(), 0.0, -$$0.a());
            case c -> new cjj.a(1.0, 0.0, -0.1);
            case d -> new cjj.a(-1.0, 0.0, 0.1);
            case e -> new cjj.a(-0.1, 0.0, -1.0);
            case f -> new cjj.a(0.1, 0.0, 1.0);
         };
      }
   }
}
