import com.mojang.serialization.MapCodec;

public interface eew<P extends eev> {
   eew<efb> a = a("matching_blocks", efb.a);
   eew<efa> b = a("matching_block_tag", efa.e);
   eew<efc> c = a("matching_fluids", efc.a);
   eew<eey> d = a("has_sturdy_face", eey.a);
   eew<eff> e = a("solid", eff.a);
   eew<efe> f = a("replaceable", efe.a);
   eew<efj> g = a("would_survive", efj.a);
   eew<eez> h = a("inside_world_bounds", eez.a);
   eew<eeu> i = a("any_of", eeu.a);
   eew<eet> j = a("all_of", eet.a);
   eew<efd> k = a("not", efd.a);
   eew<efh> l = a("true", efh.e);
   eew<efi> m = a("unobstructed", efi.a);

   MapCodec<P> codec();

   private static <P extends eev> eew<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.M, $$0, () -> $$1);
   }
}
