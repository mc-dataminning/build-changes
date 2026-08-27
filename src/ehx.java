import com.mojang.serialization.Codec;

public interface ehx<P extends ehw> {
   ehx<ehv> a = a("single_pool_element", ehv.b);
   ehx<ehu> b = a("list_pool_element", ehu.a);
   ehx<ehq> c = a("feature_pool_element", ehq.a);
   ehx<ehp> d = a("empty_pool_element", ehp.a);
   ehx<eht> e = a("legacy_single_pool_element", eht.a);

   Codec<P> codec();

   static <P extends ehw> ehx<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.ai, $$0, () -> $$1);
   }
}
