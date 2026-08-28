import com.mojang.serialization.MapCodec;

public interface dzc<P extends dzb> {
   dzc<dzh> a = a("matching_blocks", dzh.a);
   dzc<dzg> b = a("matching_block_tag", dzg.e);
   dzc<dzi> c = a("matching_fluids", dzi.a);
   dzc<dze> d = a("has_sturdy_face", dze.a);
   dzc<dzl> e = a("solid", dzl.a);
   dzc<dzk> f = a("replaceable", dzk.a);
   dzc<dzo> g = a("would_survive", dzo.a);
   dzc<dzf> h = a("inside_world_bounds", dzf.a);
   dzc<dza> i = a("any_of", dza.a);
   dzc<dyz> j = a("all_of", dyz.a);
   dzc<dzj> k = a("not", dzj.a);
   dzc<dzn> l = a("true", dzn.e);

   MapCodec<P> codec();

   private static <P extends dzb> dzc<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
