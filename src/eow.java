import com.mojang.serialization.MapCodec;

public interface eow<P extends eov> {
   eow<eou> a = a("single_pool_element", eou.b);
   eow<eot> b = a("list_pool_element", eot.a);
   eow<eop> c = a("feature_pool_element", eop.a);
   eow<eoo> d = a("empty_pool_element", eoo.a);
   eow<eos> e = a("legacy_single_pool_element", eos.a);

   MapCodec<P> codec();

   static <P extends eov> eow<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.ag, $$0, () -> $$1);
   }
}
