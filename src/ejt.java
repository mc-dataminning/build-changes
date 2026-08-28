import com.mojang.serialization.MapCodec;

public interface ejt<P extends ejs> {
   ejt<ejr> a = a("single_pool_element", ejr.b);
   ejt<ejq> b = a("list_pool_element", ejq.a);
   ejt<ejm> c = a("feature_pool_element", ejm.a);
   ejt<ejl> d = a("empty_pool_element", ejl.a);
   ejt<ejp> e = a("legacy_single_pool_element", ejp.a);

   MapCodec<P> codec();

   static <P extends ejs> ejt<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
