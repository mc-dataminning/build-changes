import com.mojang.serialization.Codec;

public interface ejb<P extends eja> {
   ejb<eil> a = a("block_predicate_filter", eil.a);
   ejb<ejd> b = a("rarity_filter", ejd.a);
   ejb<ejf> c = a("surface_relative_threshold_filter", ejf.a);
   ejb<ejg> d = a("surface_water_depth_filter", ejg.a);
   ejb<eik> e = a("biome", eik.a);
   ejb<eiq> f = a("count", eiq.a);
   ejb<eiv> g = a("noise_based_count", eiv.a);
   ejb<eiw> h = a("noise_threshold_count", eiw.a);
   ejb<eip> i = a("count_on_every_layer", eip.a);
   ejb<eir> j = a("environment_scan", eir.a);
   ejb<eit> k = a("heightmap", eit.a);
   ejb<eis> l = a("height_range", eis.a);
   ejb<eio> m = a("cloud", eio.a);
   ejb<eiu> n = a("in_square", eiu.a);
   ejb<ejc> o = a("random_offset", ejc.a);
   ejb<eim> p = a("carving_mask", eim.a);

   Codec<P> codec();

   private static <P extends eja> ejb<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.U, $$0, () -> $$1);
   }
}
