import com.mojang.serialization.MapCodec;

public class dlm extends dex implements dly {
   public static final MapCodec<dlm> a = b(dlm::new);
   private static final int f = 1;
   private static final ewi g;
   private static final ewi h;
   private static final ewi i = dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewi j = ewf.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dta c = dsq.aW;
   public static final dsr d = dsq.C;
   public static final dsr e = dsq.b;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewf.b();
      }
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2) {
      return ewf.b();
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsa a(cxy $$0) {
      iz $$1 = $$0.a();
      dbw $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == enu.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      int $$4 = a($$1, $$2);
      dsa $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cje.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$3.a(ewf.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewf.a();
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   private boolean a(dbc $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbc $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      dsa $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dez.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         dsa $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dez.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewi $$0 = dex.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewi $$1 = dex.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewi $$2 = dex.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewi $$3 = dex.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewi $$4 = dex.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewf.a($$0, $$1, $$2, $$3, $$4);
      ewi $$5 = dex.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewi $$6 = dex.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewi $$7 = dex.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewi $$8 = dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewf.a(dlm.i, g, $$6, $$5, $$8, $$7);
   }
}
