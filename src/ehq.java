import com.mojang.serialization.MapCodec;

public interface ehq<P extends ehp> {
   ehq<ehb> a = a("block_predicate_filter", ehb.a);
   ehq<ehs> b = a("rarity_filter", ehs.a);
   ehq<ehu> c = a("surface_relative_threshold_filter", ehu.a);
   ehq<ehv> d = a("surface_water_depth_filter", ehv.a);
   ehq<eha> e = a("biome", eha.a);
   ehq<ehf> f = a("count", ehf.a);
   ehq<ehk> g = a("noise_based_count", ehk.a);
   ehq<ehl> h = a("noise_threshold_count", ehl.a);
   ehq<ehe> i = a("count_on_every_layer", ehe.a);
   ehq<ehg> j = a("environment_scan", ehg.a);
   ehq<ehi> k = a("heightmap", ehi.a);
   ehq<ehh> l = a("height_range", ehh.a);
   ehq<ehj> m = a("in_square", ehj.a);
   ehq<ehr> n = a("random_offset", ehr.a);
   ehq<ehc> o = a("carving_mask", ehc.a);

   MapCodec<P> codec();

   private static <P extends ehp> ehq<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.U, $$0, () -> $$1);
   }
}
