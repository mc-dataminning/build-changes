import com.mojang.serialization.MapCodec;

public class dlw extends dfh implements dmi {
   public static final MapCodec<dlw> a = b(dlw::new);
   private static final int f = 1;
   private static final ewy g;
   private static final ewy h;
   private static final ewy i = dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewy j = ewv.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dtk c = dta.aW;
   public static final dtb d = dta.C;
   public static final dtb e = dta.b;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewv.b();
      }
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2) {
      return ewv.b();
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsk a(cxm $$0) {
      ja $$1 = $$0.a();
      dcf $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eoi.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = a($$1, $$2);
      dsk $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cit.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$3.a(ewv.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewv.a();
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   private boolean a(dbl $$0, ja $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbl $$0, ja $$1) {
      ja.a $$2 = $$1.j().c(jf.a);
      dsk $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfj.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, jf.b)) {
         return 0;
      }

      for (jf $$5 : jf.c.a) {
         dsk $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfj.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewy $$0 = dfh.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewy $$1 = dfh.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewy $$2 = dfh.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewy $$3 = dfh.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewy $$4 = dfh.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewv.a($$0, $$1, $$2, $$3, $$4);
      ewy $$5 = dfh.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewy $$6 = dfh.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewy $$7 = dfh.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewy $$8 = dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewv.a(dlw.i, g, $$6, $$5, $$8, $$7);
   }
}
