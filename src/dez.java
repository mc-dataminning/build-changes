import com.mojang.serialization.MapCodec;

public class dez extends dcv {
   public static final MapCodec<dez> a = b(dez::new);
   protected static final ety b = dfs.c;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   protected dez(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   public dpy a(cvl $$0) {
      return !this.n().a((czx)$$0.q(), $$0.a()) ? dcv.a(this.n(), dcx.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      dfs.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dfu;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
