import com.mojang.serialization.MapCodec;

public class djk extends dcv implements djw {
   public static final MapCodec<djk> a = b(djk::new);
   private static final int f = 1;
   private static final ety g;
   private static final ety h;
   private static final ety i = dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ety j = etv.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dqy c = dqo.aW;
   public static final dqp d = dqo.C;
   public static final dqp e = dqo.b;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if (!$$3.a($$0.b().p())) {
         return $$0.c(e) ? h : g;
      } else {
         return etv.b();
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2) {
      return etv.b();
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return $$1.n().a(this.p());
   }

   @Override
   public dpy a(cvl $$0) {
      im $$1 = $$0.a();
      czu $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == els.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      int $$4 = a($$1, $$2);
      dpy $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cgu.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$3.a(etv.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : etv.a();
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   private boolean a(cza $$0, im $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cza $$0, im $$1) {
      im.a $$2 = $$1.j().c(ir.a);
      dpy $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dcx.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ir.b)) {
         return 0;
      }

      for (ir $$5 : ir.c.a) {
         dpy $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dcx.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ety $$0 = dcv.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ety $$1 = dcv.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ety $$2 = dcv.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ety $$3 = dcv.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ety $$4 = dcv.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = etv.a($$0, $$1, $$2, $$3, $$4);
      ety $$5 = dcv.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ety $$6 = dcv.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ety $$7 = dcv.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ety $$8 = dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = etv.a(djk.i, g, $$6, $$5, $$8, $$7);
   }
}
