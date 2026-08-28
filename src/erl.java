import com.mojang.serialization.MapCodec;

public interface erl<P extends erk> {
   erl<eqw> a = a("block_predicate_filter", eqw.a);
   erl<ern> b = a("rarity_filter", ern.a);
   erl<erp> c = a("surface_relative_threshold_filter", erp.a);
   erl<erq> d = a("surface_water_depth_filter", erq.a);
   erl<eqv> e = a("biome", eqv.a);
   erl<eqz> f = a("count", eqz.a);
   erl<erf> g = a("noise_based_count", erf.a);
   erl<erg> h = a("noise_threshold_count", erg.a);
   erl<eqy> i = a("count_on_every_layer", eqy.a);
   erl<era> j = a("environment_scan", era.a);
   erl<erd> k = a("heightmap", erd.a);
   erl<erc> l = a("height_range", erc.a);
   erl<ere> m = a("in_square", ere.a);
   erl<erm> n = a("random_offset", erm.a);
   erl<erb> o = a("fixed_placement", erb.a);

   MapCodec<P> codec();

   private static <P extends erk> erl<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.S, $$0, () -> $$1);
   }
}
