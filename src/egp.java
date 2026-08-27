import com.mojang.serialization.Codec;

public interface egp<P extends ego> {
   egp<egn> a = a("single_pool_element", egn.b);
   egp<egm> b = a("list_pool_element", egm.a);
   egp<egi> c = a("feature_pool_element", egi.a);
   egp<egh> d = a("empty_pool_element", egh.a);
   egp<egl> e = a("legacy_single_pool_element", egl.a);

   Codec<P> codec();

   static <P extends ego> egp<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.ai, $$0, () -> $$1);
   }
}
