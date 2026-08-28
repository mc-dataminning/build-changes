import com.mojang.serialization.MapCodec;

public class dlx extends dfi implements dmj {
   public static final MapCodec<dlx> a = b(dlx::new);
   private static final int f = 1;
   private static final exa g;
   private static final exa h;
   private static final exa i = dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final exa j = ewx.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dtl c = dtb.aW;
   public static final dtc d = dtb.C;
   public static final dtc e = dtb.b;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewx.b();
      }
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2) {
      return ewx.b();
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsl a(cxn $$0) {
      ja $$1 = $$0.a();
      dcg $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eok.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = a($$1, $$2);
      dsl $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ciu.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$3.a(ewx.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewx.a();
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }

   private boolean a(dbm $$0, ja $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbm $$0, ja $$1) {
      ja.a $$2 = $$1.j().c(jf.a);
      dsl $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfk.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, jf.b)) {
         return 0;
      }

      for (jf $$5 : jf.c.a) {
         dsl $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfk.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      exa $$0 = dfi.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      exa $$1 = dfi.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      exa $$2 = dfi.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      exa $$3 = dfi.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      exa $$4 = dfi.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewx.a($$0, $$1, $$2, $$3, $$4);
      exa $$5 = dfi.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      exa $$6 = dfi.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      exa $$7 = dfi.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      exa $$8 = dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewx.a(dlx.i, g, $$6, $$5, $$8, $$7);
   }
}
