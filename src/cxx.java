public class cxx extends czg {
   public static final int a = 10;
   private static final int b = 200;

   public cxx(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      crj $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fev.a.b) {
         $$1.c($$0.p());
      }

      return bug.c;
   }

   @Override
   public czm b(czk $$0) {
      return czm.j;
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      return 200;
   }

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof crj $$4) {
         fev $$6 = this.a($$4);
         if ($$6 instanceof fet $$7 && $$6.d() == fev.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iv $$11 = $$7.b();
               eao $$12 = $$0.a_($$11);
               bxa $$13 = $$1.fz() == buf.a ? $$4.fx() : $$4.fx().e();
               if ($$12.D() && $$12.o() != dsz.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awm $$15;
               if ($$12.b() instanceof dms $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awn.cS;
               }

               $$0.a($$4, $$11, $$15, awo.e);
               if ($$0 instanceof arq $$17 && $$0.c_($$11) instanceof dxr $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bws $$20 = $$2.equals($$4.a(bws.b)) ? bws.b : bws.a;
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

   private fev a(crj $$0) {
      return csg.a($$0, bwp.h, $$0.gK());
   }

   private void a(djh $$0, fet $$1, eao $$2, fex $$3, bxa $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bxa.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lq $$8 = new lq(ly.b, $$2);
      jb $$9 = $$1.c();
      cxx.a $$10 = cxx.a.a($$3, $$9);
      fex $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jb.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jb.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cxx.a a(fex $$0, jb $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cxx.a($$0.c(), 0.0, -$$0.a());
            case c -> new cxx.a(1.0, 0.0, -0.1);
            case d -> new cxx.a(-1.0, 0.0, 0.1);
            case e -> new cxx.a(-0.1, 0.0, -1.0);
            case f -> new cxx.a(0.1, 0.0, 1.0);
         };
      }
   }
}
