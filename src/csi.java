public class csi extends cty {
   public static final int a = 10;
   private static final int b = 200;

   public csi(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      cml $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == ewf.a.b) {
         $$1.c($$0.p());
      }

      return bqh.c;
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.j;
   }

   @Override
   public int a(cud $$0, btc $$1) {
      return 200;
   }

   @Override
   public void a(dcg $$0, btc $$1, cud $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cml $$4) {
         ewf $$6 = this.a($$4);
         if ($$6 instanceof ewd $$7 && $$6.c() == ewf.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ja $$11 = $$7.a();
               dsl $$12 = $$0.a_($$11);
               bsw $$13 = $$1.fu() == bqg.a ? $$4.fs() : $$4.fs().e();
               if ($$12.z() && $$12.l() != dlo.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               avg $$15;
               if ($$12.b() instanceof dfn $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = avh.cS;
               }

               $$0.a($$4, $$11, $$15, avi.e);
               if (!$$0.x_() && $$0.c_($$11) instanceof dpu $$17) {
                  boolean $$18 = $$17.a($$0.Z(), $$4, $$7.b());
                  if ($$18) {
                     bso $$19 = $$2.equals($$4.a(bso.b)) ? bso.b : bso.a;
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

   private ewf a(cml $$0) {
      return cnf.a($$0, $$0x -> !$$0x.N_() && $$0x.bB(), $$0.gA());
   }

   private void a(dcg $$0, ewd $$1, dsl $$2, ewh $$3, bsw $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bsw.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      lb $$8 = new lb(lj.b, $$2);
      jf $$9 = $$1.b();
      csi.a $$10 = csi.a.a($$3, $$9);
      ewh $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == jf.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == jf.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static csi.a a(ewh $$0, jf $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new csi.a($$0.c(), 0.0, -$$0.a());
            case c -> new csi.a(1.0, 0.0, -0.1);
            case d -> new csi.a(-1.0, 0.0, 0.1);
            case e -> new csi.a(-0.1, 0.0, -1.0);
            case f -> new csi.a(0.1, 0.0, 1.0);
         };
      }
   }
}
