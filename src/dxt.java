import com.mojang.serialization.Codec;

public interface dxt<SP extends dxs> {
   dxt<dxq> a = a("random_spread", dxq.a);
   dxt<dxp> b = a("concentric_rings", dxp.a);

   Codec<SP> codec();

   private static <SP extends dxs> dxt<SP> a(String $$0, Codec<SP> $$1) {
      return io.a(jy.S, $$0, () -> $$1);
   }
}
