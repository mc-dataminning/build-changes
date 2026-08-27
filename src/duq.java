import com.mojang.serialization.Codec;

public interface duq<P extends dup> {
   duq<dub> a = a("block_predicate_filter", dub.a);
   duq<dus> b = a("rarity_filter", dus.a);
   duq<duu> c = a("surface_relative_threshold_filter", duu.a);
   duq<duv> d = a("surface_water_depth_filter", duv.a);
   duq<dua> e = a("biome", dua.a);
   duq<duf> f = a("count", duf.a);
   duq<duk> g = a("noise_based_count", duk.a);
   duq<dul> h = a("noise_threshold_count", dul.a);
   duq<due> i = a("count_on_every_layer", due.a);
   duq<dug> j = a("environment_scan", dug.a);
   duq<dui> k = a("heightmap", dui.a);
   duq<duh> l = a("height_range", duh.a);
   duq<duj> m = a("in_square", duj.a);
   duq<dur> n = a("random_offset", dur.a);
   duq<duc> o = a("carving_mask", duc.a);

   Codec<P> codec();

   private static <P extends dup> duq<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.V, $$0, () -> $$1);
   }
}
