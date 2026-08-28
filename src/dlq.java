import com.mojang.serialization.MapCodec;

public class dlq extends dfb implements dmc {
   public static final MapCodec<dlq> a = b(dlq::new);
   private static final int f = 1;
   private static final ewm g;
   private static final ewm h;
   private static final ewm i = dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewm j = ewj.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dte c = dsu.aW;
   public static final dsv d = dsu.C;
   public static final dsv e = dsu.b;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   protected dlq(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewj.b();
      }
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2) {
      return ewj.b();
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dse a(cyc $$0) {
      iz $$1 = $$0.a();
      dca $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eny.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dse $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cji.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$3.a(ewj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewj.a();
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(d) ? eny.c.a(false) : super.b_($$0);
   }

   private boolean a(dbg $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbg $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      dse $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfd.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         dse $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfd.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewm $$0 = dfb.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewm $$1 = dfb.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewm $$2 = dfb.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewm $$3 = dfb.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewm $$4 = dfb.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewj.a($$0, $$1, $$2, $$3, $$4);
      ewm $$5 = dfb.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewm $$6 = dfb.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewm $$7 = dfb.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewm $$8 = dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewj.a(dlq.i, g, $$6, $$5, $$8, $$7);
   }
}
