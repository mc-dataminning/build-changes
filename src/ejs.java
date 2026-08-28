import com.mojang.serialization.MapCodec;

public interface ejs<P extends ejr> {
   ejs<ejq> a = a("single_pool_element", ejq.b);
   ejs<ejp> b = a("list_pool_element", ejp.a);
   ejs<ejl> c = a("feature_pool_element", ejl.a);
   ejs<ejk> d = a("empty_pool_element", ejk.a);
   ejs<ejo> e = a("legacy_single_pool_element", ejo.a);

   MapCodec<P> codec();

   static <P extends ejr> ejs<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
