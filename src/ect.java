import com.mojang.serialization.Codec;

public interface ect<P extends ecs> {
   ect<ecr> a = a("single_pool_element", ecr.b);
   ect<ecq> b = a("list_pool_element", ecq.a);
   ect<ecm> c = a("feature_pool_element", ecm.a);
   ect<ecl> d = a("empty_pool_element", ecl.a);
   ect<ecp> e = a("legacy_single_pool_element", ecp.a);

   Codec<P> codec();

   static <P extends ecs> ect<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.ai, $$0, () -> $$1);
   }
}
