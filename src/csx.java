public class csx extends csm {
   public static final int a = 6;
   public static final dga b = dfq.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final ehx[] f = new ehx[]{
      csm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csm.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected csx(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      cit $$7 = $$6.d();
      if ($$6.a(apt.ai) && $$0.c(b) == 0) {
         csm $$8 = csm.a($$7);
         if ($$8 instanceof cta) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aow.cK, aox.e, 1.0F, 1.0F);
            $$1.b($$2, ctb.a($$8));
            $$1.a($$3, djk.c, $$2);
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

   protected static bgq a(cpn $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$3.t(false)) {
         return bgq.d;
      } else {
         $$3.a(apg.U);
         $$3.ga().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, djk.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djk.f, $$1);
         }

         return bgq.a;
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
