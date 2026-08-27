public class cpx extends crn {
   public static final int a = 10;
   private static final int b = 200;

   public cpx(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      cka $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == esh.a.b) {
         $$1.c($$0.p());
      }

      return bof.b;
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.j;
   }

   @Override
   public int b(crs $$0) {
      return 200;
   }

   @Override
   public void a(czg $$0, bqt $$1, crs $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cka $$4) {
         esh $$6 = this.a($$4);
         if ($$6 instanceof esf $$7 && $$6.c() == esh.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               id $$11 = $$7.a();
               dpi $$12 = $$0.a_($$11);
               bqn $$13 = $$1.ft() == boe.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != dim.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aun $$15;
               if ($$12.b() instanceof dcm $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = auo.cS;
               }

               $$0.a($$4, $$11, $$15, aup.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dms $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bqh $$19 = $$2.equals($$4.d(bqh.b)) ? bqh.b : bqh.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fx();
      } else {
         $$1.fx();
      }
   }

   private esh a(cka $$0) {
      return cku.a($$0, $$0x -> !$$0x.N_() && $$0x.bw(), $$0.gz());
   }

   private void a(czg $$0, esf $$1, dpi $$2, esj $$3, bqn $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bqn.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      kf $$8 = new kf(kn.c, $$2);
      ij $$9 = $$1.b();
      cpx.a $$10 = cpx.a.a($$3, $$9);
      esj $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ij.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ij.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cpx.a a(esj $$0, ij $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cpx.a($$0.c(), 0.0, -$$0.a());
            case c -> new cpx.a(1.0, 0.0, -0.1);
            case d -> new cpx.a(-1.0, 0.0, 0.1);
            case e -> new cpx.a(-0.1, 0.0, -1.0);
            case f -> new cpx.a(0.1, 0.0, 1.0);
         };
      }
   }
}
