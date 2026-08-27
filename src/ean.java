import com.mojang.serialization.Codec;

public interface ean<P extends eam> {
   ean<eal> a = a("single_pool_element", eal.b);
   ean<eak> b = a("list_pool_element", eak.a);
   ean<eag> c = a("feature_pool_element", eag.a);
   ean<eaf> d = a("empty_pool_element", eaf.a);
   ean<eaj> e = a("legacy_single_pool_element", eaj.a);

   Codec<P> codec();

   static <P extends eam> ean<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ai, $$0, () -> $$1);
   }
}
