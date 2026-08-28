import com.mojang.serialization.MapCodec;

public interface eng<P extends enf> {
   eng<ene> a = a("single_pool_element", ene.b);
   eng<end> b = a("list_pool_element", end.a);
   eng<emz> c = a("feature_pool_element", emz.a);
   eng<emy> d = a("empty_pool_element", emy.a);
   eng<enc> e = a("legacy_single_pool_element", enc.a);

   MapCodec<P> codec();

   static <P extends enf> eng<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.ag, $$0, () -> $$1);
   }
}
