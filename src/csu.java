public class csu extends cul {
   public static final int a = 10;
   private static final int b = 200;

   public csu(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      cmx $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == exa.a.b) {
         $$1.c($$0.p());
      }

      return bqr.c;
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.j;
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return 200;
   }

   @Override
   public void a(dcw $$0, btn $$1, cuq $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmx $$4) {
         exa $$6 = this.a($$4);
         if ($$6 instanceof ewy $$7 && $$6.c() == exa.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jd $$11 = $$7.a();
               dtc $$12 = $$0.a_($$11);
               btg $$13 = $$1.fs() == bqq.a ? $$4.fq() : $$4.fq().e();
               if ($$12.z() && $$12.l() != dmf.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avo $$15;
               if ($$12.b() instanceof dgd $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avp.cS;
               }

               $$0.a($$4, $$11, $$15, avq.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dql $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsy $$19 = $$2.equals($$4.a(bsy.b)) ? bsy.b : bsy.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fw();
      } else {
         $$1.fw();
      }
   }

   private exa a(cmx $$0) {
      return cnr.a($$0, $$0x -> !$$0x.R_() && $$0x.bA(), $$0.gy());
   }

   private void a(dcw $$0, ewy $$1, dtc $$2, exc $$3, btg $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btg.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      le $$8 = new le(lm.b, $$2);
      ji $$9 = $$1.b();
      csu.a $$10 = csu.a.a($$3, $$9);
      exc $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ji.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ji.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static csu.a a(exc $$0, ji $$1) {
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
