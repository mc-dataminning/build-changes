public class csh extends ctx {
   public static final int a = 10;
   private static final int b = 200;

   public csh(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      cmk $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ewd.a.b) {
         $$1.c($$0.p());
      }

      return bqg.c;
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.j;
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return 200;
   }

   @Override
   public void a(dcf $$0, btb $$1, cuc $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmk $$4) {
         ewd $$6 = this.a($$4);
         if ($$6 instanceof ewb $$7 && $$6.c() == ewd.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ja $$11 = $$7.a();
               dsk $$12 = $$0.a_($$11);
               bsv $$13 = $$1.ft() == bqf.a ? $$4.fr() : $$4.fr().e();
               if ($$12.z() && $$12.l() != dln.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avg $$15;
               if ($$12.b() instanceof dfm $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avh.cS;
               }

               $$0.a($$4, $$11, $$15, avi.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpt $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsn $$19 = $$2.equals($$4.a(bsn.b)) ? bsn.b : bsn.a;
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

   private ewd a(cmk $$0) {
      return cne.a($$0, $$0x -> !$$0x.N_() && $$0x.bA(), $$0.gz());
   }

   private void a(dcf $$0, ewb $$1, dsk $$2, ewf $$3, bsv $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bsv.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      lb $$8 = new lb(lj.b, $$2);
      jf $$9 = $$1.b();
      csh.a $$10 = csh.a.a($$3, $$9);
      ewf $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == jf.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == jf.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static csh.a a(ewf $$0, jf $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csh.a($$0.c(), 0.0, -$$0.a());
            case c -> new csh.a(1.0, 0.0, -0.1);
            case d -> new csh.a(-1.0, 0.0, 0.1);
            case e -> new csh.a(-0.1, 0.0, -1.0);
            case f -> new csh.a(0.1, 0.0, 1.0);
         };
      }
   }
}
