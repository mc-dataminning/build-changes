import com.mojang.serialization.Codec;

public interface dwk<P extends dwj> {
   dwk<dwi> a = a("single_pool_element", dwi.b);
   dwk<dwh> b = a("list_pool_element", dwh.a);
   dwk<dwd> c = a("feature_pool_element", dwd.a);
   dwk<dwc> d = a("empty_pool_element", dwc.a);
   dwk<dwg> e = a("legacy_single_pool_element", dwg.a);

   Codec<P> codec();

   static <P extends dwj> dwk<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.aj, $$0, () -> $$1);
   }
}
