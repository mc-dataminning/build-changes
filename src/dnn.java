import com.mojang.serialization.Codec;

public interface dnn<P extends dnm> {
   dnn<dns> a = a("matching_blocks", dns.a);
   dnn<dnr> b = a("matching_block_tag", dnr.e);
   dnn<dnt> c = a("matching_fluids", dnt.a);
   dnn<dnp> d = a("has_sturdy_face", dnp.a);
   dnn<dnw> e = a("solid", dnw.a);
   dnn<dnv> f = a("replaceable", dnv.a);
   dnn<dnz> g = a("would_survive", dnz.a);
   dnn<dnq> h = a("inside_world_bounds", dnq.a);
   dnn<dnl> i = a("any_of", dnl.a);
   dnn<dnk> j = a("all_of", dnk.a);
   dnn<dnu> k = a("not", dnu.a);
   dnn<dny> l = a("true", dny.e);

   Codec<P> codec();

   private static <P extends dnm> dnn<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.P, $$0, () -> $$1);
   }
}
