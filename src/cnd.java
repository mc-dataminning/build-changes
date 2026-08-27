public class cnd extends coy {
   public static final int a = 10;
   private static final int b = 200;

   public cnd(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      chl $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == enx.a.b) {
         $$1.c($$0.p());
      }

      return blw.b;
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.j;
   }

   @Override
   public int b(cpd $$0) {
      return 200;
   }

   @Override
   public void a(cvr $$0, boi $$1, cpd $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof chl $$4) {
         enx $$6 = this.a($$4);
         if ($$6 instanceof env $$7 && $$6.c() == enx.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               hz $$11 = $$7.a();
               dlj $$12 = $$0.a_($$11);
               boc $$13 = $$1.fo() == blv.a ? $$4.fm() : $$4.fm().e();
               if ($$12.z() && $$12.l() != dex.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               atk $$15;
               if ($$12.b() instanceof cyx $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = atl.cK;
               }

               $$0.a($$4, $$11, $$15, atm.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof djb $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bnx $$19 = $$2.equals($$4.c(bnx.b)) ? bnx.b : bnx.a;
                     $$2.a(1, $$1, $$19);
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

   private enx a(chl $$0) {
      return cif.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), $$0.gt());
   }

   private void a(cvr $$0, env $$1, dlj $$2, enz $$3, boc $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == boc.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jr $$8 = new jr(jz.c, $$2);
      ie $$9 = $$1.b();
      cnd.a $$10 = cnd.a.a($$3, $$9);
      enz $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ie.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ie.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cnd.a a(enz $$0, ie $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cnd.a($$0.c(), 0.0, -$$0.a());
            case c -> new cnd.a(1.0, 0.0, -0.1);
            case d -> new cnd.a(-1.0, 0.0, 0.1);
            case e -> new cnd.a(-0.1, 0.0, -1.0);
            case f -> new cnd.a(0.1, 0.0, 1.0);
         };
      }
   }
}
