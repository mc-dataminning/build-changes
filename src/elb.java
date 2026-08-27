import com.mojang.serialization.Codec;

public interface elb<P extends ela> {
   elb<ekz> a = a("single_pool_element", ekz.b);
   elb<eky> b = a("list_pool_element", eky.a);
   elb<eku> c = a("feature_pool_element", eku.a);
   elb<ekt> d = a("empty_pool_element", ekt.a);
   elb<ekx> e = a("legacy_single_pool_element", ekx.a);

   Codec<P> codec();

   static <P extends ela> elb<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.ai, $$0, () -> $$1);
   }
}
