import com.mojang.serialization.MapCodec;

public interface dzb<P extends dza> {
   dzb<dzg> a = a("matching_blocks", dzg.a);
   dzb<dzf> b = a("matching_block_tag", dzf.e);
   dzb<dzh> c = a("matching_fluids", dzh.a);
   dzb<dzd> d = a("has_sturdy_face", dzd.a);
   dzb<dzk> e = a("solid", dzk.a);
   dzb<dzj> f = a("replaceable", dzj.a);
   dzb<dzn> g = a("would_survive", dzn.a);
   dzb<dze> h = a("inside_world_bounds", dze.a);
   dzb<dyz> i = a("any_of", dyz.a);
   dzb<dyy> j = a("all_of", dyy.a);
   dzb<dzi> k = a("not", dzi.a);
   dzb<dzm> l = a("true", dzm.e);

   MapCodec<P> codec();

   private static <P extends dza> dzb<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
