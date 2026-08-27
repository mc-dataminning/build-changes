import com.mojang.serialization.MapCodec;

public class dkd extends dcv {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final int b = 2;
   public static final dqy c = dqo.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ety g = dcv.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   public ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return g;
   }

   public int m(dpy $$0) {
      return $$0.c(c);
   }

   private boolean n(dpy $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, auz.yj, ava.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, auz.yk, ava.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cfk $$4 = bqr.aQ.a((czu)$$1);
         if ($$4 != null) {
            etf $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), axw.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dur.i, $$2, dur.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dpy $$0, emg $$1) {
      return false;
   }

   public static boolean a(cza $$0, im $$1) {
      return $$0.a_($$1.d()).a(avo.cm);
   }
}
