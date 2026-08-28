import com.mojang.serialization.MapCodec;

public interface dyx<P extends dyw> {
   dyx<dzc> a = a("matching_blocks", dzc.a);
   dyx<dzb> b = a("matching_block_tag", dzb.e);
   dyx<dzd> c = a("matching_fluids", dzd.a);
   dyx<dyz> d = a("has_sturdy_face", dyz.a);
   dyx<dzg> e = a("solid", dzg.a);
   dyx<dzf> f = a("replaceable", dzf.a);
   dyx<dzj> g = a("would_survive", dzj.a);
   dyx<dza> h = a("inside_world_bounds", dza.a);
   dyx<dyv> i = a("any_of", dyv.a);
   dyx<dyu> j = a("all_of", dyu.a);
   dyx<dze> k = a("not", dze.a);
   dyx<dzi> l = a("true", dzi.e);

   MapCodec<P> codec();

   private static <P extends dyw> dyx<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
