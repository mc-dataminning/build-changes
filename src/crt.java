public class crt extends ctj {
   public static final int a = 10;
   private static final int b = 200;

   public crt(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      clw $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == eui.a.b) {
         $$1.c($$0.p());
      }

      return bpu.b;
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.j;
   }

   @Override
   public int b(cto $$0) {
      return 200;
   }

   @Override
   public void a(dax $$0, bso $$1, cto $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof clw $$4) {
         eui $$6 = this.a($$4);
         if ($$6 instanceof eug $$7 && $$6.c() == eui.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               io $$11 = $$7.a();
               drb $$12 = $$0.a_($$11);
               bsi $$13 = $$1.fw() == bpt.a ? $$4.fu() : $$4.fu().e();
               if ($$12.z() && $$12.l() != dke.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               avg $$15;
               if ($$12.b() instanceof ded $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avh.cS;
               }

               $$0.a($$4, $$11, $$15, avi.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dok $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bsb $$19 = $$2.equals($$4.a(bsb.b)) ? bsb.b : bsb.a;
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

   private eui a(clw $$0) {
      return cmq.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gC());
   }

   private void a(dax $$0, eug $$1, drb $$2, euk $$3, bsi $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bsi.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      kp $$8 = new kp(ky.b, $$2);
      it $$9 = $$1.b();
      crt.a $$10 = crt.a.a($$3, $$9);
      euk $$11 = $$1.e();

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

      public static crt.a a(euk $$0, it $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new crt.a($$0.c(), 0.0, -$$0.a());
            case c -> new crt.a(1.0, 0.0, -0.1);
            case d -> new crt.a(-1.0, 0.0, 0.1);
            case e -> new crt.a(-0.1, 0.0, -1.0);
            case f -> new crt.a(0.1, 0.0, 1.0);
         };
      }
   }
}
