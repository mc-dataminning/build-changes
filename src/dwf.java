import com.mojang.serialization.Codec;

public interface dwf<P extends dwe> {
   dwf<dwd> a = a("single_pool_element", dwd.b);
   dwf<dwc> b = a("list_pool_element", dwc.a);
   dwf<dvy> c = a("feature_pool_element", dvy.a);
   dwf<dvx> d = a("empty_pool_element", dvx.a);
   dwf<dwb> e = a("legacy_single_pool_element", dwb.a);

   Codec<P> codec();

   static <P extends dwe> dwf<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.ai, $$0, () -> $$1);
   }
}
