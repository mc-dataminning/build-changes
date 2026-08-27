import com.mojang.serialization.MapCodec;

public class dfc extends cyo implements dfo {
   public static final MapCodec<dfc> a = b(dfc::new);
   private static final int f = 1;
   private static final eol g;
   private static final eol h;
   private static final eol i = cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eol j = eoi.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dmf c = dlv.aW;
   public static final dlw d = dlv.C;
   public static final dlw e = dlv.b;

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   protected dfc(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return eoi.b();
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2) {
      return eoi.b();
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dlf a(crg $$0) {
      hz $$1 = $$0.a();
      cvn $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == egq.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      int $$4 = a($$1, $$2);
      dlf $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cdr.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$3.a(eoi.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eoi.a();
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   private boolean a(cut $$0, hz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cut $$0, hz $$1) {
      hz.a $$2 = $$1.j().c(ie.a);
      dlf $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cyq.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ie.b)) {
         return 0;
      }

      for (ie $$5 : ie.c.a) {
         dlf $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cyq.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eol $$0 = cyo.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eol $$1 = cyo.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eol $$2 = cyo.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eol $$3 = cyo.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eol $$4 = cyo.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eoi.a($$0, $$1, $$2, $$3, $$4);
      eol $$5 = cyo.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eol $$6 = cyo.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eol $$7 = cyo.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eol $$8 = cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eoi.a(dfc.i, g, $$6, $$5, $$8, $$7);
   }
}
