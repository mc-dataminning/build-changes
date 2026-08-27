public class ckr extends cmm {
   public static final int a = 10;
   private static final int b = 200;

   public ckr(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cfb $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == elk.a.b) {
         $$1.c($$0.p());
      }

      return bjv.b;
   }

   @Override
   public cok c(cmr $$0) {
      return cok.j;
   }

   @Override
   public int b(cmr $$0) {
      return 200;
   }

   @Override
   public void a(cti $$0, bmf $$1, cmr $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cfb $$4) {
         elk $$6 = this.a($$4);
         if ($$6 instanceof eli $$7 && $$6.c() == elk.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hx $$11 = $$7.a();
               dja $$12 = $$0.a_($$11);
               blz $$13 = $$1.fo() == bju.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dco.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               arl $$15;
               if ($$12.b() instanceof cwo $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = arm.cu;
               }

               $$0.a($$4, $$11, $$15, arn.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dgs $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     blu $$19 = $$2.equals($$4.c(blu.b)) ? blu.b : blu.a;
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

   private elk a(cfb $$0) {
      return cfu.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), (double)cfb.v($$0.f()));
   }

   private void a(cti $$0, eli $$1, dja $$2, elm $$3, blz $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == blz.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jp $$8 = new jp(jx.c, $$2);
      ic $$9 = $$1.b();
      ckr.a $$10 = ckr.a.a($$3, $$9);
      elm $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ic.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ic.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ckr.a a(elm $$0, ic $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ckr.a($$0.c(), 0.0, -$$0.a());
            case c -> new ckr.a(1.0, 0.0, -0.1);
            case d -> new ckr.a(-1.0, 0.0, 0.1);
            case e -> new ckr.a(-0.1, 0.0, -1.0);
            case f -> new ckr.a(0.1, 0.0, 1.0);
         };
      }
   }
}
