import com.mojang.serialization.Codec;

public interface duf<P extends due> {
   duf<dtq> a = a("block_predicate_filter", dtq.a);
   duf<duh> b = a("rarity_filter", duh.a);
   duf<duj> c = a("surface_relative_threshold_filter", duj.a);
   duf<duk> d = a("surface_water_depth_filter", duk.a);
   duf<dtp> e = a("biome", dtp.a);
   duf<dtu> f = a("count", dtu.a);
   duf<dtz> g = a("noise_based_count", dtz.a);
   duf<dua> h = a("noise_threshold_count", dua.a);
   duf<dtt> i = a("count_on_every_layer", dtt.a);
   duf<dtv> j = a("environment_scan", dtv.a);
   duf<dtx> k = a("heightmap", dtx.a);
   duf<dtw> l = a("height_range", dtw.a);
   duf<dty> m = a("in_square", dty.a);
   duf<dug> n = a("random_offset", dug.a);
   duf<dtr> o = a("carving_mask", dtr.a);

   Codec<P> codec();

   private static <P extends due> duf<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.V, $$0, () -> $$1);
   }
}
