import com.mojang.serialization.MapCodec;

public interface eix<P extends eiw> {
   eix<eii> a = a("block_predicate_filter", eii.a);
   eix<eiz> b = a("rarity_filter", eiz.a);
   eix<ejb> c = a("surface_relative_threshold_filter", ejb.a);
   eix<ejc> d = a("surface_water_depth_filter", ejc.a);
   eix<eih> e = a("biome", eih.a);
   eix<eim> f = a("count", eim.a);
   eix<eir> g = a("noise_based_count", eir.a);
   eix<eis> h = a("noise_threshold_count", eis.a);
   eix<eil> i = a("count_on_every_layer", eil.a);
   eix<ein> j = a("environment_scan", ein.a);
   eix<eip> k = a("heightmap", eip.a);
   eix<eio> l = a("height_range", eio.a);
   eix<eiq> m = a("in_square", eiq.a);
   eix<eiy> n = a("random_offset", eiy.a);
   eix<eij> o = a("carving_mask", eij.a);

   MapCodec<P> codec();

   private static <P extends eiw> eix<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.S, $$0, () -> $$1);
   }
}
