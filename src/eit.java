import com.mojang.serialization.MapCodec;

public interface eit<P extends eis> {
   eit<eir> a = a("single_pool_element", eir.b);
   eit<eiq> b = a("list_pool_element", eiq.a);
   eit<eim> c = a("feature_pool_element", eim.a);
   eit<eil> d = a("empty_pool_element", eil.a);
   eit<eip> e = a("legacy_single_pool_element", eip.a);

   MapCodec<P> codec();

   static <P extends eis> eit<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.ai, $$0, () -> $$1);
   }
}
