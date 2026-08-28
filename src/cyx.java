public class cyx extends dag {
   public static final int a = 10;
   private static final int b = 200;

   public cyx(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      csi $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fga.a.b) {
         $$1.c($$0.p());
      }

      return bvc.c;
   }

   @Override
   public dam b(dak $$0) {
      return dam.j;
   }

   @Override
   public int a(dak $$0, byf $$1) {
      return 200;
   }

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof csi $$4) {
         fga $$6 = this.a($$4);
         if ($$6 instanceof ffy $$7 && $$6.d() == fga.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               iw $$11 = $$7.b();
               ebq $$12 = $$0.a_($$11);
               bxw $$13 = $$1.fA() == bvb.a ? $$4.fy() : $$4.fy().e();
               if ($$12.D() && $$12.o() != dub.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               awx $$15;
               if ($$12.b() instanceof dnu $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awy.cS;
               }

               $$0.a($$4, $$11, $$15, awz.e);
               if ($$0 instanceof asb $$17 && $$0.c_($$11) instanceof dyt $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bxo $$20 = $$2.equals($$4.a(bxo.b)) ? bxo.b : bxo.a;
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

   private fga a(csi $$0) {
      return ctf.a($$0, bxl.h, $$0.gM());
   }

   private void a(dkj $$0, ffy $$1, ebq $$2, fgc $$3, bxw $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bxw.b ? 1 : -1;
      int $$7 = $$0.G_().b(7, 12);
      lr $$8 = new lr(lz.b, $$2);
      jc $$9 = $$1.c();
      cyx.a $$10 = cyx.a.a($$3, $$9);
      fgc $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jc.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jc.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.G_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.G_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cyx.a a(fgc $$0, jc $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cyx.a($$0.c(), 0.0, -$$0.a());
            case c -> new cyx.a(1.0, 0.0, -0.1);
            case d -> new cyx.a(-1.0, 0.0, 0.1);
            case e -> new cyx.a(-0.1, 0.0, -1.0);
            case f -> new cyx.a(0.1, 0.0, 1.0);
         };
      }
   }
}
