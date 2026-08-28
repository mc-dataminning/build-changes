import com.mojang.serialization.MapCodec;

public class enk<P extends enj> {
   public static final enk<ens> a = a("simple_state_provider", ens.b);
   public static final enk<ent> b = a("weighted_state_provider", ent.b);
   public static final enk<eno> c = a("noise_threshold_provider", eno.b);
   public static final enk<enn> d = a("noise_provider", enn.g);
   public static final enk<enl> e = a("dual_noise_provider", enl.b);
   public static final enk<enq> f = a("rotated_block_provider", enq.b);
   public static final enk<enp> g = a("randomized_int_state_provider", enp.b);
   private final MapCodec<P> h;

   private static <P extends enj> enk<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.T, $$0, new enk<>($$1));
   }

   private enk(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
