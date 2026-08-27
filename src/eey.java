import com.mojang.serialization.Codec;

public interface eey<P extends eex> {
   eey<eej> a = a("block_predicate_filter", eej.a);
   eey<efa> b = a("rarity_filter", efa.a);
   eey<efc> c = a("surface_relative_threshold_filter", efc.a);
   eey<efd> d = a("surface_water_depth_filter", efd.a);
   eey<eei> e = a("biome", eei.a);
   eey<een> f = a("count", een.a);
   eey<ees> g = a("noise_based_count", ees.a);
   eey<eet> h = a("noise_threshold_count", eet.a);
   eey<eem> i = a("count_on_every_layer", eem.a);
   eey<eeo> j = a("environment_scan", eeo.a);
   eey<eeq> k = a("heightmap", eeq.a);
   eey<eep> l = a("height_range", eep.a);
   eey<eer> m = a("in_square", eer.a);
   eey<eez> n = a("random_offset", eez.a);
   eey<eek> o = a("carving_mask", eek.a);

   Codec<P> codec();

   private static <P extends eex> eey<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.U, $$0, () -> $$1);
   }
}
