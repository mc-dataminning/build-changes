public class cxl extends cyu {
   public static final int a = 10;
   private static final int b = 200;

   public cxl(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      cqy $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == feg.a.b) {
         $$1.c($$0.p());
      }

      return bub.c;
   }

   @Override
   public cza b(cyy $$0) {
      return cza.j;
   }

   @Override
   public int a(cyy $$0, bxc $$1) {
      return 200;
   }

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cqy $$4) {
         feg $$6 = this.a($$4);
         if ($$6 instanceof fee $$7 && $$6.d() == feg.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iu $$11 = $$7.b();
               dzz $$12 = $$0.a_($$11);
               bwv $$13 = $$1.fz() == bua.a ? $$4.fx() : $$4.fx().e();
               if ($$12.D() && $$12.o() != dsm.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awm $$15;
               if ($$12.b() instanceof dmg $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awn.cS;
               }

               $$0.a($$4, $$11, $$15, awo.e);
               if ($$0 instanceof arq $$17 && $$0.c_($$11) instanceof dxc $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bwn $$20 = $$2.equals($$4.a(bwn.b)) ? bwn.b : bwn.a;
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

   private feg a(cqy $$0) {
      return cru.a($$0, bwk.h, $$0.gK());
   }

   private void a(div $$0, fee $$1, dzz $$2, fei $$3, bwv $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bwv.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lp $$8 = new lp(lx.b, $$2);
      ja $$9 = $$1.c();
      cxl.a $$10 = cxl.a.a($$3, $$9);
      fei $$11 = $$1.g();

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

      public static cxl.a a(fei $$0, ja $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cxl.a($$0.c(), 0.0, -$$0.a());
            case c -> new cxl.a(1.0, 0.0, -0.1);
            case d -> new cxl.a(-1.0, 0.0, 0.1);
            case e -> new cxl.a(-0.1, 0.0, -1.0);
            case f -> new cxl.a(0.1, 0.0, 1.0);
         };
      }
   }
}
