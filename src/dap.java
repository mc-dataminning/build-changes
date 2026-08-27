public class dap extends cst implements csn {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dfz b = dfp.as;
   private static final ehw d = csl.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ehw e = csl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public dap(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(cja.vv);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dez $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djj.c, $$2, djj.a.a($$5));
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if ($$3 instanceof biy && $$3.ag() != bim.N && $$3.ag() != bim.h) {
         $$3.a($$0, new ehd(0.8F, 0.75, 0.8F));
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
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cja.qK)) {
         return bgq.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cix(cja.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aow.xF, aox.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dez $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djj.c, $$2, djj.a.a($$3, $$9));
         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
