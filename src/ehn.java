import com.mojang.serialization.MapCodec;

public interface ehn<P extends ehm> {
   ehn<egy> a = a("block_predicate_filter", egy.a);
   ehn<ehp> b = a("rarity_filter", ehp.a);
   ehn<ehr> c = a("surface_relative_threshold_filter", ehr.a);
   ehn<ehs> d = a("surface_water_depth_filter", ehs.a);
   ehn<egx> e = a("biome", egx.a);
   ehn<ehc> f = a("count", ehc.a);
   ehn<ehh> g = a("noise_based_count", ehh.a);
   ehn<ehi> h = a("noise_threshold_count", ehi.a);
   ehn<ehb> i = a("count_on_every_layer", ehb.a);
   ehn<ehd> j = a("environment_scan", ehd.a);
   ehn<ehf> k = a("heightmap", ehf.a);
   ehn<ehe> l = a("height_range", ehe.a);
   ehn<ehg> m = a("in_square", ehg.a);
   ehn<eho> n = a("random_offset", eho.a);
   ehn<egz> o = a("carving_mask", egz.a);

   MapCodec<P> codec();

   private static <P extends ehm> ehn<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
