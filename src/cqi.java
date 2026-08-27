public class cqi extends cry {
   public static final int a = 10;
   private static final int b = 200;

   public cqi(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      ckl $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == etd.a.b) {
         $$1.c($$0.p());
      }

      return boq.b;
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.j;
   }

   @Override
   public int b(csd $$0) {
      return 200;
   }

   @Override
   public void a(czu $$0, bre $$1, csd $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof ckl $$4) {
         etd $$6 = this.a($$4);
         if ($$6 instanceof etb $$7 && $$6.c() == etd.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               im $$11 = $$7.a();
               dpy $$12 = $$0.a_($$11);
               bqy $$13 = $$1.fu() == bop.a ? $$4.fs() : $$4.fs().e();
               if ($$12.z() && $$12.l() != djb.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               auy $$15;
               if ($$12.b() instanceof dda $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = auz.cS;
               }

               $$0.a($$4, $$11, $$15, ava.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dnh $$17) {
                  boolean $$18 = $$17.a($$0.Y(), $$4, $$7.b());
                  if ($$18) {
                     bqs $$19 = $$2.equals($$4.d(bqs.b)) ? bqs.b : bqs.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fy();
      } else {
         $$1.fy();
      }
   }

   private etd a(ckl $$0) {
      return clf.a($$0, $$0x -> !$$0x.N_() && $$0x.bx(), $$0.gA());
   }

   private void a(czu $$0, etb $$1, dpy $$2, etf $$3, bqy $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bqy.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      kn $$8 = new kn(kw.b, $$2);
      ir $$9 = $$1.b();
      cqi.a $$10 = cqi.a.a($$3, $$9);
      etf $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ir.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ir.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cqi.a a(etf $$0, ir $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cqi.a($$0.c(), 0.0, -$$0.a());
            case c -> new cqi.a(1.0, 0.0, -0.1);
            case d -> new cqi.a(-1.0, 0.0, 0.1);
            case e -> new cqi.a(-0.1, 0.0, -1.0);
            case f -> new cqi.a(0.1, 0.0, 1.0);
         };
      }
   }
}
