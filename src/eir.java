import com.mojang.serialization.MapCodec;

public interface eir<P extends eiq> {
   eir<eip> a = a("single_pool_element", eip.b);
   eir<eio> b = a("list_pool_element", eio.a);
   eir<eik> c = a("feature_pool_element", eik.a);
   eir<eij> d = a("empty_pool_element", eij.a);
   eir<ein> e = a("legacy_single_pool_element", ein.a);

   MapCodec<P> codec();

   static <P extends eiq> eir<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.ai, $$0, () -> $$1);
   }
}
