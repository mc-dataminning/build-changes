import com.mojang.serialization.Codec;

public interface dwh<P extends dwg> {
   dwh<dwf> a = a("single_pool_element", dwf.b);
   dwh<dwe> b = a("list_pool_element", dwe.a);
   dwh<dwa> c = a("feature_pool_element", dwa.a);
   dwh<dvz> d = a("empty_pool_element", dvz.a);
   dwh<dwd> e = a("legacy_single_pool_element", dwd.a);

   Codec<P> codec();

   static <P extends dwg> dwh<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ai, $$0, () -> $$1);
   }
}
