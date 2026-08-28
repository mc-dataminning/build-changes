import com.mojang.serialization.MapCodec;

public interface eht<P extends ehs> {
   eht<ehe> a = a("block_predicate_filter", ehe.a);
   eht<ehv> b = a("rarity_filter", ehv.a);
   eht<ehx> c = a("surface_relative_threshold_filter", ehx.a);
   eht<ehy> d = a("surface_water_depth_filter", ehy.a);
   eht<ehd> e = a("biome", ehd.a);
   eht<ehi> f = a("count", ehi.a);
   eht<ehn> g = a("noise_based_count", ehn.a);
   eht<eho> h = a("noise_threshold_count", eho.a);
   eht<ehh> i = a("count_on_every_layer", ehh.a);
   eht<ehj> j = a("environment_scan", ehj.a);
   eht<ehl> k = a("heightmap", ehl.a);
   eht<ehk> l = a("height_range", ehk.a);
   eht<ehm> m = a("in_square", ehm.a);
   eht<ehu> n = a("random_offset", ehu.a);
   eht<ehf> o = a("carving_mask", ehf.a);

   MapCodec<P> codec();

   private static <P extends ehs> eht<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
