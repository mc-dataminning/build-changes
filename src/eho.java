import com.mojang.serialization.Codec;

public interface eho<P extends ehn> {
   eho<ehm> a = a("single_pool_element", ehm.b);
   eho<ehl> b = a("list_pool_element", ehl.a);
   eho<ehh> c = a("feature_pool_element", ehh.a);
   eho<ehg> d = a("empty_pool_element", ehg.a);
   eho<ehk> e = a("legacy_single_pool_element", ehk.a);

   Codec<P> codec();

   static <P extends ehn> eho<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.ai, $$0, () -> $$1);
   }
}
