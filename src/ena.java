import com.mojang.serialization.MapCodec;

public interface ena<P extends emz> {
   ena<emy> a = a("single_pool_element", emy.b);
   ena<emx> b = a("list_pool_element", emx.a);
   ena<emt> c = a("feature_pool_element", emt.a);
   ena<ems> d = a("empty_pool_element", ems.a);
   ena<emw> e = a("legacy_single_pool_element", emw.a);

   MapCodec<P> codec();

   static <P extends emz> ena<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.ag, $$0, () -> $$1);
   }
}
