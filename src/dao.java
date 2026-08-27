public class dao extends css implements csm {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dfy b = dfo.as;
   private static final ehy d = csk.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ehy e = csk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public dao(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(ciz.vv);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dey $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dji.c, $$2, dji.a.a($$5));
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$3 instanceof biw && $$3.ag() != bik.N && $$3.ag() != bik.h) {
         $$3.a($$0, new ehf(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(b) > 0 && ($$3.ac != $$3.dp() || $$3.ae != $$3.dv())) {
            double $$4 = Math.abs($$3.dp() - $$3.ac);
            double $$5 = Math.abs($$3.dv() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(ciz.qK)) {
         return bgo.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new ciw(ciz.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aou.xA, aov.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dey $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dji.c, $$2, dji.a.a($$3, $$9));
         return bgo.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
