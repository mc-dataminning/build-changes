import com.mojang.serialization.MapCodec;

public interface dza<P extends dyz> {
   dza<dzf> a = a("matching_blocks", dzf.a);
   dza<dze> b = a("matching_block_tag", dze.e);
   dza<dzg> c = a("matching_fluids", dzg.a);
   dza<dzc> d = a("has_sturdy_face", dzc.a);
   dza<dzj> e = a("solid", dzj.a);
   dza<dzi> f = a("replaceable", dzi.a);
   dza<dzm> g = a("would_survive", dzm.a);
   dza<dzd> h = a("inside_world_bounds", dzd.a);
   dza<dyy> i = a("any_of", dyy.a);
   dza<dyx> j = a("all_of", dyx.a);
   dza<dzh> k = a("not", dzh.a);
   dza<dzl> l = a("true", dzl.e);

   MapCodec<P> codec();

   private static <P extends dyz> dza<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.O, $$0, () -> $$1);
   }
}
