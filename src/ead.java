import com.mojang.serialization.MapCodec;

public interface ead<P extends eac> {
   ead<eai> a = a("matching_blocks", eai.a);
   ead<eah> b = a("matching_block_tag", eah.e);
   ead<eaj> c = a("matching_fluids", eaj.a);
   ead<eaf> d = a("has_sturdy_face", eaf.a);
   ead<eam> e = a("solid", eam.a);
   ead<eal> f = a("replaceable", eal.a);
   ead<eaq> g = a("would_survive", eaq.a);
   ead<eag> h = a("inside_world_bounds", eag.a);
   ead<eab> i = a("any_of", eab.a);
   ead<eaa> j = a("all_of", eaa.a);
   ead<eak> k = a("not", eak.a);
   ead<eao> l = a("true", eao.e);
   ead<eap> m = a("unobstructed", eap.a);

   MapCodec<P> codec();

   private static <P extends eac> ead<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.M, $$0, () -> $$1);
   }
}
