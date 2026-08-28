import com.mojang.serialization.MapCodec;

public interface epm<P extends epl> {
   epm<epk> a = a("single_pool_element", epk.b);
   epm<epj> b = a("list_pool_element", epj.a);
   epm<epf> c = a("feature_pool_element", epf.a);
   epm<epe> d = a("empty_pool_element", epe.a);
   epm<epi> e = a("legacy_single_pool_element", epi.a);

   MapCodec<P> codec();

   static <P extends epl> epm<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.ag, $$0, () -> $$1);
   }
}
