import com.mojang.serialization.MapCodec;

public interface eex<P extends eew> {
   eex<efc> a = a("matching_blocks", efc.a);
   eex<efb> b = a("matching_block_tag", efb.e);
   eex<efd> c = a("matching_fluids", efd.a);
   eex<eez> d = a("has_sturdy_face", eez.a);
   eex<efg> e = a("solid", efg.a);
   eex<eff> f = a("replaceable", eff.a);
   eex<efk> g = a("would_survive", efk.a);
   eex<efa> h = a("inside_world_bounds", efa.a);
   eex<eev> i = a("any_of", eev.a);
   eex<eeu> j = a("all_of", eeu.a);
   eex<efe> k = a("not", efe.a);
   eex<efi> l = a("true", efi.e);
   eex<efj> m = a("unobstructed", efj.a);

   MapCodec<P> codec();

   private static <P extends eew> eex<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.M, $$0, () -> $$1);
   }
}
