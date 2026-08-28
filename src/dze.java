import com.mojang.serialization.MapCodec;

public interface dze<P extends dzd> {
   dze<dzj> a = a("matching_blocks", dzj.a);
   dze<dzi> b = a("matching_block_tag", dzi.e);
   dze<dzk> c = a("matching_fluids", dzk.a);
   dze<dzg> d = a("has_sturdy_face", dzg.a);
   dze<dzn> e = a("solid", dzn.a);
   dze<dzm> f = a("replaceable", dzm.a);
   dze<dzq> g = a("would_survive", dzq.a);
   dze<dzh> h = a("inside_world_bounds", dzh.a);
   dze<dzc> i = a("any_of", dzc.a);
   dze<dzb> j = a("all_of", dzb.a);
   dze<dzl> k = a("not", dzl.a);
   dze<dzp> l = a("true", dzp.e);

   MapCodec<P> codec();

   private static <P extends dzd> dze<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
