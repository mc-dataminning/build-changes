import com.mojang.serialization.MapCodec;

public interface ejq<P extends ejp> {
   ejq<ejo> a = a("single_pool_element", ejo.b);
   ejq<ejn> b = a("list_pool_element", ejn.a);
   ejq<ejj> c = a("feature_pool_element", ejj.a);
   ejq<eji> d = a("empty_pool_element", eji.a);
   ejq<ejm> e = a("legacy_single_pool_element", ejm.a);

   MapCodec<P> codec();

   static <P extends ejp> ejq<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
