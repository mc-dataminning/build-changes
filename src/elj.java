import com.mojang.serialization.MapCodec;

public interface elj<P extends eli> {
   elj<eku> a = a("block_predicate_filter", eku.a);
   elj<ell> b = a("rarity_filter", ell.a);
   elj<eln> c = a("surface_relative_threshold_filter", eln.a);
   elj<elo> d = a("surface_water_depth_filter", elo.a);
   elj<ekt> e = a("biome", ekt.a);
   elj<ekx> f = a("count", ekx.a);
   elj<eld> g = a("noise_based_count", eld.a);
   elj<ele> h = a("noise_threshold_count", ele.a);
   elj<ekw> i = a("count_on_every_layer", ekw.a);
   elj<eky> j = a("environment_scan", eky.a);
   elj<elb> k = a("heightmap", elb.a);
   elj<ela> l = a("height_range", ela.a);
   elj<elc> m = a("in_square", elc.a);
   elj<elk> n = a("random_offset", elk.a);
   elj<ekz> o = a("fixed_placement", ekz.a);

   MapCodec<P> codec();

   private static <P extends eli> elj<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.S, $$0, () -> $$1);
   }
}
