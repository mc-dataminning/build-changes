import com.mojang.serialization.MapCodec;

public class dce extends dcf {
   public static final MapCodec<dce> a = b(dce::new);
   protected static final float b = 6.0F;
   protected static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   protected dce(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }
}
