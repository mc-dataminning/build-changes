public class cgy extends cit {
   public static final int a = 10;
   private static final int b = 200;
   private static final double c = Math.sqrt(ali.d) - 1.0;

   public cgy(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cbn $$1 = $$0.o();
      if ($$1 != null && this.a((biy)$$1).c() == ehc.a.b) {
         $$1.c($$0.p());
      }

      return bgq.b;
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.j;
   }

   @Override
   public int b(ciy $$0) {
      return 200;
   }

   @Override
   public void a(cpm $$0, biy $$1, ciy $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cbn $$4) {
         ehc $$6 = this.a($$1);
         if ($$6 instanceof eha $$7 && $$6.c() == ehc.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               gu $$11 = $$7.a();
               dfa $$12 = $$0.a_($$11);
               bis $$13 = $$1.fm() == bgp.a ? $$4.fk() : $$4.fk().e();
               if ($$12.z() && $$12.l() != cyr.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               aov $$15;
               if ($$12.b() instanceof csq $$14) {
                  $$15 = $$14.b();
               } else {
                  $$15 = aow.cl;
               }

               $$0.a($$4, $$11, $$15, aox.e);
               if (!$$0.r_() && $$0.c_($$11) instanceof dcq $$17) {
                  boolean $$18 = $$17.a($$0.V(), $$4, $$7.b());
                  if ($$18) {
                     bin $$19 = $$2.equals($$4.c(bin.b)) ? bin.b : bin.a;
                     $$2.a(1, $$1, $$1x -> $$1x.d($$19));
                  }
               }
            }

            return;
         }

         $$1.fq();
      } else {
         $$1.fq();
      }
   }

   private ehc a(biy $$0) {
      return ccg.a($$0, $$0x -> !$$0x.G_() && $$0x.br(), c);
   }

   private void a(cpm $$0, eha $$1, dfa $$2, ehe $$3, bis $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bis.b ? 1 : -1;
      int $$7 = $$0.y_().b(7, 12);
      in $$8 = new in(iv.c, $$2);
      ha $$9 = $$1.b();
      cgy.a $$10 = cgy.a.a($$3, $$9);
      ehe $$11 = $$1.e();

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

      public static cgy.a a(ehe $$0, ha $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cgy.a($$0.c(), 0.0, -$$0.a());
            case c -> new cgy.a(1.0, 0.0, -0.1);
            case d -> new cgy.a(-1.0, 0.0, 0.1);
            case e -> new cgy.a(-0.1, 0.0, -1.0);
            case f -> new cgy.a(0.1, 0.0, 1.0);
         };
      }
   }
}
