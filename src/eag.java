import com.mojang.serialization.MapCodec;

public interface eag<P extends eaf> {
   eag<eal> a = a("matching_blocks", eal.a);
   eag<eak> b = a("matching_block_tag", eak.e);
   eag<eam> c = a("matching_fluids", eam.a);
   eag<eai> d = a("has_sturdy_face", eai.a);
   eag<eap> e = a("solid", eap.a);
   eag<eao> f = a("replaceable", eao.a);
   eag<eat> g = a("would_survive", eat.a);
   eag<eaj> h = a("inside_world_bounds", eaj.a);
   eag<eae> i = a("any_of", eae.a);
   eag<ead> j = a("all_of", ead.a);
   eag<ean> k = a("not", ean.a);
   eag<ear> l = a("true", ear.e);
   eag<eas> m = a("unobstructed", eas.a);

   MapCodec<P> codec();

   private static <P extends eaf> eag<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.M, $$0, () -> $$1);
   }
}
