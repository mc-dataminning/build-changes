import com.mojang.serialization.MapCodec;

public class dhk extends dje implements djw {
   public static final MapCodec<dhk> b = b(dhk::new);
   public static final dqp c = dqo.C;
   public static final dqp d = dqo.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dhk> a() {
      return b;
   }

   public dhk(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ir.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == els.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dpy $$0, czu $$1, im $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dpy $$0, czu $$1, im $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dvq.a.b, $$2.u(), $$2.w()) - 1) {
         axz.a($$0.c(a).o(), $$1, $$2, 0.125, kw.aQ, bob.a(1, 2));
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      if ($$0.ab() && $$3 instanceof clq && ((clq)$$3).K()) {
         im $$4 = $$2.a();
         if ($$0.h($$4)) {
            brd $$5 = bqr.al.a($$0);
            if ($$5 != null) {
               $$5.e(etf.c($$4.c()));
               bql $$6 = $$3.u();
               $$5.b($$6 instanceof aqf ? (aqf)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, auz.zs, ava.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }
}
