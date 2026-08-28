import com.mojang.serialization.MapCodec;

public interface emp<P extends emo> {
   emp<emn> a = a("single_pool_element", emn.b);
   emp<emm> b = a("list_pool_element", emm.a);
   emp<emi> c = a("feature_pool_element", emi.a);
   emp<emh> d = a("empty_pool_element", emh.a);
   emp<eml> e = a("legacy_single_pool_element", eml.a);

   MapCodec<P> codec();

   static <P extends emo> emp<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.ag, $$0, () -> $$1);
   }
}
