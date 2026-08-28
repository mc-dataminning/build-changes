import com.mojang.serialization.MapCodec;

public interface enr<P extends enq> {
   enr<enp> a = a("single_pool_element", enp.b);
   enr<eno> b = a("list_pool_element", eno.a);
   enr<enk> c = a("feature_pool_element", enk.a);
   enr<enj> d = a("empty_pool_element", enj.a);
   enr<enn> e = a("legacy_single_pool_element", enn.a);

   MapCodec<P> codec();

   static <P extends enq> enr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.ag, $$0, () -> $$1);
   }
}
