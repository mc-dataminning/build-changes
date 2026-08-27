import com.mojang.serialization.Codec;

public interface dyd<P extends dyc> {
   dyd<dyb> a = a("single_pool_element", dyb.b);
   dyd<dya> b = a("list_pool_element", dya.a);
   dyd<dxw> c = a("feature_pool_element", dxw.a);
   dyd<dxv> d = a("empty_pool_element", dxv.a);
   dyd<dxz> e = a("legacy_single_pool_element", dxz.a);

   Codec<P> codec();

   static <P extends dyc> dyd<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aj, $$0, () -> $$1);
   }
}
