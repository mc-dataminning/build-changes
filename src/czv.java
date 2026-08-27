import javax.annotation.Nullable;

public class czv extends csm {
   public static final int a = 8;
   public static final dga b = dfq.aF;
   protected static final ehx[] c = new ehx[]{
      ehu.a(),
      csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected czv(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public ehx b(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public float b(dfa $$0, cos $$1, gu $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.d());
      if ($$3.a(apl.cg)) {
         return false;
      } else {
         return $$3.a(apl.ch) ? true : csm.a($$3.k($$1, $$2.d()), ha.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.a(cpv.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ha.b : true;
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }
}
