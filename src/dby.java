import com.mojang.serialization.MapCodec;

public class dby extends dcv implements dcy {
   public static final MapCodec<dby> a = b(dby::new);
   protected static final float b = 4.0F;
   protected static final ety c = dcv.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      etf $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).a(avo.au);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$0.a($$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$1 == ir.b && $$2.a(dcx.mZ)) {
            $$3.a($$4, dcx.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(csg.dR);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dpy $$0, ckl $$1, cza $$2, im $$3) {
      return $$1.eV().f() instanceof cto ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(czu $$0, im $$1) {
      $$0.a($$1.c(), dcx.mZ.n().a(dbz.i, dqk.b), 3);
   }
}
