import com.mojang.serialization.Codec;

public interface duk<P extends duj> {
   duk<dtv> a = a("block_predicate_filter", dtv.a);
   duk<dum> b = a("rarity_filter", dum.a);
   duk<duo> c = a("surface_relative_threshold_filter", duo.a);
   duk<dup> d = a("surface_water_depth_filter", dup.a);
   duk<dtu> e = a("biome", dtu.a);
   duk<dtz> f = a("count", dtz.a);
   duk<due> g = a("noise_based_count", due.a);
   duk<duf> h = a("noise_threshold_count", duf.a);
   duk<dty> i = a("count_on_every_layer", dty.a);
   duk<dua> j = a("environment_scan", dua.a);
   duk<duc> k = a("heightmap", duc.a);
   duk<dub> l = a("height_range", dub.a);
   duk<dud> m = a("in_square", dud.a);
   duk<dul> n = a("random_offset", dul.a);
   duk<dtw> o = a("carving_mask", dtw.a);

   Codec<P> codec();

   private static <P extends duj> duk<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.V, $$0, () -> $$1);
   }
}
