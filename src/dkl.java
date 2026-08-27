import com.mojang.serialization.MapCodec;

public class dkl extends dcv {
   public static final MapCodec<dkl> a = b(dkl::new);
   private static final ety b = dcv.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return dcv.a($$1, $$2.c(), ir.a) && !$$1.z($$2);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.b && !this.a($$0, $$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kw.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      im.a $$10 = new im.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + axw.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + axw.a($$3, -10, 10));
         dpy $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kw.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }
}
