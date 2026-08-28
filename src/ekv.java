import com.mojang.serialization.MapCodec;

public interface ekv<P extends eku> {
   ekv<ekt> a = a("single_pool_element", ekt.b);
   ekv<eks> b = a("list_pool_element", eks.a);
   ekv<eko> c = a("feature_pool_element", eko.a);
   ekv<ekn> d = a("empty_pool_element", ekn.a);
   ekv<ekr> e = a("legacy_single_pool_element", ekr.a);

   MapCodec<P> codec();

   static <P extends eku> ekv<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.ag, $$0, () -> $$1);
   }
}
