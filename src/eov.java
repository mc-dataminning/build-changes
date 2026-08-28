import com.mojang.serialization.MapCodec;

public interface eov<P extends eou> {
   eov<eot> a = a("single_pool_element", eot.b);
   eov<eos> b = a("list_pool_element", eos.a);
   eov<eoo> c = a("feature_pool_element", eoo.a);
   eov<eon> d = a("empty_pool_element", eon.a);
   eov<eor> e = a("legacy_single_pool_element", eor.a);

   MapCodec<P> codec();

   static <P extends eou> eov<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.ag, $$0, () -> $$1);
   }
}
