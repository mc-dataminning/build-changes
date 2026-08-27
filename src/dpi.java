import com.mojang.serialization.MapCodec;

public class dpi extends diu {
   public static final MapCodec<dpi> c = b(dpi::new);
   public static final exn e = dfc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dpi> a() {
      return c;
   }

   public dpi(dtb.d $$0) {
      super($$0, iw.a, e, false);
   }

   @Override
   protected div c() {
      return (div)dfe.pz;
   }
}
