public class cva extends cwl {
   public static final int a = 10;
   private static final int b = 200;

   public cva(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dai $$0) {
      cox $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fay.a.b) {
         $$1.c($$0.p());
      }

      return bsk.c;
   }

   @Override
   public cwr b(cwp $$0) {
      return cwr.j;
   }

   @Override
   public int a(cwp $$0, bvh $$1) {
      return 200;
   }

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cox $$4) {
         fay $$6 = this.a($$4);
         if ($$6 instanceof faw $$7 && $$6.d() == fay.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ji $$11 = $$7.b();
               dwx $$12 = $$0.a_($$11);
               bvb $$13 = $$1.fA() == bsj.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dpx.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof djs $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if ($$0 instanceof ard $$17 && $$0.c_($$11) instanceof dud $$18) {
                  boolean $$19 = $$18.a($$0.ad(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     but $$20 = $$2.equals($$4.a(but.b)) ? but.b : but.a;
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

   private fay a(cox $$0) {
      return cps.a($$0, buq.h, $$0.gL());
   }

   private void a(dgi $$0, faw $$1, dwx $$2, fba $$3, bvb $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvb.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      ll $$8 = new ll(lt.b, $$2);
      jn $$9 = $$1.c();
      cva.a $$10 = cva.a.a($$3, $$9);
      fba $$11 = $$1.g();

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

      public static cva.a a(fba $$0, jn $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cva.a($$0.c(), 0.0, -$$0.a());
            case c -> new cva.a(1.0, 0.0, -0.1);
            case d -> new cva.a(-1.0, 0.0, 0.1);
            case e -> new cva.a(-0.1, 0.0, -1.0);
            case f -> new cva.a(0.1, 0.0, 1.0);
         };
      }
   }
}
