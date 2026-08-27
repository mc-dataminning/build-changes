import com.mojang.serialization.Codec;

public interface duh<P extends dug> {
   duh<dts> a = a("block_predicate_filter", dts.a);
   duh<duj> b = a("rarity_filter", duj.a);
   duh<dul> c = a("surface_relative_threshold_filter", dul.a);
   duh<dum> d = a("surface_water_depth_filter", dum.a);
   duh<dtr> e = a("biome", dtr.a);
   duh<dtw> f = a("count", dtw.a);
   duh<dub> g = a("noise_based_count", dub.a);
   duh<duc> h = a("noise_threshold_count", duc.a);
   duh<dtv> i = a("count_on_every_layer", dtv.a);
   duh<dtx> j = a("environment_scan", dtx.a);
   duh<dtz> k = a("heightmap", dtz.a);
   duh<dty> l = a("height_range", dty.a);
   duh<dua> m = a("in_square", dua.a);
   duh<dui> n = a("random_offset", dui.a);
   duh<dtt> o = a("carving_mask", dtt.a);

   Codec<P> codec();

   private static <P extends dug> duh<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.V, $$0, () -> $$1);
   }
}
