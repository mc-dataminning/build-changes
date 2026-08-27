public class ctg extends csv {
   public static final int a = 6;
   public static final dgj b = dfz.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final eig[] f = new eig[]{
      csv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csv.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected ctg(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      cja $$7 = $$6.d();
      if ($$6.a(aqb.ai) && $$0.c(b) == 0) {
         csv $$8 = csv.a($$7);
         if ($$8 instanceof ctj) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, ape.cK, apf.e, 1.0F, 1.0F);
            $$1.b($$2, ctk.a($$8));
            $$1.a($$3, djt.c, $$2);
            $$3.b(apo.c.b($$7));
            return bgy.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bgy.a;
         }

         if ($$6.b()) {
            return bgy.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bgy a(cpw $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$3.t(false)) {
         return bgy.d;
      } else {
         $$3.a(apo.U);
         $$3.gb().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, djt.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djt.f, $$1);
         }

         return bgy.a;
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
