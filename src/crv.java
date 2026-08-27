public class crv extends ctl {
   public static final int a = 10;
   private static final int b = 200;

   public crv(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      cly $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == euk.a.b) {
         $$1.c($$0.p());
      }

      return bpw.b;
   }

   @Override
   public cvl c(ctq $$0) {
      return cvl.j;
   }

   @Override
   public int b(ctq $$0) {
      return 200;
   }

   @Override
   public void a(daz $$0, bsq $$1, ctq $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cly $$4) {
         euk $$6 = this.a($$4);
         if ($$6 instanceof eui $$7 && $$6.c() == euk.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               io $$11 = $$7.a();
               drd $$12 = $$0.a_($$11);
               bsk $$13 = $$1.fw() == bpv.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dkg.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avh $$15;
               if ($$12.b() instanceof def $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avi.cS;
               }

               $$0.a($$4, $$11, $$15, avj.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dom $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bsd $$19 = $$2.equals($$4.a(bsd.b)) ? bsd.b : bsd.a;
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

   private euk a(cly $$0) {
      return cms.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(daz $$0, eui $$1, drd $$2, eum $$3, bsk $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bsk.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      kp $$8 = new kp(ky.b, $$2);
      it $$9 = $$1.b();
      crv.a $$10 = crv.a.a($$3, $$9);
      eum $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == it.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == it.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static crv.a a(eum $$0, it $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new crv.a($$0.c(), 0.0, -$$0.a());
            case c -> new crv.a(1.0, 0.0, -0.1);
            case d -> new crv.a(-1.0, 0.0, 0.1);
            case e -> new crv.a(-0.1, 0.0, -1.0);
            case f -> new crv.a(0.1, 0.0, 1.0);
         };
      }
   }
}
