public class cux extends cwi {
   public static final int a = 10;
   private static final int b = 200;

   public cux(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      cou $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ezw.a.b) {
         $$1.c($$0.p());
      }

      return bsk.c;
   }

   @Override
   public cwo b(cwm $$0) {
      return cwo.j;
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      return 200;
   }

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cou $$4) {
         ezw $$6 = this.a($$4);
         if ($$6 instanceof ezu $$7 && $$6.d() == ezw.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jh $$11 = $$7.b();
               dvv $$12 = $$0.a_($$11);
               bvb $$13 = $$1.fy() == bsj.a ? $$4.fw() : $$4.fw().e();
               if ($$12.D() && $$12.o() != dow.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awm $$15;
               if ($$12.b() instanceof div $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awn.cS;
               }

               $$0.a($$4, $$11, $$15, awo.e);
               if ($$0 instanceof arp $$17 && $$0.c_($$11) instanceof dtc $$18) {
                  boolean $$19 = $$18.a($$0.ab(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     but $$20 = $$2.equals($$4.a(but.b)) ? but.b : but.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fC();
      } else {
         $$1.fC();
      }
   }

   private ezw a(cou $$0) {
      return cpp.a($$0, buq.h, $$0.gH());
   }

   private void a(dfm $$0, ezu $$1, dvv $$2, ezy $$3, bvb $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvb.b ? 1 : -1;
      int $$7 = $$0.G_().b(7, 12);
      lk $$8 = new lk(ls.b, $$2);
      jm $$9 = $$1.c();
      cux.a $$10 = cux.a.a($$3, $$9);
      ezy $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jm.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jm.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.G_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.G_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cux.a a(ezy $$0, jm $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cux.a($$0.c(), 0.0, -$$0.a());
            case c -> new cux.a(1.0, 0.0, -0.1);
            case d -> new cux.a(-1.0, 0.0, 0.1);
            case e -> new cux.a(-0.1, 0.0, -1.0);
            case f -> new cux.a(0.1, 0.0, 1.0);
         };
      }
   }
}
