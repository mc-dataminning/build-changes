public class cxq extends cyz {
   public static final int a = 10;
   private static final int b = 200;

   public cxq(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      crc $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == feo.a.b) {
         $$1.c($$0.p());
      }

      return bud.c;
   }

   @Override
   public czf b(czd $$0) {
      return czf.j;
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      return 200;
   }

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof crc $$4) {
         feo $$6 = this.a($$4);
         if ($$6 instanceof fem $$7 && $$6.d() == feo.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iu $$11 = $$7.b();
               eah $$12 = $$0.a_($$11);
               bwx $$13 = $$1.fA() == buc.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dss.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awm $$15;
               if ($$12.b() instanceof dml $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awn.cS;
               }

               $$0.a($$4, $$11, $$15, awo.e);
               if ($$0 instanceof arq $$17 && $$0.c_($$11) instanceof dxk $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bwp $$20 = $$2.equals($$4.a(bwp.b)) ? bwp.b : bwp.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fE();
      } else {
         $$1.fE();
      }
   }

   private feo a(crc $$0) {
      return crz.a($$0, bwm.h, $$0.gL());
   }

   private void a(dja $$0, fem $$1, eah $$2, feq $$3, bwx $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bwx.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lp $$8 = new lp(lx.b, $$2);
      ja $$9 = $$1.c();
      cxq.a $$10 = cxq.a.a($$3, $$9);
      feq $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == ja.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == ja.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cxq.a a(feq $$0, ja $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cxq.a($$0.c(), 0.0, -$$0.a());
            case c -> new cxq.a(1.0, 0.0, -0.1);
            case d -> new cxq.a(-1.0, 0.0, 0.1);
            case e -> new cxq.a(-0.1, 0.0, -1.0);
            case f -> new cxq.a(0.1, 0.0, 1.0);
         };
      }
   }
}
