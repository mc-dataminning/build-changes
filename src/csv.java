public class csv extends cul {
   public static final int a = 10;
   private static final int b = 200;

   public csv(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      cmy $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evq.a.b) {
         $$1.c($$0.p());
      }

      return bqv.c;
   }

   @Override
   public cwl c(cuq $$0) {
      return cwl.j;
   }

   @Override
   public int b(cuq $$0) {
      return 200;
   }

   @Override
   public void a(dbz $$0, btq $$1, cuq $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmy $$4) {
         evq $$6 = this.a($$4);
         if ($$6 instanceof evo $$7 && $$6.c() == evq.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               dsd $$12 = $$0.a_($$11);
               btk $$13 = $$1.fw() == bqu.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dlg.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof dff $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpm $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     btc $$19 = $$2.equals($$4.a(btc.b)) ? btc.b : btc.a;
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

   private evq a(cmy $$0) {
      return cns.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dbz $$0, evo $$1, dsd $$2, evs $$3, btk $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btk.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(li.b, $$2);
      je $$9 = $$1.b();
      csv.a $$10 = csv.a.a($$3, $$9);
      evs $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == je.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == je.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static csv.a a(evs $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csv.a($$0.c(), 0.0, -$$0.a());
            case c -> new csv.a(1.0, 0.0, -0.1);
            case d -> new csv.a(-1.0, 0.0, 0.1);
            case e -> new csv.a(-0.1, 0.0, -1.0);
            case f -> new csv.a(0.1, 0.0, 1.0);
         };
      }
   }
}
