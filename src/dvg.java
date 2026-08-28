import com.mojang.serialization.MapCodec;

public class dvg extends dpr {
   public static final MapCodec<dvg> c = b(dvg::new);
   private static final ffc e = dma.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dvg> a() {
      return c;
   }

   public dvg(dzy.d $$0) {
      super($$0, ja.b, e, false);
   }

   @Override
   protected dps c() {
      return (dps)dmc.pe;
   }
}
