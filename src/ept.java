import com.mojang.serialization.MapCodec;

public interface ept<P extends eps> {
   ept<epr> a = a("single_pool_element", epr.b);
   ept<epq> b = a("list_pool_element", epq.a);
   ept<epm> c = a("feature_pool_element", epm.a);
   ept<epl> d = a("empty_pool_element", epl.a);
   ept<epp> e = a("legacy_single_pool_element", epp.a);

   MapCodec<P> codec();

   static <P extends eps> ept<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.ag, $$0, () -> $$1);
   }
}
