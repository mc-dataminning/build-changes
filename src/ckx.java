public class ckx extends cms {
   public static final int a = 10;
   private static final int b = 200;

   public ckx(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cfh $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == elq.a.b) {
         $$1.c($$0.p());
      }

      return bka.b;
   }

   @Override
   public cor c(cmx $$0) {
      return cor.j;
   }

   @Override
   public int b(cmx $$0) {
      return 200;
   }

   @Override
   public void a(cto $$0, bmk $$1, cmx $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cfh $$4) {
         elq $$6 = this.a($$4);
         if ($$6 instanceof elo $$7 && $$6.c() == elq.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hx $$11 = $$7.a();
               djg $$12 = $$0.a_($$11);
               bme $$13 = $$1.fo() == bjz.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dcu.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               arq $$15;
               if ($$12.b() instanceof cwu $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = arr.cu;
               }

               $$0.a($$4, $$11, $$15, ars.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dgy $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     blz $$19 = $$2.equals($$4.c(blz.b)) ? blz.b : blz.a;
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

   private elq a(cfh $$0) {
      return cga.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), (double)cfh.v($$0.f()));
   }

   private void a(cto $$0, elo $$1, djg $$2, els $$3, bme $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bme.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jp $$8 = new jp(jx.c, $$2);
      ic $$9 = $$1.b();
      ckx.a $$10 = ckx.a.a($$3, $$9);
      els $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ic.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ic.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ckx.a a(els $$0, ic $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ckx.a($$0.c(), 0.0, -$$0.a());
            case c -> new ckx.a(1.0, 0.0, -0.1);
            case d -> new ckx.a(-1.0, 0.0, 0.1);
            case e -> new ckx.a(-0.1, 0.0, -1.0);
            case f -> new ckx.a(0.1, 0.0, 1.0);
         };
      }
   }
}
