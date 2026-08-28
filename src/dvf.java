import com.mojang.serialization.MapCodec;

public class dvf extends dps {
   public static final MapCodec<dvf> c = b(dvf::new);
   private static final ffc g = dma.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dvf> a() {
      return c;
   }

   public dvf(dzy.d $$0) {
      super($$0, ja.b, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drm.a($$0);
   }

   @Override
   protected dma b() {
      return dmc.pf;
   }

   @Override
   protected boolean h(dzz $$0) {
      return drm.a($$0);
   }
}
