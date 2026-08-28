import com.mojang.serialization.MapCodec;

public interface eie<P extends eid> {
   eie<ehp> a = a("block_predicate_filter", ehp.a);
   eie<eig> b = a("rarity_filter", eig.a);
   eie<eii> c = a("surface_relative_threshold_filter", eii.a);
   eie<eij> d = a("surface_water_depth_filter", eij.a);
   eie<eho> e = a("biome", eho.a);
   eie<eht> f = a("count", eht.a);
   eie<ehy> g = a("noise_based_count", ehy.a);
   eie<ehz> h = a("noise_threshold_count", ehz.a);
   eie<ehs> i = a("count_on_every_layer", ehs.a);
   eie<ehu> j = a("environment_scan", ehu.a);
   eie<ehw> k = a("heightmap", ehw.a);
   eie<ehv> l = a("height_range", ehv.a);
   eie<ehx> m = a("in_square", ehx.a);
   eie<eif> n = a("random_offset", eif.a);
   eie<ehq> o = a("carving_mask", ehq.a);

   MapCodec<P> codec();

   private static <P extends eid> eie<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.S, $$0, () -> $$1);
   }
}
