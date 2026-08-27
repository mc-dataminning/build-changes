public class daz extends ctd implements csx {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dgj b = dfz.as;
   private static final eig d = csv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eig e = csv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public daz(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(cji.vv);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dfj $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djt.c, $$2, djt.a.a($$5));
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$3 instanceof bjg && $$3.ag() != biu.N && $$3.ag() != biu.h) {
         $$3.a($$0, new ehn(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(b) > 0 && ($$3.ac != $$3.dq() || $$3.ae != $$3.dw())) {
            double $$4 = Math.abs($$3.dq() - $$3.ac);
            double $$5 = Math.abs($$3.dw() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cji.qK)) {
         return bgy.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cjf(cji.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, apd.xF, ape.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dfj $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djt.c, $$2, djt.a.a($$3, $$9));
         return bgy.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
