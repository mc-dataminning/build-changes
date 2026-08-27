import com.mojang.serialization.MapCodec;

public class dla extends dde implements dcy {
   public static final MapCodec<dla> a = b(dla::new);
   protected static final float b = 6.0F;
   protected static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   protected dla(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      dfd $$4 = (dfd)($$3.a(dcx.bu) ? dcx.iI : dcx.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dfd.a($$0, $$4.n(), $$2, 2);
      }
   }
}
