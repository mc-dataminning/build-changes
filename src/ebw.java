import com.mojang.serialization.MapCodec;

public interface ebw<P extends ebv> {
   ebw<ecb> a = a("matching_blocks", ecb.a);
   ebw<eca> b = a("matching_block_tag", eca.e);
   ebw<ecc> c = a("matching_fluids", ecc.a);
   ebw<eby> d = a("has_sturdy_face", eby.a);
   ebw<ecf> e = a("solid", ecf.a);
   ebw<ece> f = a("replaceable", ece.a);
   ebw<ecj> g = a("would_survive", ecj.a);
   ebw<ebz> h = a("inside_world_bounds", ebz.a);
   ebw<ebu> i = a("any_of", ebu.a);
   ebw<ebt> j = a("all_of", ebt.a);
   ebw<ecd> k = a("not", ecd.a);
   ebw<ech> l = a("true", ech.e);
   ebw<eci> m = a("unobstructed", eci.a);

   MapCodec<P> codec();

   private static <P extends ebv> ebw<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.M, $$0, () -> $$1);
   }
}
