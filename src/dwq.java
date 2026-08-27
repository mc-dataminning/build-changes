import com.mojang.serialization.Codec;

public interface dwq<P extends dwp> {
   dwq<dwo> a = a("single_pool_element", dwo.b);
   dwq<dwn> b = a("list_pool_element", dwn.a);
   dwq<dwj> c = a("feature_pool_element", dwj.a);
   dwq<dwi> d = a("empty_pool_element", dwi.a);
   dwq<dwm> e = a("legacy_single_pool_element", dwm.a);

   Codec<P> codec();

   static <P extends dwp> dwq<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ai, $$0, () -> $$1);
   }
}
