import com.mojang.serialization.MapCodec;

public interface eey<P extends eex> {
   eey<efd> a = a("matching_blocks", efd.a);
   eey<efc> b = a("matching_block_tag", efc.e);
   eey<efe> c = a("matching_fluids", efe.a);
   eey<efa> d = a("has_sturdy_face", efa.a);
   eey<efh> e = a("solid", efh.a);
   eey<efg> f = a("replaceable", efg.a);
   eey<efl> g = a("would_survive", efl.a);
   eey<efb> h = a("inside_world_bounds", efb.a);
   eey<eew> i = a("any_of", eew.a);
   eey<eev> j = a("all_of", eev.a);
   eey<eff> k = a("not", eff.a);
   eey<efj> l = a("true", efj.e);
   eey<efk> m = a("unobstructed", efk.a);

   MapCodec<P> codec();

   private static <P extends eex> eey<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.M, $$0, () -> $$1);
   }
}
