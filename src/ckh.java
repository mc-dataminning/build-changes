public class ckh extends cmc {
   public static final int a = 10;
   private static final int b = 200;

   public ckh(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      cer $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ekz.a.b) {
         $$1.c($$0.p());
      }

      return bjl.b;
   }

   @Override
   public coa c(cmh $$0) {
      return coa.j;
   }

   @Override
   public int b(cmh $$0) {
      return 200;
   }

   @Override
   public void a(csy $$0, blv $$1, cmh $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cer $$4) {
         ekz $$6 = this.a($$4);
         if ($$6 instanceof ekx $$7 && $$6.c() == ekz.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hv $$11 = $$7.a();
               dip $$12 = $$0.a_($$11);
               blp $$13 = $$1.fo() == bjk.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dce.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               arb $$15;
               if ($$12.b() instanceof cwe $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = arc.cu;
               }

               $$0.a($$4, $$11, $$15, ard.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dgh $$17) {
                  boolean $$18 = $$17.a($$0.W(), $$4, $$7.b());
                  if ($$18) {
                     blk $$19 = $$2.equals($$4.c(blk.b)) ? blk.b : blk.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fs();
      } else {
         $$1.fs();
      }
   }

   private ekz a(cer $$0) {
      return cfk.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), (double)cer.v($$0.f()));
   }

   private void a(csy $$0, ekx $$1, dip $$2, elb $$3, blp $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == blp.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jn $$8 = new jn(jv.c, $$2);
      ia $$9 = $$1.b();
      ckh.a $$10 = ckh.a.a($$3, $$9);
      elb $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ia.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ia.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ckh.a a(elb $$0, ia $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ckh.a($$0.c(), 0.0, -$$0.a());
            case c -> new ckh.a(1.0, 0.0, -0.1);
            case d -> new ckh.a(-1.0, 0.0, 0.1);
            case e -> new ckh.a(-0.1, 0.0, -1.0);
            case f -> new ckh.a(0.1, 0.0, 1.0);
         };
      }
   }
}
