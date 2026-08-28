import com.mojang.serialization.MapCodec;

public interface elx<P extends elw> {
   elx<elv> a = a("single_pool_element", elv.b);
   elx<elu> b = a("list_pool_element", elu.a);
   elx<elq> c = a("feature_pool_element", elq.a);
   elx<elp> d = a("empty_pool_element", elp.a);
   elx<elt> e = a("legacy_single_pool_element", elt.a);

   MapCodec<P> codec();

   static <P extends elw> elx<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.ag, $$0, () -> $$1);
   }
}
