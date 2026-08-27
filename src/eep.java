import com.mojang.serialization.Codec;

public interface eep<P extends eeo> {
   eep<eea> a = a("block_predicate_filter", eea.a);
   eep<eer> b = a("rarity_filter", eer.a);
   eep<eet> c = a("surface_relative_threshold_filter", eet.a);
   eep<eeu> d = a("surface_water_depth_filter", eeu.a);
   eep<edz> e = a("biome", edz.a);
   eep<eee> f = a("count", eee.a);
   eep<eej> g = a("noise_based_count", eej.a);
   eep<eek> h = a("noise_threshold_count", eek.a);
   eep<eed> i = a("count_on_every_layer", eed.a);
   eep<eef> j = a("environment_scan", eef.a);
   eep<eeh> k = a("heightmap", eeh.a);
   eep<eeg> l = a("height_range", eeg.a);
   eep<eei> m = a("in_square", eei.a);
   eep<eeq> n = a("random_offset", eeq.a);
   eep<eeb> o = a("carving_mask", eeb.a);

   Codec<P> codec();

   private static <P extends eeo> eep<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.U, $$0, () -> $$1);
   }
}
