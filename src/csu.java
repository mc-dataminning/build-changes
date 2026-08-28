public class csu extends cuk {
   public static final int a = 10;
   private static final int b = 200;

   public csu(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      cmx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evp.a.b) {
         $$1.c($$0.p());
      }

      return bqu.c;
   }

   @Override
   public cwk c(cup $$0) {
      return cwk.j;
   }

   @Override
   public int b(cup $$0) {
      return 200;
   }

   @Override
   public void a(dby $$0, btp $$1, cup $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmx $$4) {
         evp $$6 = this.a($$4);
         if ($$6 instanceof evn $$7 && $$6.c() == evp.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               dsc $$12 = $$0.a_($$11);
               btj $$13 = $$1.fw() == bqt.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dlf.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof dfe $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpl $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     btb $$19 = $$2.equals($$4.a(btb.b)) ? btb.b : btb.a;
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

   private evp a(cmx $$0) {
      return cnr.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dby $$0, evn $$1, dsc $$2, evr $$3, btj $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btj.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(li.b, $$2);
      je $$9 = $$1.b();
      csu.a $$10 = csu.a.a($$3, $$9);
      evr $$11 = $$1.e();

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

      public static csu.a a(evr $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csu.a($$0.c(), 0.0, -$$0.a());
            case c -> new csu.a(1.0, 0.0, -0.1);
            case d -> new csu.a(-1.0, 0.0, 0.1);
            case e -> new csu.a(-0.1, 0.0, -1.0);
            case f -> new csu.a(0.1, 0.0, 1.0);
         };
      }
   }
}
