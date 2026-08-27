import com.mojang.serialization.Codec;

public interface dwl<P extends dwk> {
   dwl<dwj> a = a("single_pool_element", dwj.b);
   dwl<dwi> b = a("list_pool_element", dwi.a);
   dwl<dwe> c = a("feature_pool_element", dwe.a);
   dwl<dwd> d = a("empty_pool_element", dwd.a);
   dwl<dwh> e = a("legacy_single_pool_element", dwh.a);

   Codec<P> codec();

   static <P extends dwk> dwl<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ai, $$0, () -> $$1);
   }
}
