import com.mojang.serialization.MapCodec;

public class dft extends czf implements dgf {
   public static final MapCodec<dft> a = b(dft::new);
   private static final int f = 1;
   private static final epo g;
   private static final epo h;
   private static final epo i = czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final epo j = epl.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dne c = dmu.aW;
   public static final dmv d = dmu.C;
   public static final dmv e = dmu.b;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   protected dft(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if (!$$3.a($$0.b().l())) {
         return $$0.c(e) ? h : g;
      } else {
         return epl.b();
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2) {
      return epl.b();
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return $$1.n().a(this.l());
   }

   @Override
   public dme a(crx $$0) {
      ib $$1 = $$0.a();
      cwe $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ehs.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      int $$4 = a($$1, $$2);
      dme $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cek.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$3.a(epl.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : epl.a();
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   private boolean a(cvk $$0, ib $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cvk $$0, ib $$1) {
      ib.a $$2 = $$1.j().c(ih.a);
      dme $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(czh.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ih.b)) {
         return 0;
      }

      for (ih $$5 : ih.c.a) {
         dme $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(czh.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      epo $$0 = czf.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      epo $$1 = czf.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      epo $$2 = czf.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      epo $$3 = czf.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      epo $$4 = czf.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = epl.a($$0, $$1, $$2, $$3, $$4);
      epo $$5 = czf.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      epo $$6 = czf.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      epo $$7 = czf.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      epo $$8 = czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = epl.a(dft.i, g, $$6, $$5, $$8, $$7);
   }
}
