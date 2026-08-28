import com.mojang.serialization.MapCodec;

public interface dzd<P extends dzc> {
   dzd<dzi> a = a("matching_blocks", dzi.a);
   dzd<dzh> b = a("matching_block_tag", dzh.e);
   dzd<dzj> c = a("matching_fluids", dzj.a);
   dzd<dzf> d = a("has_sturdy_face", dzf.a);
   dzd<dzm> e = a("solid", dzm.a);
   dzd<dzl> f = a("replaceable", dzl.a);
   dzd<dzp> g = a("would_survive", dzp.a);
   dzd<dzg> h = a("inside_world_bounds", dzg.a);
   dzd<dzb> i = a("any_of", dzb.a);
   dzd<dza> j = a("all_of", dza.a);
   dzd<dzk> k = a("not", dzk.a);
   dzd<dzo> l = a("true", dzo.e);

   MapCodec<P> codec();

   private static <P extends dzc> dzd<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
