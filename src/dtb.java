import com.mojang.serialization.MapCodec;

public class dtb extends dnt {
   public static final MapCodec<dtb> c = b(dtb::new);
   public static final fcm e = dke.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtb> a() {
      return c;
   }

   public dtb(dxm.d $$0) {
      super($$0, jm.b, e, false);
   }

   @Override
   protected dnu c() {
      return (dnu)dkg.oW;
   }
}
