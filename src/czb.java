public class czb extends csm implements czn {
   private static final int e = 1;
   private static final ehx f;
   private static final ehx g;
   private static final ehx h = csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ehx i = ehu.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dga b = dfq.aW;
   public static final dfr c = dfq.C;
   public static final dfr d = dfq.b;

   protected czb(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return ehu.b();
      }
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2) {
      return ehu.b();
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dfa a(clg $$0) {
      gu $$1 = $$0.a();
      cpm $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == eae.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      if (!$$3.r_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = a($$1, $$2);
      dfa $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            byf.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$3.a(ehu.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : ehu.a();
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }

   private boolean a(cos $$0, gu $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cos $$0, gu $$1) {
      gu.a $$2 = $$1.j().c(ha.a);
      dfa $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csn.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, ha.b)) {
         return 0;
      }

      for (ha $$5 : ha.c.a) {
         dfa $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csn.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ehx $$0 = csm.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ehx $$1 = csm.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ehx $$2 = csm.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ehx $$3 = csm.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ehx $$4 = csm.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = ehu.a($$0, $$1, $$2, $$3, $$4);
      ehx $$5 = csm.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ehx $$6 = csm.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ehx $$7 = csm.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ehx $$8 = csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = ehu.a(czb.h, f, $$6, $$5, $$8, $$7);
   }
}
