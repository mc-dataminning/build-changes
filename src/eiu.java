import com.mojang.serialization.MapCodec;

public interface eiu<P extends eit> {
   eiu<eif> a = a("block_predicate_filter", eif.a);
   eiu<eiw> b = a("rarity_filter", eiw.a);
   eiu<eiy> c = a("surface_relative_threshold_filter", eiy.a);
   eiu<eiz> d = a("surface_water_depth_filter", eiz.a);
   eiu<eie> e = a("biome", eie.a);
   eiu<eij> f = a("count", eij.a);
   eiu<eio> g = a("noise_based_count", eio.a);
   eiu<eip> h = a("noise_threshold_count", eip.a);
   eiu<eii> i = a("count_on_every_layer", eii.a);
   eiu<eik> j = a("environment_scan", eik.a);
   eiu<eim> k = a("heightmap", eim.a);
   eiu<eil> l = a("height_range", eil.a);
   eiu<ein> m = a("in_square", ein.a);
   eiu<eiv> n = a("random_offset", eiv.a);
   eiu<eig> o = a("carving_mask", eig.a);

   MapCodec<P> codec();

   private static <P extends eit> eiu<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.S, $$0, () -> $$1);
   }
}
