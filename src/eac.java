import com.mojang.serialization.Codec;

public interface eac<P extends eab> {
   eac<eah> a = a("matching_blocks", eah.a);
   eac<eag> b = a("matching_block_tag", eag.e);
   eac<eai> c = a("matching_fluids", eai.a);
   eac<eae> d = a("has_sturdy_face", eae.a);
   eac<eal> e = a("solid", eal.a);
   eac<eak> f = a("replaceable", eak.a);
   eac<eao> g = a("would_survive", eao.a);
   eac<eaf> h = a("inside_world_bounds", eaf.a);
   eac<eaa> i = a("any_of", eaa.a);
   eac<dzz> j = a("all_of", dzz.a);
   eac<eaj> k = a("not", eaj.a);
   eac<ean> l = a("true", ean.e);

   Codec<P> codec();

   private static <P extends eab> eac<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.O, $$0, () -> $$1);
   }
}
