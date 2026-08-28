public class cuy extends cwj {
   public static final int a = 10;
   private static final int b = 200;

   public cuy(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      cov $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == faw.a.b) {
         $$1.c($$0.p());
      }

      return bsi.c;
   }

   @Override
   public cwp b(cwn $$0) {
      return cwp.j;
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      return 200;
   }

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cov $$4) {
         faw $$6 = this.a($$4);
         if ($$6 instanceof fau $$7 && $$6.d() == faw.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ji $$11 = $$7.b();
               dwv $$12 = $$0.a_($$11);
               buz $$13 = $$1.fA() == bsh.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dpv.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avy $$15;
               if ($$12.b() instanceof djq $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avz.cS;
               }

               $$0.a($$4, $$11, $$15, awa.e);
               if ($$0 instanceof arc $$17 && $$0.c_($$11) instanceof dub $$18) {
                  boolean $$19 = $$18.a($$0.ad(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bur $$20 = $$2.equals($$4.a(bur.b)) ? bur.b : bur.a;
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

   private faw a(cov $$0) {
      return cpq.a($$0, buo.h, $$0.gL());
   }

   private void a(dgg $$0, fau $$1, dwv $$2, fay $$3, buz $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == buz.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      ll $$8 = new ll(lt.b, $$2);
      jn $$9 = $$1.c();
      cuy.a $$10 = cuy.a.a($$3, $$9);
      fay $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jn.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jn.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.H_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.H_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cuy.a a(fay $$0, jn $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cuy.a($$0.c(), 0.0, -$$0.a());
            case c -> new cuy.a(1.0, 0.0, -0.1);
            case d -> new cuy.a(-1.0, 0.0, 0.1);
            case e -> new cuy.a(-0.1, 0.0, -1.0);
            case f -> new cuy.a(0.1, 0.0, 1.0);
         };
      }
   }
}
