import com.mojang.serialization.MapCodec;

public class dlc extends dcv {
   public static final MapCodec<dlc> a = b(dlc::new);
   private static final dqy b = dqo.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      int $$4 = a((czv)$$0, $$1, $$2, (bql)$$3);
      if ($$3.u() instanceof aqf $$6) {
         $$6.a(avj.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(czv $$0, dpy $$1, etb $$2, bql $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof ckr ? 20 : 8;
      if (!$$0.O().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(etb $$0, etf $$1) {
      ir $$2 = $$0.b();
      double $$3 = Math.abs(axw.e($$1.c) - 0.5);
      double $$4 = Math.abs(axw.e($$1.d) - 0.5);
      double $$5 = Math.abs(axw.e($$1.e) - 0.5);
      ir.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ir.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ir.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, axw.c(15.0 * axw.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(czv $$0, dpy $$1, int $$2, im $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
