import com.mojang.serialization.MapCodec;

public interface ehr<P extends ehq> {
   ehr<ehc> a = a("block_predicate_filter", ehc.a);
   ehr<eht> b = a("rarity_filter", eht.a);
   ehr<ehv> c = a("surface_relative_threshold_filter", ehv.a);
   ehr<ehw> d = a("surface_water_depth_filter", ehw.a);
   ehr<ehb> e = a("biome", ehb.a);
   ehr<ehg> f = a("count", ehg.a);
   ehr<ehl> g = a("noise_based_count", ehl.a);
   ehr<ehm> h = a("noise_threshold_count", ehm.a);
   ehr<ehf> i = a("count_on_every_layer", ehf.a);
   ehr<ehh> j = a("environment_scan", ehh.a);
   ehr<ehj> k = a("heightmap", ehj.a);
   ehr<ehi> l = a("height_range", ehi.a);
   ehr<ehk> m = a("in_square", ehk.a);
   ehr<ehs> n = a("random_offset", ehs.a);
   ehr<ehd> o = a("carving_mask", ehd.a);

   MapCodec<P> codec();

   private static <P extends ehq> ehr<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
