import com.mojang.serialization.Codec;

public interface dsy<SP extends dsx> {
   dsy<dsv> a = a("random_spread", dsv.a);
   dsy<dsu> b = a("concentric_rings", dsu.a);

   Codec<SP> codec();

   private static <SP extends dsx> dsy<SP> a(String $$0, Codec<SP> $$1) {
      return hr.a(jb.S, $$0, () -> $$1);
   }
}
