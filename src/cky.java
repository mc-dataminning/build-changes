public class cky extends cmt {
   public static final int a = 10;
   private static final int b = 200;

   public cky(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      cfi $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == elr.a.b) {
         $$1.c($$0.p());
      }

      return bkb.b;
   }

   @Override
   public cos c(cmy $$0) {
      return cos.j;
   }

   @Override
   public int b(cmy $$0) {
      return 200;
   }

   @Override
   public void a(ctp $$0, bml $$1, cmy $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cfi $$4) {
         elr $$6 = this.a($$4);
         if ($$6 instanceof elp $$7 && $$6.c() == elr.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hx $$11 = $$7.a();
               djh $$12 = $$0.a_($$11);
               bmf $$13 = $$1.fo() == bka.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dcv.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               arr $$15;
               if ($$12.b() instanceof cwv $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = ars.cu;
               }

               $$0.a($$4, $$11, $$15, art.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dgz $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bma $$19 = $$2.equals($$4.c(bma.b)) ? bma.b : bma.a;
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

   private elr a(cfi $$0) {
      return cgb.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), (double)cfi.v($$0.f()));
   }

   private void a(ctp $$0, elp $$1, djh $$2, elt $$3, bmf $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bmf.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jp $$8 = new jp(jx.c, $$2);
      ic $$9 = $$1.b();
      cky.a $$10 = cky.a.a($$3, $$9);
      elt $$11 = $$1.e();

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

      public static cky.a a(elt $$0, ic $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cky.a($$0.c(), 0.0, -$$0.a());
            case c -> new cky.a(1.0, 0.0, -0.1);
            case d -> new cky.a(-1.0, 0.0, 0.1);
            case e -> new cky.a(-0.1, 0.0, -1.0);
            case f -> new cky.a(0.1, 0.0, 1.0);
         };
      }
   }
}
