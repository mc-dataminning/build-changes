public class com extends cqf {
   public static final int a = 10;
   private static final int b = 200;

   public com(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cis $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == epp.a.b) {
         $$1.c($$0.p());
      }

      return bnc.b;
   }

   @Override
   public csd c(cqk $$0) {
      return csd.j;
   }

   @Override
   public int b(cqk $$0) {
      return 200;
   }

   @Override
   public void a(cwz $$0, bpo $$1, cqk $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cis $$4) {
         epp $$6 = this.a($$4);
         if ($$6 instanceof epn $$7 && $$6.c() == epp.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ib $$11 = $$7.a();
               dmz $$12 = $$0.a_($$11);
               bpi $$13 = $$1.ft() == bnb.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != dgf.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               atx $$15;
               if ($$12.b() instanceof daf $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aty.cN;
               }

               $$0.a($$4, $$11, $$15, atz.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dkk $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bpd $$19 = $$2.equals($$4.d(bpd.b)) ? bpd.b : bpd.a;
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

   private epp a(cis $$0) {
      return cjm.a($$0, $$0x -> !$$0x.N_() && $$0x.bw(), $$0.gz());
   }

   private void a(cwz $$0, epn $$1, dmz $$2, epr $$3, bpi $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bpi.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      ju $$8 = new ju(kc.c, $$2);
      ih $$9 = $$1.b();
      com.a $$10 = com.a.a($$3, $$9);
      epr $$11 = $$1.e();

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

      public static com.a a(epr $$0, ih $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new com.a($$0.c(), 0.0, -$$0.a());
            case c -> new com.a(1.0, 0.0, -0.1);
            case d -> new com.a(-1.0, 0.0, 0.1);
            case e -> new com.a(-0.1, 0.0, -1.0);
            case f -> new com.a(0.1, 0.0, 1.0);
         };
      }
   }
}
