public class cdz extends cfu {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(aiy.a) - 1.0;

   public cdz(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      byo $$1 = $$0.o();
      if ($$1 != null && this.a((bfz)$$1).c() == eeg.a.b) {
         $$1.c($$0.p());
      }

      return bdx.b;
   }

   @Override
   public chs c(cfz $$0) {
      return chs.j;
   }

   @Override
   public int b(cfz $$0) {
      return 200;
   }

   @Override
   public void a(cmm $$0, bfz $$1, cfz $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof byo $$4) {
         eeg $$6 = this.a($$1);
         if ($$6 instanceof eee $$7 && $$6.c() == eeg.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gu $$11 = $$7.a();
               dcb $$12 = $$0.a_($$11);
               bft $$13 = $$1.fj() == bdw.a ? $$4.fh() : $$4.fh().d();
               this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               amg $$15;
               if ($$12.b() instanceof cpr $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = amh.cl;
               }

               $$0.a($$4, $$11, $$15, ami.e);
               if (!$$0.r_() && $$0.c_($$11) instanceof czr $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bfo $$19 = $$2.equals($$4.c(bfo.b)) ? bfo.b : bfo.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fn();
      } else {
         $$1.fn();
      }
   }

   private eeg a(bfz $$0) {
      return bzh.a($$0, $$0x -> !$$0x.G_() && $$0x.bo(), c);
   }

   public void a(cmm $$0, eee $$1, dcb $$2, eei $$3, bft $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bft.b ? 1 : -1;
      int $$7 = $$0.y_().b(7, 12);
      in $$8 = new in(iv.c, $$2);
      ha $$9 = $$1.b();
      cdz.a $$10 = cdz.a.a($$3, $$9);
      eei $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ha.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ha.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.y_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.y_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cdz.a a(eei $$0, ha $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cdz.a($$0.c(), 0.0, -$$0.a());
            case c -> new cdz.a(1.0, 0.0, -0.1);
            case d -> new cdz.a(-1.0, 0.0, 0.1);
            case e -> new cdz.a(-0.1, 0.0, -1.0);
            case f -> new cdz.a(0.1, 0.0, 1.0);
         };
      }
   }
}
