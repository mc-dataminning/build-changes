public class cvt extends cxd {
   public static final int a = 10;
   private static final int b = 200;

   public cvt(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      cpr $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fbv.a.b) {
         $$1.c($$0.p());
      }

      return bsy.c;
   }

   @Override
   public cxj b(cxh $$0) {
      return cxj.j;
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      return 200;
   }

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cpr $$4) {
         fbv $$6 = this.a($$4);
         if ($$6 instanceof fbt $$7 && $$6.d() == fbv.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ji $$11 = $$7.b();
               dxq $$12 = $$0.a_($$11);
               bvr $$13 = $$1.fC() == bsx.a ? $$4.fA() : $$4.fA().e();
               if ($$12.D() && $$12.o() != dqp.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               avz $$15;
               if ($$12.b() instanceof dkk $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awa.cS;
               }

               $$0.a($$4, $$11, $$15, awb.e);
               if ($$0 instanceof ard $$17 && $$0.c_($$11) instanceof duw $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bvj $$20 = $$2.equals($$4.a(bvj.b)) ? bvj.b : bvj.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }

            return;
         }

         $$1.fG();
      } else {
         $$1.fG();
      }
   }

   private fbv a(cpr $$0) {
      return cqm.a($$0, bvg.h, $$0.gN());
   }

   private void a(dgz $$0, fbt $$1, dxq $$2, fbx $$3, bvr $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bvr.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      ll $$8 = new ll(lt.b, $$2);
      jn $$9 = $$1.c();
      cvt.a $$10 = cvt.a.a($$3, $$9);
      fbx $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jn.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jn.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cvt.a a(fbx $$0, jn $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cvt.a($$0.c(), 0.0, -$$0.a());
            case c -> new cvt.a(1.0, 0.0, -0.1);
            case d -> new cvt.a(-1.0, 0.0, 0.1);
            case e -> new cvt.a(-0.1, 0.0, -1.0);
            case f -> new cvt.a(0.1, 0.0, 1.0);
         };
      }
   }
}
