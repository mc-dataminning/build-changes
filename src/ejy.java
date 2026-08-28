import com.mojang.serialization.MapCodec;

public interface ejy<P extends ejx> {
   ejy<ejw> a = a("single_pool_element", ejw.b);
   ejy<ejv> b = a("list_pool_element", ejv.a);
   ejy<ejr> c = a("feature_pool_element", ejr.a);
   ejy<ejq> d = a("empty_pool_element", ejq.a);
   ejy<eju> e = a("legacy_single_pool_element", eju.a);

   MapCodec<P> codec();

   static <P extends ejx> ejy<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.ag, $$0, () -> $$1);
   }
}
