import com.mojang.serialization.MapCodec;

public interface etk<P extends etj> {
   etk<eti> a = a("single_pool_element", eti.b);
   etk<eth> b = a("list_pool_element", eth.a);
   etk<etd> c = a("feature_pool_element", etd.a);
   etk<etc> d = a("empty_pool_element", etc.a);
   etk<etg> e = a("legacy_single_pool_element", etg.a);

   MapCodec<P> codec();

   static <P extends etj> etk<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.ag, $$0, () -> $$1);
   }
}
