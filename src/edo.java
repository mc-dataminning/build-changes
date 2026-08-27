import com.mojang.serialization.Codec;

public interface edo<P extends edn> {
   edo<edm> a = a("single_pool_element", edm.b);
   edo<edl> b = a("list_pool_element", edl.a);
   edo<edh> c = a("feature_pool_element", edh.a);
   edo<edg> d = a("empty_pool_element", edg.a);
   edo<edk> e = a("legacy_single_pool_element", edk.a);

   Codec<P> codec();

   static <P extends edn> edo<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.ai, $$0, () -> $$1);
   }
}
