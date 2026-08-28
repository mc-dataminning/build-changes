import com.mojang.serialization.MapCodec;

public interface eke<P extends ekd> {
   eke<ekc> a = a("single_pool_element", ekc.b);
   eke<ekb> b = a("list_pool_element", ekb.a);
   eke<ejx> c = a("feature_pool_element", ejx.a);
   eke<ejw> d = a("empty_pool_element", ejw.a);
   eke<eka> e = a("legacy_single_pool_element", eka.a);

   MapCodec<P> codec();

   static <P extends ekd> eke<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.ag, $$0, () -> $$1);
   }
}
