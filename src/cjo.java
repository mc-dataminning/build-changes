public class cjo extends clj {
   public static final int a = 10;
   private static final int b = 200;

   public cjo(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      cdz $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ejx.a.b) {
         $$1.c($$0.p());
      }

      return bjb.b;
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.j;
   }

   @Override
   public int b(clo $$0) {
      return 200;
   }

   @Override
   public void a(csf $$0, bll $$1, clo $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cdz $$4) {
         ejx $$6 = this.a($$4);
         if ($$6 instanceof ejv $$7 && $$6.c() == ejx.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hx $$11 = $$7.a();
               dhn $$12 = $$0.a_($$11);
               blf $$13 = $$1.fp() == bja.a ? $$4.fn() : $$4.fn().e();
               if ($$12.z() && $$12.l() != dbk.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aqu $$15;
               if ($$12.b() instanceof cvk $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aqv.cl;
               }

               $$0.a($$4, $$11, $$15, aqw.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dfm $$17) {
                  boolean $$18 = $$17.a($$0.W(), $$4, $$7.b());
                  if ($$18) {
                     bla $$19 = $$2.equals($$4.c(bla.b)) ? bla.b : bla.a;
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

   private ejx a(cdz $$0) {
      return ces.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), (double)cdz.v($$0.f()));
   }

   private void a(csf $$0, ejv $$1, dhn $$2, ejz $$3, blf $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == blf.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jo $$8 = new jo(jw.c, $$2);
      ib $$9 = $$1.b();
      cjo.a $$10 = cjo.a.a($$3, $$9);
      ejz $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ib.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ib.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cjo.a a(ejz $$0, ib $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cjo.a($$0.c(), 0.0, -$$0.a());
            case c -> new cjo.a(1.0, 0.0, -0.1);
            case d -> new cjo.a(-1.0, 0.0, 0.1);
            case e -> new cjo.a(-0.1, 0.0, -1.0);
            case f -> new cjo.a(0.1, 0.0, 1.0);
         };
      }
   }
}
