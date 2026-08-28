public class cst extends cuj {
   public static final int a = 10;
   private static final int b = 200;

   public cst(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      cmw $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evo.a.b) {
         $$1.c($$0.p());
      }

      return bqt.c;
   }

   @Override
   public cwj c(cuo $$0) {
      return cwj.j;
   }

   @Override
   public int b(cuo $$0) {
      return 200;
   }

   @Override
   public void a(dbx $$0, bto $$1, cuo $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmw $$4) {
         evo $$6 = this.a($$4);
         if ($$6 instanceof evm $$7 && $$6.c() == evo.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iz $$11 = $$7.a();
               dsb $$12 = $$0.a_($$11);
               bti $$13 = $$1.fw() == bqs.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dle.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avy $$15;
               if ($$12.b() instanceof dfd $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avz.cS;
               }

               $$0.a($$4, $$11, $$15, awa.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpk $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bta $$19 = $$2.equals($$4.a(bta.b)) ? bta.b : bta.a;
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

   private evo a(cmw $$0) {
      return cnq.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dbx $$0, evm $$1, dsb $$2, evq $$3, bti $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bti.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      la $$8 = new la(li.b, $$2);
      je $$9 = $$1.b();
      cst.a $$10 = cst.a.a($$3, $$9);
      evq $$11 = $$1.e();

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

      public static cst.a a(evq $$0, je $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cst.a($$0.c(), 0.0, -$$0.a());
            case c -> new cst.a(1.0, 0.0, -0.1);
            case d -> new cst.a(-1.0, 0.0, 0.1);
            case e -> new cst.a(-0.1, 0.0, -1.0);
            case f -> new cst.a(0.1, 0.0, 1.0);
         };
      }
   }
}
