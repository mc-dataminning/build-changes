import com.mojang.serialization.Codec;

public interface eat<P extends eas> {
   eat<eae> a = a("block_predicate_filter", eae.a);
   eat<eav> b = a("rarity_filter", eav.a);
   eat<eax> c = a("surface_relative_threshold_filter", eax.a);
   eat<eay> d = a("surface_water_depth_filter", eay.a);
   eat<ead> e = a("biome", ead.a);
   eat<eai> f = a("count", eai.a);
   eat<ean> g = a("noise_based_count", ean.a);
   eat<eao> h = a("noise_threshold_count", eao.a);
   eat<eah> i = a("count_on_every_layer", eah.a);
   eat<eaj> j = a("environment_scan", eaj.a);
   eat<eal> k = a("heightmap", eal.a);
   eat<eak> l = a("height_range", eak.a);
   eat<eam> m = a("in_square", eam.a);
   eat<eau> n = a("random_offset", eau.a);
   eat<eaf> o = a("carving_mask", eaf.a);

   Codec<P> codec();

   private static <P extends eas> eat<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.U, $$0, () -> $$1);
   }
}
