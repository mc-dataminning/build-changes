import com.mojang.serialization.MapCodec;

public interface erj<P extends eri> {
   erj<equ> a = a("block_predicate_filter", equ.a);
   erj<erl> b = a("rarity_filter", erl.a);
   erj<ern> c = a("surface_relative_threshold_filter", ern.a);
   erj<ero> d = a("surface_water_depth_filter", ero.a);
   erj<eqt> e = a("biome", eqt.a);
   erj<eqx> f = a("count", eqx.a);
   erj<erd> g = a("noise_based_count", erd.a);
   erj<ere> h = a("noise_threshold_count", ere.a);
   erj<eqw> i = a("count_on_every_layer", eqw.a);
   erj<eqy> j = a("environment_scan", eqy.a);
   erj<erb> k = a("heightmap", erb.a);
   erj<era> l = a("height_range", era.a);
   erj<erc> m = a("in_square", erc.a);
   erj<erk> n = a("random_offset", erk.a);
   erj<eqz> o = a("fixed_placement", eqz.a);

   MapCodec<P> codec();

   private static <P extends eri> erj<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.S, $$0, () -> $$1);
   }
}
