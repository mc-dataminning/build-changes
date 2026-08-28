import com.mojang.serialization.MapCodec;

public interface eer<P extends eeq> {
   eer<eew> a = a("matching_blocks", eew.a);
   eer<eev> b = a("matching_block_tag", eev.e);
   eer<eex> c = a("matching_fluids", eex.a);
   eer<eet> d = a("has_sturdy_face", eet.a);
   eer<efa> e = a("solid", efa.a);
   eer<eez> f = a("replaceable", eez.a);
   eer<efe> g = a("would_survive", efe.a);
   eer<eeu> h = a("inside_world_bounds", eeu.a);
   eer<eep> i = a("any_of", eep.a);
   eer<eeo> j = a("all_of", eeo.a);
   eer<eey> k = a("not", eey.a);
   eer<efc> l = a("true", efc.e);
   eer<efd> m = a("unobstructed", efd.a);

   MapCodec<P> codec();

   private static <P extends eeq> eer<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.M, $$0, () -> $$1);
   }
}
