import com.mojang.serialization.MapCodec;

public class dlu extends dff implements dmg {
   public static final MapCodec<dlu> a = b(dlu::new);
   private static final int f = 1;
   private static final ews g;
   private static final ews h;
   private static final ews i = dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ews j = ewp.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dth c = dsx.aW;
   public static final dsy d = dsx.C;
   public static final dsy e = dsx.b;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   protected dlu(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewp.b();
      }
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2) {
      return ewp.b();
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsh a(cxk $$0) {
      ja $$1 = $$0.a();
      dcd $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eoc.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      int $$4 = a($$1, $$2);
      dsh $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ciq.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$3.a(ewp.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewp.a();
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }

   private boolean a(dbj $$0, ja $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbj $$0, ja $$1) {
      ja.a $$2 = $$1.j().c(jf.a);
      dsh $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfh.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, jf.b)) {
         return 0;
      }

      for (jf $$5 : jf.c.a) {
         dsh $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfh.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ews $$0 = dff.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ews $$1 = dff.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ews $$2 = dff.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ews $$3 = dff.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ews $$4 = dff.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewp.a($$0, $$1, $$2, $$3, $$4);
      ews $$5 = dff.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ews $$6 = dff.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ews $$7 = dff.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ews $$8 = dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewp.a(dlu.i, g, $$6, $$5, $$8, $$7);
   }
}
