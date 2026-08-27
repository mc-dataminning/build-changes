import com.mojang.serialization.Codec;

public interface eam<P extends eal> {
   eam<dzx> a = a("block_predicate_filter", dzx.a);
   eam<eao> b = a("rarity_filter", eao.a);
   eam<eaq> c = a("surface_relative_threshold_filter", eaq.a);
   eam<ear> d = a("surface_water_depth_filter", ear.a);
   eam<dzw> e = a("biome", dzw.a);
   eam<eab> f = a("count", eab.a);
   eam<eag> g = a("noise_based_count", eag.a);
   eam<eah> h = a("noise_threshold_count", eah.a);
   eam<eaa> i = a("count_on_every_layer", eaa.a);
   eam<eac> j = a("environment_scan", eac.a);
   eam<eae> k = a("heightmap", eae.a);
   eam<ead> l = a("height_range", ead.a);
   eam<eaf> m = a("in_square", eaf.a);
   eam<ean> n = a("random_offset", ean.a);
   eam<dzy> o = a("carving_mask", dzy.a);

   Codec<P> codec();

   private static <P extends eal> eam<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.U, $$0, () -> $$1);
   }
}
