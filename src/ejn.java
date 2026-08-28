import com.mojang.serialization.MapCodec;

public interface ejn<P extends ejm> {
   ejn<ejl> a = a("single_pool_element", ejl.b);
   ejn<ejk> b = a("list_pool_element", ejk.a);
   ejn<ejg> c = a("feature_pool_element", ejg.a);
   ejn<ejf> d = a("empty_pool_element", ejf.a);
   ejn<ejj> e = a("legacy_single_pool_element", ejj.a);

   MapCodec<P> codec();

   static <P extends ejm> ejn<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
