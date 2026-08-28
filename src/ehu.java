import com.mojang.serialization.MapCodec;

public interface ehu<P extends eht> {
   ehu<ehf> a = a("block_predicate_filter", ehf.a);
   ehu<ehw> b = a("rarity_filter", ehw.a);
   ehu<ehy> c = a("surface_relative_threshold_filter", ehy.a);
   ehu<ehz> d = a("surface_water_depth_filter", ehz.a);
   ehu<ehe> e = a("biome", ehe.a);
   ehu<ehj> f = a("count", ehj.a);
   ehu<eho> g = a("noise_based_count", eho.a);
   ehu<ehp> h = a("noise_threshold_count", ehp.a);
   ehu<ehi> i = a("count_on_every_layer", ehi.a);
   ehu<ehk> j = a("environment_scan", ehk.a);
   ehu<ehm> k = a("heightmap", ehm.a);
   ehu<ehl> l = a("height_range", ehl.a);
   ehu<ehn> m = a("in_square", ehn.a);
   ehu<ehv> n = a("random_offset", ehv.a);
   ehu<ehg> o = a("carving_mask", ehg.a);

   MapCodec<P> codec();

   private static <P extends eht> ehu<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
