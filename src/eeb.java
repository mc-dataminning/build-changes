import com.mojang.serialization.MapCodec;

public interface eeb<P extends eea> {
   eeb<eeg> a = a("matching_blocks", eeg.a);
   eeb<eef> b = a("matching_block_tag", eef.e);
   eeb<eeh> c = a("matching_fluids", eeh.a);
   eeb<eed> d = a("has_sturdy_face", eed.a);
   eeb<eek> e = a("solid", eek.a);
   eeb<eej> f = a("replaceable", eej.a);
   eeb<eeo> g = a("would_survive", eeo.a);
   eeb<eee> h = a("inside_world_bounds", eee.a);
   eeb<edz> i = a("any_of", edz.a);
   eeb<edy> j = a("all_of", edy.a);
   eeb<eei> k = a("not", eei.a);
   eeb<eem> l = a("true", eem.e);
   eeb<een> m = a("unobstructed", een.a);

   MapCodec<P> codec();

   private static <P extends eea> eeb<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.M, $$0, () -> $$1);
   }
}
