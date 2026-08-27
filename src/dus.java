import com.mojang.serialization.Codec;

public interface dus<P extends dur> {
   dus<dud> a = a("block_predicate_filter", dud.a);
   dus<duu> b = a("rarity_filter", duu.a);
   dus<duw> c = a("surface_relative_threshold_filter", duw.a);
   dus<dux> d = a("surface_water_depth_filter", dux.a);
   dus<duc> e = a("biome", duc.a);
   dus<duh> f = a("count", duh.a);
   dus<dum> g = a("noise_based_count", dum.a);
   dus<dun> h = a("noise_threshold_count", dun.a);
   dus<dug> i = a("count_on_every_layer", dug.a);
   dus<dui> j = a("environment_scan", dui.a);
   dus<duk> k = a("heightmap", duk.a);
   dus<duj> l = a("height_range", duj.a);
   dus<dul> m = a("in_square", dul.a);
   dus<dut> n = a("random_offset", dut.a);
   dus<due> o = a("carving_mask", due.a);

   Codec<P> codec();

   private static <P extends dur> dus<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.V, $$0, () -> $$1);
   }
}
