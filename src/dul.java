import com.mojang.serialization.Codec;

public interface dul<P extends duk> {
   dul<dtw> a = a("block_predicate_filter", dtw.a);
   dul<dun> b = a("rarity_filter", dun.a);
   dul<dup> c = a("surface_relative_threshold_filter", dup.a);
   dul<duq> d = a("surface_water_depth_filter", duq.a);
   dul<dtv> e = a("biome", dtv.a);
   dul<dua> f = a("count", dua.a);
   dul<duf> g = a("noise_based_count", duf.a);
   dul<dug> h = a("noise_threshold_count", dug.a);
   dul<dtz> i = a("count_on_every_layer", dtz.a);
   dul<dub> j = a("environment_scan", dub.a);
   dul<dud> k = a("heightmap", dud.a);
   dul<duc> l = a("height_range", duc.a);
   dul<due> m = a("in_square", due.a);
   dul<dum> n = a("random_offset", dum.a);
   dul<dtx> o = a("carving_mask", dtx.a);

   Codec<P> codec();

   private static <P extends duk> dul<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.V, $$0, () -> $$1);
   }
}
