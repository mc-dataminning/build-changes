import com.mojang.serialization.MapCodec;

public interface eiz<P extends eiy> {
   eiz<eij> a = a("block_predicate_filter", eij.a);
   eiz<ejb> b = a("rarity_filter", ejb.a);
   eiz<ejd> c = a("surface_relative_threshold_filter", ejd.a);
   eiz<eje> d = a("surface_water_depth_filter", eje.a);
   eiz<eii> e = a("biome", eii.a);
   eiz<ein> f = a("count", ein.a);
   eiz<eit> g = a("noise_based_count", eit.a);
   eiz<eiu> h = a("noise_threshold_count", eiu.a);
   eiz<eim> i = a("count_on_every_layer", eim.a);
   eiz<eio> j = a("environment_scan", eio.a);
   eiz<eir> k = a("heightmap", eir.a);
   eiz<eiq> l = a("height_range", eiq.a);
   eiz<eis> m = a("in_square", eis.a);
   eiz<eja> n = a("random_offset", eja.a);
   eiz<eik> o = a("carving_mask", eik.a);
   eiz<eip> p = a("fixed_placement", eip.a);

   MapCodec<P> codec();

   private static <P extends eiy> eiz<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.S, $$0, () -> $$1);
   }
}
