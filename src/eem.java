import com.mojang.serialization.Codec;

public interface eem<P extends eel> {
   eem<eek> a = a("single_pool_element", eek.b);
   eem<eej> b = a("list_pool_element", eej.a);
   eem<eef> c = a("feature_pool_element", eef.a);
   eem<eee> d = a("empty_pool_element", eee.a);
   eem<eei> e = a("legacy_single_pool_element", eei.a);

   Codec<P> codec();

   static <P extends eel> eem<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.ai, $$0, () -> $$1);
   }
}
