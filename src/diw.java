import com.mojang.serialization.MapCodec;

public class diw extends dcv {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dqp b = diz.d;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      if (!$$3.bU()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.f() instanceof cqb && new cvl($$4, $$5, $$0, $$6).b() ? bos.e : bos.a;
   }

   private static void d(dpy $$0, czu $$1, im $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cxo.a(cxq.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(czu $$0, im $$1) {
      double $$2 = 0.5625;
      ayd $$3 = $$0.z;

      for (ir $$4 : ir.values()) {
         im $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ir.a $$6 = $$4.o();
            double $$7 = $$6 == ir.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ir.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ir.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(kq.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }
}
