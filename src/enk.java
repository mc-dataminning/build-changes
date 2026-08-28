import com.mojang.serialization.MapCodec;

public interface enk<P extends enj> {
   enk<eni> a = a("single_pool_element", eni.b);
   enk<enh> b = a("list_pool_element", enh.a);
   enk<end> c = a("feature_pool_element", end.a);
   enk<enc> d = a("empty_pool_element", enc.a);
   enk<eng> e = a("legacy_single_pool_element", eng.a);

   MapCodec<P> codec();

   static <P extends enj> enk<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.ag, $$0, () -> $$1);
   }
}
