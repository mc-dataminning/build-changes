public class cop extends cqh {
   public static final int a = 10;
   private static final int b = 200;

   public cop(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      ciu $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == epr.a.b) {
         $$1.c($$0.p());
      }

      return bnd.b;
   }

   @Override
   public csf c(cqm $$0) {
      return csf.j;
   }

   @Override
   public int b(cqm $$0) {
      return 200;
   }

   @Override
   public void a(cxb $$0, bpp $$1, cqm $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof ciu $$4) {
         epr $$6 = this.a($$4);
         if ($$6 instanceof epp $$7 && $$6.c() == epr.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ib $$11 = $$7.a();
               dnb $$12 = $$0.a_($$11);
               bpj $$13 = $$1.ft() == bnc.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != dgh.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               atx $$15;
               if ($$12.b() instanceof dah $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = aty.cR;
               }

               $$0.a($$4, $$11, $$15, atz.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dkm $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bpe $$19 = $$2.equals($$4.d(bpe.b)) ? bpe.b : bpe.a;
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

   private epr a(ciu $$0) {
      return cjo.a($$0, $$0x -> !$$0x.N_() && $$0x.bw(), $$0.gz());
   }

   private void a(cxb $$0, epp $$1, dnb $$2, ept $$3, bpj $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bpj.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      ju $$8 = new ju(kc.c, $$2);
      ih $$9 = $$1.b();
      cop.a $$10 = cop.a.a($$3, $$9);
      ept $$11 = $$1.e();

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

      public static cop.a a(ept $$0, ih $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cop.a($$0.c(), 0.0, -$$0.a());
            case c -> new cop.a(1.0, 0.0, -0.1);
            case d -> new cop.a(-1.0, 0.0, 0.1);
            case e -> new cop.a(-0.1, 0.0, -1.0);
            case f -> new cop.a(0.1, 0.0, 1.0);
         };
      }
   }
}
