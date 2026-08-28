import com.mojang.serialization.MapCodec;

public interface dzh<P extends dzg> {
   dzh<dzm> a = a("matching_blocks", dzm.a);
   dzh<dzl> b = a("matching_block_tag", dzl.e);
   dzh<dzn> c = a("matching_fluids", dzn.a);
   dzh<dzj> d = a("has_sturdy_face", dzj.a);
   dzh<dzq> e = a("solid", dzq.a);
   dzh<dzp> f = a("replaceable", dzp.a);
   dzh<dzu> g = a("would_survive", dzu.a);
   dzh<dzk> h = a("inside_world_bounds", dzk.a);
   dzh<dzf> i = a("any_of", dzf.a);
   dzh<dze> j = a("all_of", dze.a);
   dzh<dzo> k = a("not", dzo.a);
   dzh<dzs> l = a("true", dzs.e);
   dzh<dzt> m = a("unobstructed", dzt.a);

   MapCodec<P> codec();

   private static <P extends dzg> dzh<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.M, $$0, () -> $$1);
   }
}
