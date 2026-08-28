import com.mojang.serialization.MapCodec;

public interface dzo<P extends dzn> {
   dzo<dzt> a = a("matching_blocks", dzt.a);
   dzo<dzs> b = a("matching_block_tag", dzs.e);
   dzo<dzu> c = a("matching_fluids", dzu.a);
   dzo<dzq> d = a("has_sturdy_face", dzq.a);
   dzo<dzx> e = a("solid", dzx.a);
   dzo<dzw> f = a("replaceable", dzw.a);
   dzo<eab> g = a("would_survive", eab.a);
   dzo<dzr> h = a("inside_world_bounds", dzr.a);
   dzo<dzm> i = a("any_of", dzm.a);
   dzo<dzl> j = a("all_of", dzl.a);
   dzo<dzv> k = a("not", dzv.a);
   dzo<dzz> l = a("true", dzz.e);
   dzo<eaa> m = a("unobstructed", eaa.a);

   MapCodec<P> codec();

   private static <P extends dzn> dzo<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.M, $$0, () -> $$1);
   }
}
