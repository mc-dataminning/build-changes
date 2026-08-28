import com.mojang.serialization.MapCodec;

public interface ekg<P extends ekf> {
   ekg<eke> a = a("single_pool_element", eke.b);
   ekg<ekd> b = a("list_pool_element", ekd.a);
   ekg<ejz> c = a("feature_pool_element", ejz.a);
   ekg<ejy> d = a("empty_pool_element", ejy.a);
   ekg<ekc> e = a("legacy_single_pool_element", ekc.a);

   MapCodec<P> codec();

   static <P extends ekf> ekg<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.ag, $$0, () -> $$1);
   }
}
