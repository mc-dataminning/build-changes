import com.mojang.serialization.MapCodec;

public interface eml<P extends emk> {
   eml<emj> a = a("single_pool_element", emj.b);
   eml<emi> b = a("list_pool_element", emi.a);
   eml<eme> c = a("feature_pool_element", eme.a);
   eml<emd> d = a("empty_pool_element", emd.a);
   eml<emh> e = a("legacy_single_pool_element", emh.a);

   MapCodec<P> codec();

   static <P extends emk> eml<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.ag, $$0, () -> $$1);
   }
}
