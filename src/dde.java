import com.mojang.serialization.MapCodec;

public abstract class dde extends dcv {
   protected dde(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dde> a();

   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.af) || $$0.a(dcx.cC);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return $$1 == emg.c && !this.aG ? true : super.a($$0, $$1);
   }
}
