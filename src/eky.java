import com.mojang.serialization.MapCodec;

public interface eky<P extends ekx> {
   eky<ekw> a = a("single_pool_element", ekw.b);
   eky<ekv> b = a("list_pool_element", ekv.a);
   eky<ekr> c = a("feature_pool_element", ekr.a);
   eky<ekq> d = a("empty_pool_element", ekq.a);
   eky<eku> e = a("legacy_single_pool_element", eku.a);

   MapCodec<P> codec();

   static <P extends ekx> eky<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.ag, $$0, () -> $$1);
   }
}
