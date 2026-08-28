import com.mojang.serialization.MapCodec;

public interface eif<P extends eie> {
   eif<ehq> a = a("block_predicate_filter", ehq.a);
   eif<eih> b = a("rarity_filter", eih.a);
   eif<eij> c = a("surface_relative_threshold_filter", eij.a);
   eif<eik> d = a("surface_water_depth_filter", eik.a);
   eif<ehp> e = a("biome", ehp.a);
   eif<ehu> f = a("count", ehu.a);
   eif<ehz> g = a("noise_based_count", ehz.a);
   eif<eia> h = a("noise_threshold_count", eia.a);
   eif<eht> i = a("count_on_every_layer", eht.a);
   eif<ehv> j = a("environment_scan", ehv.a);
   eif<ehx> k = a("heightmap", ehx.a);
   eif<ehw> l = a("height_range", ehw.a);
   eif<ehy> m = a("in_square", ehy.a);
   eif<eig> n = a("random_offset", eig.a);
   eif<ehr> o = a("carving_mask", ehr.a);

   MapCodec<P> codec();

   private static <P extends eie> eif<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.S, $$0, () -> $$1);
   }
}
