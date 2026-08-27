import com.mojang.serialization.Codec;

public interface dyp<P extends dyo> {
   dyp<dyn> a = a("single_pool_element", dyn.b);
   dyp<dym> b = a("list_pool_element", dym.a);
   dyp<dyi> c = a("feature_pool_element", dyi.a);
   dyp<dyh> d = a("empty_pool_element", dyh.a);
   dyp<dyl> e = a("legacy_single_pool_element", dyl.a);

   Codec<P> codec();

   static <P extends dyo> dyp<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.aj, $$0, () -> $$1);
   }
}
