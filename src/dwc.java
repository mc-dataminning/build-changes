import com.mojang.serialization.MapCodec;

public class dwc extends dps {
   public static final MapCodec<dwc> c = b(dwc::new);
   private static final ffc g = dma.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dwc> a() {
      return c;
   }

   public dwc(dzy.d $$0) {
      super($$0, ja.a, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drm.a($$0);
   }

   @Override
   protected dma b() {
      return dmc.pd;
   }

   @Override
   protected boolean h(dzz $$0) {
      return drm.a($$0);
   }
}
