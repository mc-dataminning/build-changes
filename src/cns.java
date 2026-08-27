public class cns extends cpl {
   public static final int a = 10;
   private static final int b = 200;

   public cns(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cia $$1 = $$0.o();
      if ($$1 != null && this.a($$1).c() == eot.a.b) {
         $$1.c($$0.p());
      }

      return bml.b;
   }

   @Override
   public crj c(cpq $$0) {
      return crj.j;
   }

   @Override
   public int b(cpq $$0) {
      return 200;
   }

   @Override
   public void a(cwe $$0, box $$1, cpq $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cia $$4) {
         eot $$6 = this.a($$4);
         if ($$6 instanceof eor $$7 && $$6.c() == eot.a.b) {
            int $$9 = this.b($$2) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               ib $$11 = $$7.a();
               dme $$12 = $$0.a_($$11);
               bor $$13 = $$1.fq() == bmk.a ? $$4.fo() : $$4.fo().e();
               if ($$12.z() && $$12.l() != dfk.a) {
                  this.a($$0, $$7, $$12, $$1.f(0.0F), $$13);
               }

               ato $$15;
               if ($$12.b() instanceof czk $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = atp.cK;
               }

               $$0.a($$4, $$11, $$15, atq.e);
               if (!$$0.y_() && $$0.c_($$11) instanceof djp $$17) {
                  boolean $$18 = $$17.a($$0.X(), $$4, $$7.b());
                  if ($$18) {
                     bom $$19 = $$2.equals($$4.c(bom.b)) ? bom.b : bom.a;
                     $$2.a(1, $$1, $$19);
                  }
               }
            }

            return;
         }

         $$1.fu();
      } else {
         $$1.fu();
      }
   }

   private eot a(cia $$0) {
      return ciu.a($$0, $$0x -> !$$0x.P_() && $$0x.bt(), $$0.gv());
   }

   private void a(cwe $$0, eor $$1, dme $$2, eov $$3, bor $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == bor.b ? 1 : -1;
      int $$7 = $$0.F_().b(7, 12);
      jt $$8 = new jt(kb.c, $$2);
      ih $$9 = $$1.b();
      cns.a $$10 = cns.a.a($$3, $$9);
      eov $$11 = $$1.e();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.c - (double)($$9 == ih.e ? 1.0E-6F : 0.0F),
            $$11.d,
            $$11.e - (double)($$9 == ih.c ? 1.0E-6F : 0.0F),
            $$10.a() * (double)$$6 * 3.0 * $$0.F_().j(),
            0.0,
            $$10.c() * (double)$$6 * 3.0 * $$0.F_().j()
         );
      }
   }

   static record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static cns.a a(eov $$0, ih $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new cns.a($$0.c(), 0.0, -$$0.a());
            case c -> new cns.a(1.0, 0.0, -0.1);
            case d -> new cns.a(-1.0, 0.0, 0.1);
            case e -> new cns.a(-0.1, 0.0, -1.0);
            case f -> new cns.a(0.1, 0.0, 1.0);
         };
      }
   }
}
