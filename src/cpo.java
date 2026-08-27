public class cpo extends cre {
   public static final int a = 10;
   private static final int b = 200;

   public cpo(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cjt $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ery.a.b) {
         $$1.c($$0.p());
      }

      return boa.b;
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.j;
   }

   @Override
   public int b(crj $$0) {
      return 200;
   }

   @Override
   public void a(cyx $$0, bqo $$1, crj $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cjt $$4) {
         ery $$6 = this.a($$4);
         if ($$6 instanceof erw $$7 && $$6.c() == ery.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ib $$11 = $$7.a();
               doz $$12 = $$0.a_($$11);
               bqi $$13 = $$1.ft() == bnz.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != did.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aul $$15;
               if ($$12.b() instanceof dcd $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aum.cS;
               }

               $$0.a($$4, $$11, $$15, aun.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dmj $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bqc $$19 = $$2.equals($$4.d(bqc.b)) ? bqc.b : bqc.a;
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

   private ery a(cjt $$0) {
      return ckn.a($$0, $$0x -> !$$0x.N_() && $$0x.bw(), $$0.gz());
   }

   private void a(cyx $$0, erw $$1, doz $$2, esa $$3, bqi $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bqi.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      kd $$8 = new kd(kl.c, $$2);
      ih $$9 = $$1.b();
      cpo.a $$10 = cpo.a.a($$3, $$9);
      esa $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ih.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ih.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cpo.a a(esa $$0, ih $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cpo.a($$0.c(), 0.0, -$$0.a());
            case c -> new cpo.a(1.0, 0.0, -0.1);
            case d -> new cpo.a(-1.0, 0.0, 0.1);
            case e -> new cpo.a(-0.1, 0.0, -1.0);
            case f -> new cpo.a(0.1, 0.0, 1.0);
         };
      }
   }
}
