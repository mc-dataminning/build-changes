import com.mojang.serialization.MapCodec;

public interface esk<P extends esj> {
   esk<esi> a = a("single_pool_element", esi.b);
   esk<esh> b = a("list_pool_element", esh.a);
   esk<esd> c = a("feature_pool_element", esd.a);
   esk<esc> d = a("empty_pool_element", esc.a);
   esk<esg> e = a("legacy_single_pool_element", esg.a);

   MapCodec<P> codec();

   static <P extends esj> esk<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.ag, $$0, () -> $$1);
   }
}
