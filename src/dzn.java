import com.mojang.serialization.MapCodec;

public interface dzn<P extends dzm> {
   dzn<dzs> a = a("matching_blocks", dzs.a);
   dzn<dzr> b = a("matching_block_tag", dzr.e);
   dzn<dzt> c = a("matching_fluids", dzt.a);
   dzn<dzp> d = a("has_sturdy_face", dzp.a);
   dzn<dzw> e = a("solid", dzw.a);
   dzn<dzv> f = a("replaceable", dzv.a);
   dzn<eaa> g = a("would_survive", eaa.a);
   dzn<dzq> h = a("inside_world_bounds", dzq.a);
   dzn<dzl> i = a("any_of", dzl.a);
   dzn<dzk> j = a("all_of", dzk.a);
   dzn<dzu> k = a("not", dzu.a);
   dzn<dzy> l = a("true", dzy.e);
   dzn<dzz> m = a("unobstructed", dzz.a);

   MapCodec<P> codec();

   private static <P extends dzm> dzn<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.M, $$0, () -> $$1);
   }
}
