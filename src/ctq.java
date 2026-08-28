public class ctq extends cvg {
   public static final int a = 10;
   private static final int b = 200;

   public ctq(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      cnp $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == eyc.a.b) {
         $$1.c($$0.p());
      }

      return brk.c;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.j;
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 200;
   }

   @Override
   public void a(dds $$0, buf $$1, cvl $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cnp $$4) {
         eyc $$6 = this.a($$4);
         if ($$6 instanceof eya $$7 && $$6.c() == eyc.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               je $$11 = $$7.a();
               dua $$12 = $$0.a_($$11);
               btz $$13 = $$1.fw() == brj.a ? $$4.fu() : $$4.fu().e();
               if ($$12.D() && $$12.o() != dnc.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awc $$15;
               if ($$12.b() instanceof dha $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awd.cS;
               }

               $$0.a($$4, $$11, $$15, awe.e);
               if (!$$0.w_() && $$0.c_($$11) instanceof dri $$17) {
                  boolean $$18 = $$17.a($$0.aa(), $$4, $$7.b());
                  if ($$18) {
                     btr $$19 = $$2.equals($$4.a(btr.b)) ? btr.b : btr.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fA();
      } else {
         $$1.fA();
      }
   }

   private eyc a(cnp $$0) {
      return cok.a($$0, bto.h, $$0.gC());
   }

   private void a(dds $$0, eya $$1, dua $$2, eye $$3, btz $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == btz.b ? 1 : -1;
      int $$7 = $$0.C_().b(7, 12);
      lf $$8 = new lf(ln.b, $$2);
      jj $$9 = $$1.b();
      ctq.a $$10 = ctq.a.a($$3, $$9);
      eye $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jj.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jj.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.C_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.C_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static ctq.a a(eye $$0, jj $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new ctq.a($$0.c(), 0.0, -$$0.a());
            case c -> new ctq.a(1.0, 0.0, -0.1);
            case d -> new ctq.a(-1.0, 0.0, 0.1);
            case e -> new ctq.a(-0.1, 0.0, -1.0);
            case f -> new ctq.a(0.1, 0.0, 1.0);
         };
      }
   }
}
