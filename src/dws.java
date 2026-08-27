import com.mojang.serialization.Codec;

public interface dws<P extends dwr> {
   dws<dwq> a = a("single_pool_element", dwq.b);
   dws<dwp> b = a("list_pool_element", dwp.a);
   dws<dwl> c = a("feature_pool_element", dwl.a);
   dws<dwk> d = a("empty_pool_element", dwk.a);
   dws<dwo> e = a("legacy_single_pool_element", dwo.a);

   Codec<P> codec();

   static <P extends dwr> dws<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ai, $$0, () -> $$1);
   }
}
