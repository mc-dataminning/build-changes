import com.mojang.serialization.MapCodec;

public class ddg extends dcv {
   public static final MapCodec<ddg> a = b(ddg::new);
   public static final dqy b = dqo.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ety e = dcv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ety f = dcv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   protected ddg(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      im $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dpy $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return f;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      for (ir $$3 : ir.c.a) {
         dpy $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(avt.b)) {
            return false;
         }
      }

      dpy $$5 = $$1.a_($$2.d());
      return ($$5.a(dcx.dQ) || $$5.a(avo.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
