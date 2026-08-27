public class csv extends csk {
   public static final int a = 6;
   public static final dfy b = dfo.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final ehy[] f = new ehy[]{
      csk.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csk.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected csv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      cir $$7 = $$6.d();
      if ($$6.a(apr.ai) && $$0.c(b) == 0) {
         csk $$8 = csk.a($$7);
         if ($$8 instanceof csy) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aou.cK, aov.e, 1.0F, 1.0F);
            $$1.b($$2, csz.a($$8));
            $$1.a($$3, dji.c, $$2);
            $$3.b(ape.c.b($$7));
            return bgo.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bgo.a;
         }

         if ($$6.b()) {
            return bgo.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bgo a(cpl $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$3.t(false)) {
         return bgo.d;
      } else {
         $$3.a(ape.U);
         $$3.ga().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, dji.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dji.f, $$1);
         }

         return bgo.a;
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
