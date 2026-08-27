import com.mojang.serialization.MapCodec;

public abstract class dcl extends dcv {
   protected static final int a = 2;
   protected static final ety b = dcv.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dcl(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcl> a();

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !this.a($$0, $$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return a($$1, $$2.d(), ir.b);
   }
}
