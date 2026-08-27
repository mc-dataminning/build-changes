import com.mojang.serialization.Codec;

public interface dxi<P extends dxh> {
   dxi<dxg> a = a("single_pool_element", dxg.b);
   dxi<dxf> b = a("list_pool_element", dxf.a);
   dxi<dxb> c = a("feature_pool_element", dxb.a);
   dxi<dxa> d = a("empty_pool_element", dxa.a);
   dxi<dxe> e = a("legacy_single_pool_element", dxe.a);

   Codec<P> codec();

   static <P extends dxh> dxi<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aj, $$0, () -> $$1);
   }
}
