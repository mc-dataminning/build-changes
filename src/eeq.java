import com.mojang.serialization.MapCodec;

public interface eeq<P extends eep> {
   eeq<eev> a = a("matching_blocks", eev.a);
   eeq<eeu> b = a("matching_block_tag", eeu.e);
   eeq<eew> c = a("matching_fluids", eew.a);
   eeq<ees> d = a("has_sturdy_face", ees.a);
   eeq<eez> e = a("solid", eez.a);
   eeq<eey> f = a("replaceable", eey.a);
   eeq<efd> g = a("would_survive", efd.a);
   eeq<eet> h = a("inside_world_bounds", eet.a);
   eeq<eeo> i = a("any_of", eeo.a);
   eeq<een> j = a("all_of", een.a);
   eeq<eex> k = a("not", eex.a);
   eeq<efb> l = a("true", efb.e);
   eeq<efc> m = a("unobstructed", efc.a);

   MapCodec<P> codec();

   private static <P extends eep> eeq<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.M, $$0, () -> $$1);
   }
}
