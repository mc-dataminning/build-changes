public class chl extends cjg {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(als.d) - 1.0;

   public chl(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cca $$1 = $$0.o();
      if ($$1 != null && this.a((bjm)$$1).c() == ehf.a.b) {
         $$1.c($$0.p());
      }

      return bhe.b;
   }

   @Override
   public cle c(cjl $$0) {
      return cle.j;
   }

   @Override
   public int b(cjl $$0) {
      return 200;
   }

   @Override
   public void a(cqb $$0, bjm $$1, cjl $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cca $$4) {
         ehf $$6 = this.a($$1);
         if ($$6 instanceof ehd $$7 && $$6.c() == ehf.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gw $$11 = $$7.a();
               dfd $$12 = $$0.a_($$11);
               bjg $$13 = $$1.fo() == bhd.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != czg.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               apf $$15;
               if ($$12.b() instanceof cth $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = apg.cl;
               }

               $$0.a($$4, $$11, $$15, aph.e);
               if (!$$0.w_() && $$0.c_($$11) instanceof ddd $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bjb $$19 = $$2.equals($$4.c(bjb.b)) ? bjb.b : bjb.a;
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

   private ehf a(bjm $$0) {
      return cct.a($$0, $$0x -> !$$0x.M_() && $$0x.br(), c);
   }

   private void a(cqb $$0, ehd $$1, dfd $$2, ehh $$3, bjg $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bjg.b ? 1 : -1;
      int $$7 = $$0.D_().b(7, 12);
      in $$8 = new in(iv.c, $$2);
      ha $$9 = $$1.b();
      chl.a $$10 = chl.a.a($$3, $$9);
      ehh $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ha.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ha.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.D_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.D_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static chl.a a(ehh $$0, ha $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new chl.a($$0.c(), 0.0, -$$0.a());
            case c -> new chl.a(1.0, 0.0, -0.1);
            case d -> new chl.a(-1.0, 0.0, 0.1);
            case e -> new chl.a(-0.1, 0.0, -1.0);
            case f -> new chl.a(0.1, 0.0, 1.0);
         };
      }
   }
}
