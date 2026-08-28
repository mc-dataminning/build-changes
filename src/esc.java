import com.mojang.serialization.MapCodec;

public interface esc<P extends esb> {
   esc<esa> a = a("single_pool_element", esa.b);
   esc<erz> b = a("list_pool_element", erz.a);
   esc<erv> c = a("feature_pool_element", erv.a);
   esc<eru> d = a("empty_pool_element", eru.a);
   esc<ery> e = a("legacy_single_pool_element", ery.a);

   MapCodec<P> codec();

   static <P extends esb> esc<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.ag, $$0, () -> $$1);
   }
}
