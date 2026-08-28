import com.mojang.serialization.MapCodec;

public class dln extends dey implements dlz {
   public static final MapCodec<dln> a = b(dln::new);
   private static final int f = 1;
   private static final ewj g;
   private static final ewj h;
   private static final ewj i = dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewj j = ewg.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dtb c = dsr.aW;
   public static final dss d = dsr.C;
   public static final dss e = dsr.b;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   protected dln(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewg.b();
      }
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2) {
      return ewg.b();
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsb a(cxz $$0) {
      iz $$1 = $$0.a();
      dbx $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == env.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      int $$4 = a($$1, $$2);
      dsb $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjf.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$3.a(ewg.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewg.a();
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }

   private boolean a(dbd $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbd $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      dsb $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfa.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         dsb $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfa.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewj $$0 = dey.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewj $$1 = dey.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewj $$2 = dey.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewj $$3 = dey.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewj $$4 = dey.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewg.a($$0, $$1, $$2, $$3, $$4);
      ewj $$5 = dey.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewj $$6 = dey.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewj $$7 = dey.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewj $$8 = dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewg.a(dln.i, g, $$6, $$5, $$8, $$7);
   }
}
