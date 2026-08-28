import com.mojang.serialization.MapCodec;

public interface ela<P extends ekz> {
   ela<eky> a = a("single_pool_element", eky.b);
   ela<ekx> b = a("list_pool_element", ekx.a);
   ela<ekt> c = a("feature_pool_element", ekt.a);
   ela<eks> d = a("empty_pool_element", eks.a);
   ela<ekw> e = a("legacy_single_pool_element", ekw.a);

   MapCodec<P> codec();

   static <P extends ekz> ela<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.ag, $$0, () -> $$1);
   }
}
