import com.mojang.serialization.MapCodec;

public interface ebe<P extends ebd> {
   ebe<ebj> a = a("matching_blocks", ebj.a);
   ebe<ebi> b = a("matching_block_tag", ebi.e);
   ebe<ebk> c = a("matching_fluids", ebk.a);
   ebe<ebg> d = a("has_sturdy_face", ebg.a);
   ebe<ebn> e = a("solid", ebn.a);
   ebe<ebm> f = a("replaceable", ebm.a);
   ebe<ebr> g = a("would_survive", ebr.a);
   ebe<ebh> h = a("inside_world_bounds", ebh.a);
   ebe<ebc> i = a("any_of", ebc.a);
   ebe<ebb> j = a("all_of", ebb.a);
   ebe<ebl> k = a("not", ebl.a);
   ebe<ebp> l = a("true", ebp.e);
   ebe<ebq> m = a("unobstructed", ebq.a);

   MapCodec<P> codec();

   private static <P extends ebd> ebe<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.M, $$0, () -> $$1);
   }
}
