public class cxf extends cyo {
   public static final int a = 10;
   private static final int b = 200;

   public cxf(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      cqs $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fdu.a.b) {
         $$1.c($$0.p());
      }

      return bty.c;
   }

   @Override
   public cyu b(cys $$0) {
      return cyu.j;
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      return 200;
   }

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cqs $$4) {
         fdu $$6 = this.a($$4);
         if ($$6 instanceof fds $$7 && $$6.d() == fdu.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iu $$11 = $$7.b();
               dzo $$12 = $$0.a_($$11);
               bws $$13 = $$1.fz() == btx.a ? $$4.fx() : $$4.fx().e();
               if ($$12.D() && $$12.o() != dsf.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awk $$15;
               if ($$12.b() instanceof dma $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awl.cS;
               }

               $$0.a($$4, $$11, $$15, awm.e);
               if ($$0 instanceof aro $$17 && $$0.c_($$11) instanceof dws $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bwk $$20 = $$2.equals($$4.a(bwk.b)) ? bwk.b : bwk.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fD();
      } else {
         $$1.fD();
      }
   }

   private fdu a(cqs $$0) {
      return cro.a($$0, bwh.h, $$0.gK());
   }

   private void a(dip $$0, fds $$1, dzo $$2, fdw $$3, bws $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bws.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lp $$8 = new lp(lx.b, $$2);
      ja $$9 = $$1.c();
      cxf.a $$10 = cxf.a.a($$3, $$9);
      fdw $$11 = $$1.g();

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

      public static cxf.a a(fdw $$0, ja $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cxf.a($$0.c(), 0.0, -$$0.a());
            case c -> new cxf.a(1.0, 0.0, -0.1);
            case d -> new cxf.a(-1.0, 0.0, 0.1);
            case e -> new cxf.a(-0.1, 0.0, -1.0);
            case f -> new cxf.a(0.1, 0.0, 1.0);
         };
      }
   }
}
