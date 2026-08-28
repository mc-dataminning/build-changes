import com.mojang.serialization.MapCodec;

public interface etw<P extends etv> {
   etw<etu> a = a("single_pool_element", etu.b);
   etw<ett> b = a("list_pool_element", ett.a);
   etw<etp> c = a("feature_pool_element", etp.a);
   etw<eto> d = a("empty_pool_element", eto.a);
   etw<ets> e = a("legacy_single_pool_element", ets.a);

   MapCodec<P> codec();

   static <P extends etv> etw<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.ag, $$0, () -> $$1);
   }
}
