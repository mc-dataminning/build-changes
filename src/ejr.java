import com.mojang.serialization.MapCodec;

public interface ejr<P extends ejq> {
   ejr<ejp> a = a("single_pool_element", ejp.b);
   ejr<ejo> b = a("list_pool_element", ejo.a);
   ejr<ejk> c = a("feature_pool_element", ejk.a);
   ejr<ejj> d = a("empty_pool_element", ejj.a);
   ejr<ejn> e = a("legacy_single_pool_element", ejn.a);

   MapCodec<P> codec();

   static <P extends ejq> ejr<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ai, $$0, () -> $$1);
   }
}
