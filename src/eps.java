import com.mojang.serialization.MapCodec;

public interface eps<P extends epr> {
   eps<epq> a = a("single_pool_element", epq.b);
   eps<epp> b = a("list_pool_element", epp.a);
   eps<epl> c = a("feature_pool_element", epl.a);
   eps<epk> d = a("empty_pool_element", epk.a);
   eps<epo> e = a("legacy_single_pool_element", epo.a);

   MapCodec<P> codec();

   static <P extends epr> eps<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.ag, $$0, () -> $$1);
   }
}
