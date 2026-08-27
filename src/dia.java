import com.mojang.serialization.MapCodec;

public class dia extends dde {
   public static final MapCodec<dia> a = b(dia::new);
   protected static final ety b = dcv.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.aL) || $$0.a(dcx.dX) || super.b($$0, $$1, $$2);
   }
}
