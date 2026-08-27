import com.mojang.serialization.Codec;

public interface eaw<P extends eav> {
   eaw<eau> a = a("single_pool_element", eau.b);
   eaw<eat> b = a("list_pool_element", eat.a);
   eaw<eap> c = a("feature_pool_element", eap.a);
   eaw<eao> d = a("empty_pool_element", eao.a);
   eaw<eas> e = a("legacy_single_pool_element", eas.a);

   Codec<P> codec();

   static <P extends eav> eaw<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ai, $$0, () -> $$1);
   }
}
