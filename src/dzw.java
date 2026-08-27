import com.mojang.serialization.Codec;

public interface dzw<P extends dzv> {
   dzw<dzu> a = a("single_pool_element", dzu.b);
   dzw<dzt> b = a("list_pool_element", dzt.a);
   dzw<dzp> c = a("feature_pool_element", dzp.a);
   dzw<dzo> d = a("empty_pool_element", dzo.a);
   dzw<dzs> e = a("legacy_single_pool_element", dzs.a);

   Codec<P> codec();

   static <P extends dzv> dzw<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.ai, $$0, () -> $$1);
   }
}
