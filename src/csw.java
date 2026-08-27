public class csw extends csl {
   public static final int a = 6;
   public static final dfz b = dfp.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final ehw[] f = new ehw[]{
      csl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csl.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected csw(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      cis $$7 = $$6.d();
      if ($$6.a(apt.ai) && $$0.c(b) == 0) {
         csl $$8 = csl.a($$7);
         if ($$8 instanceof csz) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aow.cK, aox.e, 1.0F, 1.0F);
            $$1.b($$2, cta.a($$8));
            $$1.a($$3, djj.c, $$2);
            $$3.b(apg.c.b($$7));
            return bgq.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bgq.a;
         }

         if ($$6.b()) {
            return bgq.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bgq a(cpm $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$3.t(false)) {
         return bgq.d;
      } else {
         $$3.a(apg.U);
         $$3.ga().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, djj.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djj.f, $$1);
         }

         return bgq.a;
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
