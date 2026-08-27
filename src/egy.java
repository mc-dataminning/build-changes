import com.mojang.serialization.Codec;

public interface egy<P extends egx> {
   egy<egw> a = a("single_pool_element", egw.b);
   egy<egv> b = a("list_pool_element", egv.a);
   egy<egr> c = a("feature_pool_element", egr.a);
   egy<egq> d = a("empty_pool_element", egq.a);
   egy<egu> e = a("legacy_single_pool_element", egu.a);

   Codec<P> codec();

   static <P extends egx> egy<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.ai, $$0, () -> $$1);
   }
}
