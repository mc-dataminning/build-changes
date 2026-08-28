import com.mojang.serialization.MapCodec;

public interface ehy<P extends ehx> {
   ehy<ehj> a = a("block_predicate_filter", ehj.a);
   ehy<eia> b = a("rarity_filter", eia.a);
   ehy<eic> c = a("surface_relative_threshold_filter", eic.a);
   ehy<eid> d = a("surface_water_depth_filter", eid.a);
   ehy<ehi> e = a("biome", ehi.a);
   ehy<ehn> f = a("count", ehn.a);
   ehy<ehs> g = a("noise_based_count", ehs.a);
   ehy<eht> h = a("noise_threshold_count", eht.a);
   ehy<ehm> i = a("count_on_every_layer", ehm.a);
   ehy<eho> j = a("environment_scan", eho.a);
   ehy<ehq> k = a("heightmap", ehq.a);
   ehy<ehp> l = a("height_range", ehp.a);
   ehy<ehr> m = a("in_square", ehr.a);
   ehy<ehz> n = a("random_offset", ehz.a);
   ehy<ehk> o = a("carving_mask", ehk.a);

   MapCodec<P> codec();

   private static <P extends ehx> ehy<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.S, $$0, () -> $$1);
   }
}
