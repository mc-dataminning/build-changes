import com.mojang.serialization.MapCodec;

public class dlp extends dfa implements dmb {
   public static final MapCodec<dlp> a = b(dlp::new);
   private static final int f = 1;
   private static final ewl g;
   private static final ewl h;
   private static final ewl i = dfa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewl j = ewi.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dtd c = dst.aW;
   public static final dsu d = dst.C;
   public static final dsu e = dst.b;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewi.b();
      }
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2) {
      return ewi.b();
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsd a(cyb $$0) {
      iz $$1 = $$0.a();
      dbz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == enx.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dsd $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjh.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$3.a(ewi.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewi.a();
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }

   private boolean a(dbf $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbf $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      dsd $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfc.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         dsd $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfc.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewl $$0 = dfa.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewl $$1 = dfa.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewl $$2 = dfa.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewl $$3 = dfa.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewl $$4 = dfa.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewi.a($$0, $$1, $$2, $$3, $$4);
      ewl $$5 = dfa.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewl $$6 = dfa.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewl $$7 = dfa.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewl $$8 = dfa.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewi.a(dlp.i, g, $$6, $$5, $$8, $$7);
   }
}
