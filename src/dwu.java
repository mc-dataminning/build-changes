import com.mojang.serialization.Codec;

public interface dwu<P extends dwt> {
   dwu<dwf> a = a("block_predicate_filter", dwf.a);
   dwu<dww> b = a("rarity_filter", dww.a);
   dwu<dwy> c = a("surface_relative_threshold_filter", dwy.a);
   dwu<dwz> d = a("surface_water_depth_filter", dwz.a);
   dwu<dwe> e = a("biome", dwe.a);
   dwu<dwj> f = a("count", dwj.a);
   dwu<dwo> g = a("noise_based_count", dwo.a);
   dwu<dwp> h = a("noise_threshold_count", dwp.a);
   dwu<dwi> i = a("count_on_every_layer", dwi.a);
   dwu<dwk> j = a("environment_scan", dwk.a);
   dwu<dwm> k = a("heightmap", dwm.a);
   dwu<dwl> l = a("height_range", dwl.a);
   dwu<dwn> m = a("in_square", dwn.a);
   dwu<dwv> n = a("random_offset", dwv.a);
   dwu<dwg> o = a("carving_mask", dwg.a);

   Codec<P> codec();

   private static <P extends dwt> dwu<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.V, $$0, () -> $$1);
   }
}
