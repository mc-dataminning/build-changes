import com.mojang.serialization.Codec;

public interface eao<P extends ean> {
   eao<eam> a = a("single_pool_element", eam.b);
   eao<eal> b = a("list_pool_element", eal.a);
   eao<eah> c = a("feature_pool_element", eah.a);
   eao<eag> d = a("empty_pool_element", eag.a);
   eao<eak> e = a("legacy_single_pool_element", eak.a);

   Codec<P> codec();

   static <P extends ean> eao<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ai, $$0, () -> $$1);
   }
}
