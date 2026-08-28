public class cuh extends cvt {
   public static final int a = 10;
   private static final int b = 200;

   public cuh(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      coh $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == ezf.a.b) {
         $$1.c($$0.p());
      }

      return bry.c;
   }

   @Override
   public cvz a(cvx $$0) {
      return cvz.j;
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      return 200;
   }

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof coh $$4) {
         ezf $$6 = this.a($$4);
         if ($$6 instanceof ezd $$7 && $$6.d() == ezf.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jg $$11 = $$7.b();
               dvd $$12 = $$0.a_($$11);
               bup $$13 = $$1.fC() == brx.a ? $$4.fA() : $$4.fA().e();
               if ($$12.D() && $$12.o() != doe.a) {
                  this.a($$0, $$7, $$12, $$1.g(0.0F), $$13);
               }

               awj $$15;
               if ($$12.b() instanceof did $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = awk.cS;
               }

               $$0.a($$4, $$11, $$15, awl.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof dsk $$17) {
                  boolean $$18 = $$17.a($$0.aa(), $$4, $$7.c());
                  if ($$18) {
                     buh $$19 = $$2.equals($$4.a(buh.b)) ? buh.b : buh.a;
                     $$2.a(1, $$1, $$19);
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

   private ezf a(coh $$0) {
      return cpd.a($$0, bue.h, $$0.gK());
   }

   private void a(dev $$0, ezd $$1, dvd $$2, ezh $$3, bup $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bup.b ? 1 : -1;
      int $$7 = $$0.E_().b(7, 12);
      li $$8 = new li(lq.b, $$2);
      jl $$9 = $$1.c();
      cuh.a $$10 = cuh.a.a($$3, $$9);
      ezh $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - (double)($$9 == jl.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - (double)($$9 == jl.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.E_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.E_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cuh.a a(ezh $$0, jl $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cuh.a($$0.c(), 0.0, -$$0.a());
            case c -> new cuh.a(1.0, 0.0, -0.1);
            case d -> new cuh.a(-1.0, 0.0, 0.1);
            case e -> new cuh.a(-0.1, 0.0, -1.0);
            case f -> new cuh.a(0.1, 0.0, 1.0);
         };
      }
   }
}
