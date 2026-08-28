import com.mojang.serialization.MapCodec;

public class dmm extends dfw implements dmy {
   public static final MapCodec<dmm> a = b(dmm::new);
   private static final int f = 1;
   private static final exp g;
   private static final exp h;
   private static final exp i = dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final exp j = exm.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dua c = dtq.aW;
   public static final dtr d = dtq.C;
   public static final dtr e = dtq.b;

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   protected dmm(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return exm.b();
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2) {
      return exm.b();
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dta a(cyb $$0) {
      jd $$1 = $$0.a();
      dcu $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eoz.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      int $$4 = a($$1, $$2);
      dta $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$3.a(exm.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : exm.a();
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   private boolean a(dca $$0, jd $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dca $$0, jd $$1) {
      jd.a $$2 = $$1.j().c(ji.a);
      dta $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfy.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ji.b)) {
         return 0;
      }

      for (ji $$5 : ji.c.a) {
         dta $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfy.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      exp $$0 = dfw.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      exp $$1 = dfw.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      exp $$2 = dfw.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      exp $$3 = dfw.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      exp $$4 = dfw.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = exm.a($$0, $$1, $$2, $$3, $$4);
      exp $$5 = dfw.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      exp $$6 = dfw.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      exp $$7 = dfw.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      exp $$8 = dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = exm.a(dmm.i, g, $$6, $$5, $$8, $$7);
   }
}
