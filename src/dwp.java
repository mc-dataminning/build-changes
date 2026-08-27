import com.mojang.serialization.Codec;

public interface dwp<P extends dwo> {
   dwp<dwa> a = a("block_predicate_filter", dwa.a);
   dwp<dwr> b = a("rarity_filter", dwr.a);
   dwp<dwt> c = a("surface_relative_threshold_filter", dwt.a);
   dwp<dwu> d = a("surface_water_depth_filter", dwu.a);
   dwp<dvz> e = a("biome", dvz.a);
   dwp<dwe> f = a("count", dwe.a);
   dwp<dwj> g = a("noise_based_count", dwj.a);
   dwp<dwk> h = a("noise_threshold_count", dwk.a);
   dwp<dwd> i = a("count_on_every_layer", dwd.a);
   dwp<dwf> j = a("environment_scan", dwf.a);
   dwp<dwh> k = a("heightmap", dwh.a);
   dwp<dwg> l = a("height_range", dwg.a);
   dwp<dwi> m = a("in_square", dwi.a);
   dwp<dwq> n = a("random_offset", dwq.a);
   dwp<dwb> o = a("carving_mask", dwb.a);

   Codec<P> codec();

   private static <P extends dwo> dwp<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.V, $$0, () -> $$1);
   }
}
