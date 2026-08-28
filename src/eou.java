import com.mojang.serialization.MapCodec;

public interface eou<P extends eot> {
   eou<eos> a = a("single_pool_element", eos.b);
   eou<eor> b = a("list_pool_element", eor.a);
   eou<eon> c = a("feature_pool_element", eon.a);
   eou<eom> d = a("empty_pool_element", eom.a);
   eou<eoq> e = a("legacy_single_pool_element", eoq.a);

   MapCodec<P> codec();

   static <P extends eot> eou<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.ag, $$0, () -> $$1);
   }
}
