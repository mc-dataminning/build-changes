import com.mojang.serialization.Codec;

public interface dyu<P extends dyt> {
   dyu<dys> a = a("single_pool_element", dys.b);
   dyu<dyr> b = a("list_pool_element", dyr.a);
   dyu<dyn> c = a("feature_pool_element", dyn.a);
   dyu<dym> d = a("empty_pool_element", dym.a);
   dyu<dyq> e = a("legacy_single_pool_element", dyq.a);

   Codec<P> codec();

   static <P extends dyt> dyu<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.aj, $$0, () -> $$1);
   }
}
