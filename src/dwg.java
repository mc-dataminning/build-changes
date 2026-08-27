import com.mojang.serialization.Codec;

public interface dwg<P extends dwf> {
   dwg<dwe> a = a("single_pool_element", dwe.b);
   dwg<dwd> b = a("list_pool_element", dwd.a);
   dwg<dvz> c = a("feature_pool_element", dvz.a);
   dwg<dvy> d = a("empty_pool_element", dvy.a);
   dwg<dwc> e = a("legacy_single_pool_element", dwc.a);

   Codec<P> codec();

   static <P extends dwf> dwg<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ai, $$0, () -> $$1);
   }
}
