public class cza extends csl implements czm {
   private static final int e = 1;
   private static final ehw f;
   private static final ehw g;
   private static final ehw h = csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ehw i = eht.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dfz b = dfp.aW;
   public static final dfq c = dfp.C;
   public static final dfq d = dfp.b;

   protected cza(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return eht.b();
      }
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2) {
      return eht.b();
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dez a(clf $$0) {
      gu $$1 = $$0.a();
      cpl $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == ead.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      if (!$$3.r_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = a($$1, $$2);
      dez $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            bye.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$3.a(eht.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : eht.a();
      }
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(c) ? ead.c.a(false) : super.c_($$0);
   }

   private boolean a(cor $$0, gu $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cor $$0, gu $$1) {
      gu.a $$2 = $$1.j().c(ha.a);
      dez $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csm.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, ha.b)) {
         return 0;
      }

      for (ha $$5 : ha.c.a) {
         dez $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csm.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ehw $$0 = csl.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ehw $$1 = csl.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ehw $$2 = csl.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ehw $$3 = csl.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ehw $$4 = csl.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = eht.a($$0, $$1, $$2, $$3, $$4);
      ehw $$5 = csl.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ehw $$6 = csl.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ehw $$7 = csl.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ehw $$8 = csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = eht.a(cza.h, f, $$6, $$5, $$8, $$7);
   }
}
