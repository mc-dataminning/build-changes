import com.mojang.serialization.MapCodec;

public interface etm<P extends etl> {
   etm<etk> a = a("single_pool_element", etk.b);
   etm<etj> b = a("list_pool_element", etj.a);
   etm<etf> c = a("feature_pool_element", etf.a);
   etm<ete> d = a("empty_pool_element", ete.a);
   etm<eti> e = a("legacy_single_pool_element", eti.a);

   MapCodec<P> codec();

   static <P extends etl> etm<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.ag, $$0, () -> $$1);
   }
}
