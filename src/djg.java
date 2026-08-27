import com.mojang.serialization.MapCodec;

public class djg extends dde {
   public static final MapCodec<djg> a = b(djg::new);
   protected static final float b = 6.0F;
   protected static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   protected djg(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.aL) || $$0.a(dcx.dX) || super.b($$0, $$1, $$2);
   }
}
