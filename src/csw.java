public class csw extends cum {
   public static final int a = 10;
   private static final int b = 200;

   public csw(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      cmz $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evr.a.b) {
         $$1.c($$0.p());
      }

      return bqw.c;
   }

   @Override
   public cwm c(cur $$0) {
      return cwm.j;
   }

   @Override
   public int b(cur $$0) {
      return 200;
   }

   @Override
   public void a(dca $$0, btr $$1, cur $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmz $$4) {
         evr $$6 = this.a($$4);
         if ($$6 instanceof evp $$7 && $$6.c() == evr.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               dse $$12 = $$0.a_($$11);
               btl $$13 = $$1.fw() == bqv.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dlh.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof dfg $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpn $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     btd $$19 = $$2.equals($$4.a(btd.b)) ? btd.b : btd.a;
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

   private evr a(cmz $$0) {
      return cnt.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dca $$0, evp $$1, dse $$2, evt $$3, btl $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btl.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(li.b, $$2);
      je $$9 = $$1.b();
      csw.a $$10 = csw.a.a($$3, $$9);
      evt $$11 = $$1.e();

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

      public static csw.a a(evt $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csw.a($$0.c(), 0.0, -$$0.a());
            case c -> new csw.a(1.0, 0.0, -0.1);
            case d -> new csw.a(-1.0, 0.0, 0.1);
            case e -> new csw.a(-0.1, 0.0, -1.0);
            case f -> new csw.a(0.1, 0.0, 1.0);
         };
      }
   }
}
