import com.mojang.serialization.Codec;

public interface dug<P extends duf> {
   dug<dtr> a = a("block_predicate_filter", dtr.a);
   dug<dui> b = a("rarity_filter", dui.a);
   dug<duk> c = a("surface_relative_threshold_filter", duk.a);
   dug<dul> d = a("surface_water_depth_filter", dul.a);
   dug<dtq> e = a("biome", dtq.a);
   dug<dtv> f = a("count", dtv.a);
   dug<dua> g = a("noise_based_count", dua.a);
   dug<dub> h = a("noise_threshold_count", dub.a);
   dug<dtu> i = a("count_on_every_layer", dtu.a);
   dug<dtw> j = a("environment_scan", dtw.a);
   dug<dty> k = a("heightmap", dty.a);
   dug<dtx> l = a("height_range", dtx.a);
   dug<dtz> m = a("in_square", dtz.a);
   dug<duh> n = a("random_offset", duh.a);
   dug<dts> o = a("carving_mask", dts.a);

   Codec<P> codec();

   private static <P extends duf> dug<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.V, $$0, () -> $$1);
   }
}
