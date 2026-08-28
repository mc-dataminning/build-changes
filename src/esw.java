import com.mojang.serialization.MapCodec;

public interface esw<P extends esv> {
   esw<esu> a = a("single_pool_element", esu.b);
   esw<est> b = a("list_pool_element", est.a);
   esw<esp> c = a("feature_pool_element", esp.a);
   esw<eso> d = a("empty_pool_element", eso.a);
   esw<ess> e = a("legacy_single_pool_element", ess.a);

   MapCodec<P> codec();

   static <P extends esv> esw<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.ag, $$0, () -> $$1);
   }
}
