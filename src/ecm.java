import com.mojang.serialization.Codec;

public interface ecm<P extends ecl> {
   ecm<eck> a = a("single_pool_element", eck.b);
   ecm<ecj> b = a("list_pool_element", ecj.a);
   ecm<ecf> c = a("feature_pool_element", ecf.a);
   ecm<ece> d = a("empty_pool_element", ece.a);
   ecm<eci> e = a("legacy_single_pool_element", eci.a);

   Codec<P> codec();

   static <P extends ecl> ecm<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.ai, $$0, () -> $$1);
   }
}
