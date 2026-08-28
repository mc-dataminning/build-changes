import com.mojang.serialization.MapCodec;

public interface erv<P extends eru> {
   erv<erg> a = a("block_predicate_filter", erg.a);
   erv<erx> b = a("rarity_filter", erx.a);
   erv<erz> c = a("surface_relative_threshold_filter", erz.a);
   erv<esa> d = a("surface_water_depth_filter", esa.a);
   erv<erf> e = a("biome", erf.a);
   erv<erj> f = a("count", erj.a);
   erv<erp> g = a("noise_based_count", erp.a);
   erv<erq> h = a("noise_threshold_count", erq.a);
   erv<eri> i = a("count_on_every_layer", eri.a);
   erv<erk> j = a("environment_scan", erk.a);
   erv<ern> k = a("heightmap", ern.a);
   erv<erm> l = a("height_range", erm.a);
   erv<ero> m = a("in_square", ero.a);
   erv<erw> n = a("random_offset", erw.a);
   erv<erl> o = a("fixed_placement", erl.a);

   MapCodec<P> codec();

   private static <P extends eru> erv<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.S, $$0, () -> $$1);
   }
}
