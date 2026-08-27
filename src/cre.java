public class cre extends csu {
   public static final int a = 10;
   private static final int b = 200;

   public cre(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      clh $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == etn.a.b) {
         $$1.c($$0.p());
      }

      return bpm.b;
   }

   @Override
   public cus c(csz $$0) {
      return cus.j;
   }

   @Override
   public int b(csz $$0) {
      return 200;
   }

   @Override
   public void a(dad $$0, bsa $$1, csz $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof clh $$4) {
         etn $$6 = this.a($$4);
         if ($$6 instanceof etl $$7 && $$6.c() == etn.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               in $$11 = $$7.a();
               dqh $$12 = $$0.a_($$11);
               bru $$13 = $$1.fu() == bpl.a ? $$4.fs() : $$4.fs().e();
               if ($$12.z() && $$12.l() != djk.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avb $$15;
               if ($$12.b() instanceof ddj $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avc.cS;
               }

               $$0.a($$4, $$11, $$15, avd.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dnq $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bro $$19 = $$2.equals($$4.d(bro.b)) ? bro.b : bro.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fy();
      } else {
         $$1.fy();
      }
   }

   private etn a(clh $$0) {
      return cmb.a($$0, $$0x -> !$$0x.N_() && $$0x.bx(), $$0.gA());
   }

   private void a(dad $$0, etl $$1, dqh $$2, etp $$3, bru $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bru.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      ko $$8 = new ko(kx.b, $$2);
      is $$9 = $$1.b();
      cre.a $$10 = cre.a.a($$3, $$9);
      etp $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == is.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == is.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cre.a a(etp $$0, is $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cre.a($$0.c(), 0.0, -$$0.a());
            case c -> new cre.a(1.0, 0.0, -0.1);
            case d -> new cre.a(-1.0, 0.0, 0.1);
            case e -> new cre.a(-0.1, 0.0, -1.0);
            case f -> new cre.a(0.1, 0.0, 1.0);
         };
      }
   }
}
