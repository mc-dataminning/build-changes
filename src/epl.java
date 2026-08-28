import com.mojang.serialization.MapCodec;

public interface epl<P extends epk> {
   epl<epj> a = a("single_pool_element", epj.b);
   epl<epi> b = a("list_pool_element", epi.a);
   epl<epe> c = a("feature_pool_element", epe.a);
   epl<epd> d = a("empty_pool_element", epd.a);
   epl<eph> e = a("legacy_single_pool_element", eph.a);

   MapCodec<P> codec();

   static <P extends epk> epl<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.ag, $$0, () -> $$1);
   }
}
