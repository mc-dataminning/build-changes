public class cij extends cke {
   public static final int a = 10;
   private static final int b = 200;

   public cij(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      ccx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == eid.a.b) {
         $$1.c($$0.p());
      }

      return bib.b;
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.j;
   }

   @Override
   public int b(ckj $$0) {
      return 200;
   }

   @Override
   public void a(cqz $$0, bkj $$1, ckj $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof ccx $$4) {
         eid $$6 = this.a($$4);
         if ($$6 instanceof eib $$7 && $$6.c() == eid.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ht $$11 = $$7.a();
               dgb $$12 = $$0.a_($$11);
               bkd $$13 = $$1.fo() == bia.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dae.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aqc $$15;
               if ($$12.b() instanceof cuf $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aqd.cl;
               }

               $$0.a($$4, $$11, $$15, aqe.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof deb $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bjy $$19 = $$2.equals($$4.c(bjy.b)) ? bjy.b : bjy.a;
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

   private eid a(ccx $$0) {
      return cdq.a($$0, $$0x -> !$$0x.N_() && $$0x.br(), (double)ccx.v($$0.f()));
   }

   private void a(cqz $$0, eib $$1, dgb $$2, eif $$3, bkd $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bkd.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      jk $$8 = new jk(js.c, $$2);
      hx $$9 = $$1.b();
      cij.a $$10 = cij.a.a($$3, $$9);
      eif $$11 = $$1.e();

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

      public static cij.a a(eif $$0, hx $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cij.a($$0.c(), 0.0, -$$0.a());
            case c -> new cij.a(1.0, 0.0, -0.1);
            case d -> new cij.a(-1.0, 0.0, 0.1);
            case e -> new cij.a(-0.1, 0.0, -1.0);
            case f -> new cij.a(0.1, 0.0, 1.0);
         };
      }
   }
}
