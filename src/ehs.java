import com.mojang.serialization.MapCodec;

public interface ehs<P extends ehr> {
   ehs<ehd> a = a("block_predicate_filter", ehd.a);
   ehs<ehu> b = a("rarity_filter", ehu.a);
   ehs<ehw> c = a("surface_relative_threshold_filter", ehw.a);
   ehs<ehx> d = a("surface_water_depth_filter", ehx.a);
   ehs<ehc> e = a("biome", ehc.a);
   ehs<ehh> f = a("count", ehh.a);
   ehs<ehm> g = a("noise_based_count", ehm.a);
   ehs<ehn> h = a("noise_threshold_count", ehn.a);
   ehs<ehg> i = a("count_on_every_layer", ehg.a);
   ehs<ehi> j = a("environment_scan", ehi.a);
   ehs<ehk> k = a("heightmap", ehk.a);
   ehs<ehj> l = a("height_range", ehj.a);
   ehs<ehl> m = a("in_square", ehl.a);
   ehs<eht> n = a("random_offset", eht.a);
   ehs<ehe> o = a("carving_mask", ehe.a);

   MapCodec<P> codec();

   private static <P extends ehr> ehs<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
