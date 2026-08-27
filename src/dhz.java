import com.mojang.serialization.MapCodec;

public class dhz extends dcv {
   public static final MapCodec<dhz> a = b(dhz::new);
   public static final dqw<ir.a> b = dqo.H;
   protected static final int c = 2;
   protected static final ety d = dcv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ety e = dcv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.a.a));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.D_().j() && $$1.aa().b(czq.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bqr.bw)) {
            bql $$4 = bqr.bw.a($$1, $$2.c(), bri.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      ir.a $$6 = $$1.o();
      ir.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new emr($$3, $$4, $$7).c() ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$3.cu()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auz.us, ava.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(kw.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return csd.i;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ir.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ir.a.a);
               case a:
                  return $$0.a(b, ir.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }
}
