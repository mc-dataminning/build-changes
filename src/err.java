import com.mojang.serialization.MapCodec;

public interface err<P extends erq> {
   err<erp> a = a("single_pool_element", erp.b);
   err<ero> b = a("list_pool_element", ero.a);
   err<erk> c = a("feature_pool_element", erk.a);
   err<erj> d = a("empty_pool_element", erj.a);
   err<ern> e = a("legacy_single_pool_element", ern.a);

   MapCodec<P> codec();

   static <P extends erq> err<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.ag, $$0, () -> $$1);
   }
}
