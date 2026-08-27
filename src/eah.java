import com.mojang.serialization.Codec;

public interface eah<P extends eag> {
   eah<eaf> a = a("single_pool_element", eaf.b);
   eah<eae> b = a("list_pool_element", eae.a);
   eah<eaa> c = a("feature_pool_element", eaa.a);
   eah<dzz> d = a("empty_pool_element", dzz.a);
   eah<ead> e = a("legacy_single_pool_element", ead.a);

   Codec<P> codec();

   static <P extends eag> eah<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ai, $$0, () -> $$1);
   }
}
