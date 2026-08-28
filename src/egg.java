import com.mojang.serialization.MapCodec;

public class egg<P extends egf> {
   public static final egg<ego> a = a("simple_state_provider", ego.b);
   public static final egg<egp> b = a("weighted_state_provider", egp.b);
   public static final egg<egk> c = a("noise_threshold_provider", egk.b);
   public static final egg<egj> d = a("noise_provider", egj.g);
   public static final egg<egh> e = a("dual_noise_provider", egh.b);
   public static final egg<egm> f = a("rotated_block_provider", egm.b);
   public static final egg<egl> g = a("randomized_int_state_provider", egl.b);
   private final MapCodec<P> h;

   private static <P extends egf> egg<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.T, $$0, new egg<>($$1));
   }

   private egg(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
