public class csf extends ctv {
   public static final int a = 10;
   private static final int b = 200;

   public csf(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      cmh $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == evx.a.b) {
         $$1.c($$0.p());
      }

      return bqd.c;
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.j;
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 200;
   }

   @Override
   public void a(dcd $$0, bsy $$1, cua $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cmh $$4) {
         evx $$6 = this.a($$4);
         if ($$6 instanceof evv $$7 && $$6.c() == evx.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ja $$11 = $$7.a();
               dsh $$12 = $$0.a_($$11);
               bss $$13 = $$1.fs() == bqc.a ? $$4.fq() : $$4.fq().e();
               if ($$12.z() && $$12.l() != dll.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               ave $$15;
               if ($$12.b() instanceof dfk $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avf.cS;
               }

               $$0.a($$4, $$11, $$15, avg.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpr $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bsk $$19 = $$2.equals($$4.a(bsk.b)) ? bsk.b : bsk.a;
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

   private evx a(cmh $$0) {
      return cnb.a($$0, $$0x -> !$$0x.N_() && $$0x.bz(), $$0.gy());
   }

   private void a(dcd $$0, evv $$1, dsh $$2, evz $$3, bss $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bss.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      lb $$8 = new lb(lj.b, $$2);
      jf $$9 = $$1.b();
      csf.a $$10 = csf.a.a($$3, $$9);
      evz $$11 = $$1.e();

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

      public static csf.a a(evz $$0, jf $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csf.a($$0.c(), 0.0, -$$0.a());
            case c -> new csf.a(1.0, 0.0, -0.1);
            case d -> new csf.a(-1.0, 0.0, 0.1);
            case e -> new csf.a(-0.1, 0.0, -1.0);
            case f -> new csf.a(0.1, 0.0, 1.0);
         };
      }
   }
}
