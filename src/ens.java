import com.mojang.serialization.MapCodec;

public class ens<P extends enr> {
   public static final ens<eoa> a = a("simple_state_provider", eoa.b);
   public static final ens<eob> b = a("weighted_state_provider", eob.b);
   public static final ens<enw> c = a("noise_threshold_provider", enw.b);
   public static final ens<env> d = a("noise_provider", env.g);
   public static final ens<ent> e = a("dual_noise_provider", ent.b);
   public static final ens<eny> f = a("rotated_block_provider", eny.b);
   public static final ens<enx> g = a("randomized_int_state_provider", enx.b);
   private final MapCodec<P> h;

   private static <P extends enr> ens<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.T, $$0, new ens<>($$1));
   }

   private ens(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
