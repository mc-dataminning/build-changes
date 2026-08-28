import com.mojang.serialization.MapCodec;

public interface eju<P extends ejt> {
   eju<ejs> a = a("single_pool_element", ejs.b);
   eju<ejr> b = a("list_pool_element", ejr.a);
   eju<ejn> c = a("feature_pool_element", ejn.a);
   eju<ejm> d = a("empty_pool_element", ejm.a);
   eju<ejq> e = a("legacy_single_pool_element", ejq.a);

   MapCodec<P> codec();

   static <P extends ejt> eju<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
