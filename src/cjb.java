public class cjb extends ckw {
   public static final int a = 10;
   private static final int b = 200;

   public cjb(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      cdm $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ejg.a.b) {
         $$1.c($$0.p());
      }

      return biq.b;
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.j;
   }

   @Override
   public int b(clb $$0) {
      return 200;
   }

   @Override
   public void a(crs $$0, bky $$1, clb $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cdm $$4) {
         ejg $$6 = this.a($$4);
         if ($$6 instanceof eje $$7 && $$6.c() == ejg.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ht $$11 = $$7.a();
               dgw $$12 = $$0.a_($$11);
               bks $$13 = $$1.fo() == bip.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != day.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aqm $$15;
               if ($$12.b() instanceof cuy $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aqn.cl;
               }

               $$0.a($$4, $$11, $$15, aqo.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dev $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bkn $$19 = $$2.equals($$4.c(bkn.b)) ? bkn.b : bkn.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fs();
      } else {
         $$1.fs();
      }
   }

   private ejg a(cdm $$0) {
      return cef.a($$0, $$0x -> !$$0x.N_() && $$0x.br(), (double)cdm.v($$0.f()));
   }

   private void a(crs $$0, eje $$1, dgw $$2, eji $$3, bks $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bks.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      jk $$8 = new jk(js.c, $$2);
      hx $$9 = $$1.b();
      cjb.a $$10 = cjb.a.a($$3, $$9);
      eji $$11 = $$1.e();

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

      public static cjb.a a(eji $$0, hx $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cjb.a($$0.c(), 0.0, -$$0.a());
            case c -> new cjb.a(1.0, 0.0, -0.1);
            case d -> new cjb.a(-1.0, 0.0, 0.1);
            case e -> new cjb.a(-0.1, 0.0, -1.0);
            case f -> new cjb.a(0.1, 0.0, 1.0);
         };
      }
   }
}
