import com.mojang.serialization.MapCodec;

public class dte extends dnu {
   public static final MapCodec<dte> c = b(dte::new);
   private static final fcr e = dke.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dte> a() {
      return c;
   }

   public dte(dxp.d $$0) {
      super($$0, jn.b, e, false);
   }

   @Override
   protected dnv c() {
      return (dnv)dkg.pd;
   }
}
