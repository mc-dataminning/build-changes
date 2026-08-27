import com.mojang.serialization.MapCodec;

public class dcd extends dcf {
   public static final MapCodec<dcd> a = b(dcd::new);
   private static final ety b = dcv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dcd> a() {
      return a;
   }

   protected dcd(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }
}
