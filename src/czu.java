import javax.annotation.Nullable;

public class czu extends csl {
   public static final int a = 8;
   public static final dfz b = dfp.aF;
   protected static final ehw[] c = new ehw[]{
      eht.a(),
      csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected czu(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
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
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public ehw b(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public float b(dez $$0, cor $$1, gu $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.d());
      if ($$3.a(apl.cg)) {
         return false;
      } else {
         return $$3.a(apl.ch) ? true : csl.a($$3.k($$1, $$2.d()), ha.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.a(cpu.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ha.b : true;
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }
}
