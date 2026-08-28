import com.mojang.serialization.MapCodec;

public class drm extends dlm {
   public static final MapCodec<drm> c = b(drm::new);
   protected static final fab g = dhy.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<drm> a() {
      return c;
   }

   public drm(dvc.d $$0) {
      super($$0, jl.a, g, false, 0.1);
   }

   @Override
   protected int a(azr $$0) {
      return dnd.a($$0);
   }

   @Override
   protected dhy b() {
      return dia.oA;
   }

   @Override
   protected boolean h(dvd $$0) {
      return dnd.a($$0);
   }
}
